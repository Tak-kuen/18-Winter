package p386;

import java.awt.*;
import javax.swing.*;
public class GridLayoutPractice extends JFrame {
	public GridLayoutPractice() {
		setTitle("BorderLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		
		add(new JButton("Button1"),BorderLayout.NORTH);
		add(new JButton("Button2"),BorderLayout.SOUTH);
		add(new JButton("Button3"),BorderLayout.EAST);
		add(new JButton("B4"),BorderLayout.WEST);
		add(new JButton("Long Button5"),BorderLayout.CENTER);
		
		pack();
		setVisible(true);
	}
}
