package com.prac;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Prac1 extends JFrame{
	
	Prac1()
	{
		setTitle("ѧ������ϵͳ");				//���ô������
		setSize(500, 400);					//���ô����С
		setLocationRelativeTo(null);		//���ô������
		setResizable(false);				//���ô��岻�ܸı��С
		//setDefaultCloseOperation(EXIT_ON_CLOSE);//�������ֱ�ӵ���رյ�ʱ��ر�
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		//���ô����ڵ���رյ�ʱ��ʲô�����ɣ�ֻ����һ������
		
		//��ӹر�ʱ�䣬ʹ�ùر��¼��Ķ���
		
		
		
		
		/*
		//��ӹر��¼���ʹ���¼�����������û��ʹ�ü�����ģʽ
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
				int n = JOptionPane.showConfirmDialog(null, "", "�˳��Ի���ô", JOptionPane.YES_NO_OPTION );
				System.out.println(n);				//������һ�£��ǵ�ʱ�򷵻�0 ���ʱ�򷵻�1
				if(n == 0)
					System.exit(0);				//�˳���ǰ���������0,��ʾ����������ֹ
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
