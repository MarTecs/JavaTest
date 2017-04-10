package com.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.persistence.Cache;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class AddEmpView extends JDialog {

	private JLabel genderJLabel = new JLabel("性别");
	private JRadioButton maleButton = new JRadioButton("男");
	private JRadioButton femaleButton = new JRadioButton("女");

	private JLabel birthdayJLabel = new JLabel("出生日期");
	private JComboBox<Integer> yearBox = new JComboBox<Integer>();
	private JComboBox<Integer> monthBox = new JComboBox<Integer>();
	private JComboBox<Integer> dayBox = new JComboBox<Integer>();

	private JLabel telLabel = new JLabel("联系电话");
	private JTextField telField = new JTextField();
	private JLabel checktelJLabel = new JLabel();

	private JLabel idJLabel = new JLabel("身份证号码");
	private JTextField idField = new JTextField();
	private JLabel checkidJLabel = new JLabel();

	private JButton addButton = new JButton("添加");

	public AddEmpView() {

		setTitle("新增员工");
		setSize(800, 500);
		setLocationRelativeTo(null);
		setLayout(null);

		setModal(true);// 设置为模式对话框

		genderJLabel.setBounds(40, 50, 80, 20);
		maleButton.setBounds(130, 50, 60, 20);
		femaleButton.setBounds(210, 50, 60, 20);

		birthdayJLabel.setBounds(40, 90, 80, 20);
		yearBox.setBounds(140, 90, 80, 20);
		monthBox.setBounds(260, 90, 80, 20);
		dayBox.setBounds(380, 90, 80, 20);

		telLabel.setBounds(40, 130, 80, 20);
		telField.setBounds(140, 130, 100, 20);
		checktelJLabel.setBounds(260, 130, 40, 20);

		idJLabel.setBounds(40, 170, 80, 20);
		idField.setBounds(140, 170, 200, 20);
		checkidJLabel.setBounds(360, 170, 40, 20);

		addButton.setBounds(400, 400, 60, 20);

		add(genderJLabel);
		add(maleButton);
		add(femaleButton);
		add(birthdayJLabel);
		add(yearBox);
		add(monthBox);
		add(dayBox);

		add(telField);
		add(telLabel);
		add(checktelJLabel);

		add(idField);   
		add(idJLabel);
		add(checkidJLabel);

		add(addButton);

		idField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String id = idField.getText();

				String regex = "^\\d{17}[0-9xX]$";
				Pattern pattern = Pattern.compile(regex);
				Matcher matcher = pattern.matcher(id);
				if (matcher.find()) {
					checkidJLabel.setText("√");
				} else {
					checkidJLabel.setText("×");
				}

			}
		});

		telField.addKeyListener(new KeyAdapter() {

			@Override
			public void keyReleased(KeyEvent e) {

				String tel = telField.getText();

				String regex = "^1[34578][0-9]\\d{8}$";
				Pattern pattern = Pattern.compile(regex);
				Matcher matcher = pattern.matcher(tel);
				System.out.println(matcher.find());
				if (matcher.find()) {
					checktelJLabel.setText("√");
				} else {
					checktelJLabel.setText("×");
				}

			}
		});

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

		addButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String id = checkidJLabel.getText();
				String tel = checktelJLabel.getText();
				
				if(!(id.equals("√") && tel.equals("√"))){
					JOptionPane.showMessageDialog(null, "请检测格式");
					return ;
				}
				
				JOptionPane.showMessageDialog(null, "yes");
				
				

			}
		});

		setVisible(true);

	}

	public static void main(String[] args) {
		new AddEmpView();
	}

}
