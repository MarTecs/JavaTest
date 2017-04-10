package com.prac;

import java.awt.event.WindowAdapter;

import javax.swing.JOptionPane;

public class WindowOnClosingListener extends WindowAdapter{
	public WindowOnClosingListener() {
		// TODO Auto-generated constructor stub
		int n = JOptionPane.showConfirmDialog(null, "确认要退出么？","确认",JOptionPane.YES_NO_OPTION);
		if( n == 0)
			System.exit(0);
	}

}
