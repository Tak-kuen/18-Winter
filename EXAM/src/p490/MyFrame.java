package p490;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel extends JPanel {
	BufferedImage img =null;
	int img_x = 0, img_y = 0;

	public MyPanel() {
		try {
			img = ImageIO.read(new File("c:\\intel.gif"));
		} catch(IOException ee) {
			System.out.println("no image");
			System.exit(1);
		}
		addMouseListener(new MouseListener() {
			public void mousePressed(MouseEvent e) {
				img_x = e.getX();
				img_y = e.getY();
				repaint();
			}
			public void mouseClicked(MouseEvent e) {}
			public void mouseReleased(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {}
			public void mouseExited(MouseEvent e) {}
		});
	}
	
public void paintComponent(Graphics g) {
	super.paintComponent(g);
	g.drawImage(img, img_x, img_y, null);
	}
}

public class MyFrame extends JFrame {
	public MyFrame() {
		add(new MyPanel());
		setSize(600,600);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFrame();
	}
}
