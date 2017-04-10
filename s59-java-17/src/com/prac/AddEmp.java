package com.prac;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.listener.WindowClosingListener;

public class AddEmp extends JDialog{

	private JLabel empGender = new JLabel("性别");
	//注意使用单选框，必须将单选框编成一组，因为一组以后才可以实现单选，否则随便乱点
	private JLabel empBirthDate = new JLabel("出生日期");
	//出生日期一般建议使用一些日历控件，老师这里讲了下拉框，实现
	private JLabel empTel = new JLabel("联系电话");
	private JLabel empIdCard = new JLabel("身份证号码");
	//身份证号码和联系电话都使用正则表达式来进行验证，尤其注意正则表达式
	//的规范
	
	private JLabel check_empTel = new  JLabel();
	private JLabel check_empIdCard = new JLabel();
	private JCheckBox maleBox = new JCheckBox("男");
	private JCheckBox femaleBox = new JCheckBox("女");
	
	private JTextField empTelTextField = new JTextField();
	private JTextField empIdCardTextField = new JTextField();
	
	private JComboBox<Integer> yearOfBirthDate = new JComboBox<Integer>();
	private JComboBox<Integer> monthOfBirthDate = new JComboBox<Integer>();
	private JComboBox<Integer> dayOfBirthDate = new JComboBox<Integer>();
	
	
	public AddEmp() {
		// TODO Auto-generated constructor stub
		this.setTitle("添加员工");
		this.setSize(500, 400);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setLayout(null);
		
		ButtonGroup group = new ButtonGroup();
		group.add(maleBox);
		group.add(femaleBox);
		
		empGender.setBounds(50, 50, 60, 30);
		maleBox.setBounds(140, 50, 60, 30);
		femaleBox.setBounds(230, 50, 60, 30);
		empBirthDate.setBounds(50, 90, 60, 30);
		yearOfBirthDate.setBounds(140, 90, 90, 30);
		monthOfBirthDate.setBounds(230, 90, 90, 30);
		dayOfBirthDate.setBounds(320, 90, 90, 30);
		empTel.setBounds(50, 130, 60, 30);
		empTelTextField.setBounds(150, 130, 100, 30);
		check_empTel.setBounds(270, 130, 50, 30);
		empIdCard.setBounds(50, 170, 80, 30);
		empIdCardTextField.setBounds(150, 170, 100, 30);
		check_empIdCard.setBounds(270, 130, 50, 30);
		
		
		
		//先用正则表达式把身份证号码和手机号进行正则匹配
		empTelTextField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
				String emptel = empTelTextField.getText();
				String regex = "^1[34578]\\d[9]$";
				//^1[34578][0-9]\\d{8}$
				Pattern pattern = Pattern.compile(regex);
				Matcher matcher = pattern.matcher(emptel);
				
				//如果找到了匹配的
				if(matcher.find())
					check_empTel.setText("√");
				else
					check_empTel.setText("×");
			}
		});
		
		
		this.add(empGender);
		this.add(maleBox);
		this.add(femaleBox);
		this.add(empBirthDate);
		this.add(yearOfBirthDate);
		this.add(monthOfBirthDate);
		this.add(dayOfBirthDate);
		this.add(empTel);
		this.add(empTelTextField);
		this.add(empIdCard);
		this.add(empIdCardTextField);
		this.add(check_empTel);
		this.add(check_empIdCard);
		
		this.addWindowListener(new WindowClosingListener());
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new AddEmp();
		
	}
}
