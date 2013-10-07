package com.base.school.gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TestPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	JButton button;

	public TestPanel()
	{
		setPreferredSize(new Dimension(800, 600));
		build();
	}
	
	private void build()
	{
		button = new JButton("Test");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showConfirmDialog(TestPanel.this, "Message", "Title", JOptionPane.PLAIN_MESSAGE);
			}
		});
		this.add(button);
	}
}
