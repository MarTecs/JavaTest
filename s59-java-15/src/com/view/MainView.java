package com.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MainView extends JFrame {

	private JMenuBar bar = new JMenuBar();

	private JMenu depJMenu = new JMenu("部门管理");
	private JMenuItem adddepItem = new JMenuItem("添加部门");
	private JMenuItem querydepItem = new JMenuItem("查看部门");

	private JMenu empJMenu = new JMenu("员工管理");
	private JMenuItem addempItem = new JMenuItem("添加员工");
	private JMenuItem queryempItem = new JMenuItem("查看员工");

	private JMenu systemJMenu = new JMenu("系统设置");
	private JMenuItem updatepasswordItem = new JMenuItem("修改密码");

	public MainView(final String username) {
		// 设置标题
		setTitle("欢迎:" + username);
		// 设置大小
		setSize(800, 600);
		// 设置居中
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
