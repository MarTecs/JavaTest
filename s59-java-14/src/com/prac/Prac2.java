package com.prac;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.plaf.OptionPaneUI;

public class Prac2 extends JFrame{

	//��������JLabel�ؼ�
	private JLabel usernameJLabel = new JLabel("�û�����");
	private JLabel passwordJLabel = new JLabel("��    �룺");
	
	
	//�������JTextField�ؼ�
	private JTextField usernameJTextField = new JTextField();
	private JTextField passwordJTextField = new JPasswordField();
	
	//�������JButton��ť
	private JButton loginButton = new JButton("��¼");
	private JButton resetButton = new JButton("����");
	
	/**
	 * 
	 */
	Prac2()
	{
		
		
		setTitle("ѧ������ϵͳ");				//���ô������
		setSize(300, 200);					//���ô����͸�
		setLocationRelativeTo(null);		//���ô������
		setResizable(false);   				//���ô��岻�ܸı��С
		//��Ϊ����Ĭ�ϵ���رջ����أ������������д��Ϊ�˲��ô��������������Ӷ����ǿ��Զ������йر�
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);		
		
		//��Ӽ������¼�
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e)
			{
			//��һ�������� null �ڶ��������ǶԻ������ݣ������������ǶԻ������
			 int n = JOptionPane.showConfirmDialog(null, "ȷ��Ҫ�˳�ô","�˳�",JOptionPane.YES_NO_OPTION);
			 //System.out.println(n);						//�Ƿ���0 �񷵻�1
			 if(n == 0)
				 System.exit(0);
			}
		});
		
		//��������ˣ�׼����ӿؼ������ȵ���ȷ�����ؼ�����������һ��ʹ��null���֣�Ҳ���Ǿ��Բ���
		setLayout(null);
		
		//���ø��������λ��
		usernameJLabel.setBounds(40,30,60,30);
		passwordJLabel.setBounds(40, 70, 60, 30);
		usernameJTextField.setBounds(120, 30, 150, 30);
		passwordJTextField.setBounds(120, 70, 150, 30);
		loginButton.setBounds(40, 120, 80, 30);
		resetButton.setBounds(180, 120, 80, 30);
		
		add(usernameJLabel);
		add(passwordJLabel);
		add(usernameJTextField);
		add(passwordJTextField);
		add(loginButton);
		add(resetButton);
		resetButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				usernameJTextField.setText("");
				passwordJTextField.setText("");
			}
		});
		loginButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try{
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				Connection conn = DriverManager.getConnection("jdbc:sqlserver://127.0.0.1:1433;DatabaseName=s59","sa","1018222wxw");
				String sql = "SELECT username,password from students where username = ? and password = ?";
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setObject(1, passwordJTextField.getText());
				ps.setObject(2, passwordJTextField.getText());
				ResultSet rs = ps.executeQuery();
				if(rs.next())
					{
						JOptionPane.showMessageDialog(null, "ȷ��","��¼�ɹ�",JOptionPane.CLOSED_OPTION);
						Prac2.this.dispose();
					}
				}catch(Exception e1)
				{
					e1.printStackTrace();
				}
			}
		});
		setVisible(true);					//���ô���ɼ�
	}
	
	public static void main(String[] args) {
		new Prac2();
	}
}
