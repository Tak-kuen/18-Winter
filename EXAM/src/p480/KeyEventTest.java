package p480;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class KeyEventTest extends JFrame implements KeyListener {
	private JPanel panel1;
	private JPanel panel2;
	private JTextField field;
	private JTextArea area;
	private JScrollPane scroll;
	
	public KeyEventTest() {
		panel1= new JPanel(new GridLayout(0,2));
		panel1.add(new JLabel("문자를 입력하세요 : "));
		
		field = new JTextField(10);
		panel1.add(field);
		
		area = new JTextArea(20,45);
		area.setEditable(false);
		panel2= new JPanel();
		scroll = new JScrollPane(area);
		panel2.add(scroll);
		
		add(panel1, BorderLayout.NORTH);
		add(panel2, BorderLayout.CENTER);
		
		field.addKeyListener(this);
		setTitle("KeyEvent Test");
		setSize(550,500);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new KeyEventTest();
	}
	
	public void keyTyped(KeyEvent e) {
		display(e, "Key Typed                ");
	}
	
	public void keyPressed(KeyEvent e) {
		display(e, "Key Pressed           ");
	}
	
	public void keyReleased(KeyEvent e) {
		display(e, "Key Released         ");
	}
	
	protected void display(KeyEvent e, String s) {
		char c = e.getKeyChar();
		int keyCode = e.getKeyCode();
		String modifiers = "Alt: " + e.isAltDown() + " Ctrl: " + e.isControlDown() + 
				" Shift: " + e.isShiftDown();
		area.append(" " + s + "문자 " + c + " (코드 : " + keyCode + ") " +
				modifiers + "\n");
	}
}
