package com.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Cache;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class AddEmpView extends JDialog {

	private JLabel genderJLabel = new JLabel("性别");
	private JRadioButton maleButton = new JRadioButton("男");
	private JRadioButton femaleButton = new JRadioButton("女");

	private JLabel birthdayJLabel = new JLabel("出生日期");
	private JComboBox<Integer> yearBox = new JComboBox<Integer>();
	private JComboBox<Integer> monthBox = new JComboBox<Integer>();
	private JComboBox<Integer> dayBox = new JComboBox<Integer>();

	public AddEmpView() {

		setTitle("新增员工");
		setSize(800, 500);
		setLocationRelativeTo(null);
		setLayout(null);

		setModal(true);// 设置为模式对话框

		genderJLabel.setBounds(40, 50, 80, 20);
		maleButton.setBounds(130, 50, 60, 20);
		femaleButton.setBounds(210, 50, 60, 20);

		birthdayJLabel.setBounds(40, 100, 80, 20);
		yearBox.setBounds(140, 100, 80, 20);
		monthBox.setBounds(260, 100, 80, 20);
		dayBox.setBounds(380, 100, 80, 20);

		add(genderJLabel);
		add(maleButton);
		add(femaleButton);
		add(birthdayJLabel);
		add(yearBox);
		add(monthBox);
		add(dayBox);

		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(maleButton);
		buttonGroup.add(femaleButton);

		maleButton.setSelected(true);

		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int year = calendar.get(Calendar.YEAR);

		for (int i = year - 16; i > year - 60; i--) {
			yearBox.addItem(i);
		}

		for (int i = 1; i <= 12; i++) {
			monthBox.addItem(i);
		}

		for (int i = 1; i <= 31; i++) {
			dayBox.addItem(i);
		}

		monthBox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int month = (Integer) monthBox.getSelectedItem();

				if (month == 1 || month == 3 || month == 5 || month == 7
						|| month == 8 || month == 10 || month == 12) {

					dayBox.removeAllItems();

					for (int i = 1; i <= 31; i++) {
						dayBox.addItem(i);
					}

				}

				if (month == 4 || month == 6 || month == 9 || month == 11) {

					dayBox.removeAllItems();

					for (int i = 1; i <= 30; i++) {
						dayBox.addItem(i);
					}

				}

				if (month == 2) {

					int year = (Integer) yearBox.getSelectedItem();
					dayBox.removeAllItems();
					if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {

						for (int i = 1; i <= 29; i++) {
							dayBox.addItem(i);
						}

					} else {
						for (int i = 1; i <= 28; i++) {
							dayBox.addItem(i);
						}
					}

				}

			}
		});

		yearBox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int month = (Integer) monthBox.getSelectedItem();
				if (month == 2) {
					int year = (Integer) yearBox.getSelectedItem();
					dayBox.removeAllItems();
					if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {

						for (int i = 1; i <= 29; i++) {
							dayBox.addItem(i);
						}

					} else {
						for (int i = 1; i <= 28; i++) {
							dayBox.addItem(i);
						}

					}
				}
			}
		});

		setVisible(true);

	}

	public static void main(String[] args) {
		new AddEmpView();
	}

}
