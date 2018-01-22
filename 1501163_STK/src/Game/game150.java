package Game;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.*;
import java.text.SimpleDateFormat;

import javax.swing.*;

public class game150 {
	public static void main(String[] ar) {
		MainFrame mf = new MainFrame();
	}
}

class MainFrame extends JFrame implements ActionListener,MouseListener, Runnable {

	private JLabel titleLabel = new JLabel();			//����Ÿ��Ʋǥ�ÿ��
	private JLabel timeLabel = new JLabel();			//�ð�ǥ�ÿ��
	private JLabel nextNumLabel = new JLabel();			//���� ������������ �����ִ� ��
	private JButton startBtn = new JButton("START");	//���ӽ��۹�ư
	private JButton resetBtn = new JButton("RESET");	//���Ӹ��¹�ư
	private JButton scoreBtn = new JButton("SCORE");
	private JMenuBar mb = new JMenuBar();
	JMenu screenMenu = new JMenu("Screen");
	JMenuItem refresh = new JMenuItem("Refresh");
	JMenuItem exit = new JMenuItem("Exit");
	
	
	
	SimpleDateFormat timeFormat;						//�ð�������ȯ�ϱ���������
	String showTime, fasterTime;						//����ð������޾Ƶ��Ϲ��ڿ�
	long startTime, currentTime, actualTime;			//���ӽ��۽ð�, ��ǻ�ͽð�, ������������ð�
	boolean timeRun = false;
	Thread thread;
	ImagePanel gameNum;
	HighScore hs;
	
	MainFrame() {		//������
	init();
	start();
	setTitle("1 to 50 Game");
	setSize(600, 650);
	mb.add(screenMenu);
	screenMenu.add(refresh);
	screenMenu.addSeparator();
	screenMenu.add(exit);
	refresh.addActionListener(this);
	exit.addActionListener(this);
	this.setJMenuBar(mb);

	Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
	int xpos = (int) (screen.getWidth() / 2 - getWidth() / 2);
	int ypos = (int) (screen.getHeight() / 2 - getHeight() / 2);
	setLocation(xpos, ypos);
	setResizable(false);
	setVisible(true);
	}

	public void init() {
		//���Ӷ�, ��ư�װ���ȭ����гμ���

		Container con = this.getContentPane();
		con.setLayout(null);
		
		nextNumLabel.setBounds(100,50, 150, 30);
		nextNumLabel.setFont(new Font("Malgun Gothic", Font.BOLD, 20));
		con.add(nextNumLabel);
		
		titleLabel.setBounds(250, 10, 300, 30);
		titleLabel.setFont(new Font("Malgun Gothic", Font.BOLD, 20));
		con.add(titleLabel);
		
		timeLabel.setBounds(400, 50, 150, 30);
		timeLabel.setFont(new Font("Malgun Gothic", Font.BOLD, 20));
		con.add(timeLabel);
		//�����ӿ�ǥ�����ؽ�Ʈ��
		
		startBtn.setBounds(100, 520, 100, 30);
		startBtn.setFont(new Font("Malgun Gothic", Font.BOLD, 20));
		con.add(startBtn);

		resetBtn.setBounds(250, 520, 100, 30);
		resetBtn.setFont(new Font("Malgun Gothic", Font.BOLD, 20));
		con.add(resetBtn);
		
		scoreBtn.setBounds(400, 520, 100, 30);
		scoreBtn.setFont(new Font("Malgun Gothic", Font.BOLD, 20));
		con.add(scoreBtn);
		//�����ӿ�ǥ���Ұ��ӽ��۹׸��¹�ư

		gameNum = new ImagePanel();
		gameNum.setBounds(100, 100, 410, 410);
		con.add(gameNum);
		//����ȭ����г�
	}

	public void start() {	//�����ӳ������ų�⺻����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.addMouseListener(this);
		//�����ӳ����콺����Ȱ��ȭ
		startBtn.addMouseListener(this);
		resetBtn.addMouseListener(this);
		scoreBtn.addMouseListener(this);
		nextNumLabel.setText("���� ���� : " + gameNum.nextNum);
		thread = new Thread(this);
		thread.start();
		timeFormat = new SimpleDateFormat("HH:mm:ss.SSS");
		timeLabel.setText("00:00:00.000");
		titleLabel.setText("1 to 50 Game");
		gameNum.gameStart(false);
	}

	public void run() {
		while (true) {
			try {
				repaint();
				TimeCheck();
				Thread.sleep(15);
				nextNumLabel.setText("���� ���� : " + gameNum.nextNum);
			} catch (Exception e) {
			}
		}
	}

	public void TimeCheck() {
		if (timeRun) {
			currentTime = System.currentTimeMillis();
			actualTime = currentTime - startTime;
			gameNum.countDown((int) actualTime / 1000);
			
			if (!gameNum.game_start && gameNum.check <= 50) {
				//���Ӽ��ÿϷ��İ��ӽ��۵Ǹ��������ð�����
				showTime = timeFormat.format(actualTime - 32403000);
				timeLabel.setText(showTime);
			}
		}

		if ( gameNum.check > 50){
			fasterTime=timeLabel.getText();
			gameNum.ClearTime(fasterTime);
			
			//����50����Ŭ���̳��������Ŭ����޼�������غ�
		}
	}

	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == startBtn) {
			//���ӽ��۹�ư
			if (!timeRun && !gameNum.game_start ) {
				startTime = System.currentTimeMillis();
				gameNum.rect_select.clear();
				timeRun = true;
				gameNum.gameStart(true);
			}
		}
		else if (e.getSource() == resetBtn) {
			//�����ʱ�ȭ��ư
			startTime = 0;
			timeLabel.setText("00:00:00.000");
			gameNum.rect_select.clear();
			gameNum.countDown(0);
			timeRun = false;
			gameNum.gameStart(false);
			gameNum.check = 0;
			//�����ʱ�ȭ
		}
		else if (e.getSource() == scoreBtn) {
			hs = new HighScore();
			hs.scorenum.setText(gameNum.getTime());
		}
	}

	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		switch(cmd) {
			case("Refresh"):
				MainFrame mf = new MainFrame();
				break;
			case("Exit"):
				System.exit(0);
				break;
		}
	}
}

