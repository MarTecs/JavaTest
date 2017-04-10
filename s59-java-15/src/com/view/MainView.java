package com.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MainView extends JFrame {

	private JMenuBar bar = new JMenuBar();

	private JMenu depJMenu = new JMenu("���Ź���");
	private JMenuItem adddepItem = new JMenuItem("��Ӳ���");
	private JMenuItem querydepItem = new JMenuItem("�鿴����");

	private JMenu empJMenu = new JMenu("Ա������");
	private JMenuItem addempItem = new JMenuItem("���Ա��");
	private JMenuItem queryempItem = new JMenuItem("�鿴Ա��");

	private JMenu systemJMenu = new JMenu("ϵͳ����");
	private JMenuItem updatepasswordItem = new JMenuItem("�޸�����");

	public MainView(final String username) {
		// ���ñ���
		setTitle("��ӭ:" + username);
		// ���ô�С
		setSize(800, 600);
		// ���þ���
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);

		bar.setBounds(0, 0, 800, 20);

		bar.add(depJMenu);
		bar.add(empJMenu);
		bar.add(systemJMenu);

		depJMenu.add(adddepItem);
		depJMenu.add(querydepItem);

		empJMenu.add(addempItem);
		empJMenu.add(queryempItem);

		systemJMenu.add(updatepasswordItem);

		add(bar);
		updatepasswordItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				new UpdatePasswordView(username);

			}
		});

		setVisible(true);

	}

}
