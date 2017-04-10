package com.prac;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Prac1 extends JFrame{
	
	Prac1()
	{
		setTitle("学生管理系统");				//设置窗体标题
		setSize(500, 400);					//设置窗体大小
		setLocationRelativeTo(null);		//设置窗体居中
		setResizable(false);				//设置窗体不能改变大小
		//setDefaultCloseOperation(EXIT_ON_CLOSE);//这里可以直接点击关闭的时候关闭
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		//设置窗体在点击关闭的时候，什么都不干，只返回一个整数
		
		//添加关闭时间，使用关闭事件的对象
		
		
		
		
		/*
		//添加关闭事件，使用事件监听器，并没有使用监听器模式
		addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				int n = JOptionPane.showConfirmDialog(null, "", "退出对话框么", JOptionPane.YES_NO_OPTION );
				System.out.println(n);				//测试了一下，是的时候返回0 否的时候返回1
				if(n == 0)
					System.exit(0);				//退出当前程序，如果是0,表示程序正常终止
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		*/
		
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		JFrame jframe = new Prac1();
	}
}
