package com.listener;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

public class WindowClosingListener extends WindowAdapter {

	@Override
	public void windowClosing(WindowEvent e) {
		int n = JOptionPane.showConfirmDialog(null, "真的要退出吗?", "退出",
				JOptionPane.YES_NO_OPTION);
		if (n == 0) {
			System.exit(0);
		}

	}
}
