package com.base.school.gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Gui {
	public static final void process() {
		JFrame frame = new JFrame("Test");
		JPanel panel = new TestPanel();
		frame.setResizable(false);
		frame.add(panel);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
