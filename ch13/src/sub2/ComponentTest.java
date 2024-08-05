package sub2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.JFormattedTextField;

public class ComponentTest extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUid;
	private JTextField txtName;
	private JTextField txtHp;
	private JTextField txtPlus1;
	private JTextField txtPlus2;
	private JTextField txtPlusResult;
	private JTextField txtMin1;
	private JTextField txtMin2;
	private JTextField txtMinResult;
	private JTextField txtMul1;
	private JTextField txtMul2;
	private JTextField txtMulResult;
	private JTextField txtDiv1;
	private JTextField txtDiv2;
	private JTextField txtDivResult;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponentTest frame = new ComponentTest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ComponentTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 541, 727);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("컴포넌트 실습");
		lblNewLabel.setBounds(88, 22, 76, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("버튼 실습");
		lblNewLabel_1.setBounds(88, 47, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		JButton btn1 = new JButton("확인1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				System.out.println("확인1 버튼 클릭...");
					
			}
		});
		btn1.setBounds(12, 72, 89, 28);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("확인2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "버튼2 클릭...");
				
			}
		});
		btn2.setBounds(113, 72, 89, 28);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("확인3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			int answer = JOptionPane.showConfirmDialog(null, "버튼3 클릭...", "확인대화상자", JOptionPane.YES_NO_OPTION);
			
			if (answer == 0) {
				System.out.println("Yes 클릭!");
			}else {
				System.out.println("No 클릭!");
			}
			
			}
		});
		btn3.setBounds(214, 72, 89, 28);
		contentPane.add(btn3);
		
		JLabel lblNewLabel_1_1 = new JLabel("텍스트필드 실습");
		lblNewLabel_1_1.setBounds(22, 110, 103, 15);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("아이디");
		lblNewLabel_2.setBounds(12, 138, 57, 15);
		contentPane.add(lblNewLabel_2);
		
		txtUid = new JTextField();
		txtUid.setBounds(74, 135, 116, 21);
		contentPane.add(txtUid);
		txtUid.setColumns(10);
		
		JLabel lbResultUid = new JLabel("결과 :");
		lbResultUid.setBounds(271, 138, 125, 15);
		contentPane.add(lbResultUid);
		
		JButton btnUid = new JButton("확인");
		btnUid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String uid = txtUid.getText();
				lbResultUid.setText("결과 : " + uid);
				
			}
		});
		btnUid.setBounds(190, 134, 65, 23);
		contentPane.add(btnUid);
		
		
		
		JLabel lblNewLabel_2_1 = new JLabel("이름");
		lblNewLabel_2_1.setBounds(12, 163, 57, 15);
		contentPane.add(lblNewLabel_2_1);
		
		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(74, 163, 116, 21);
		contentPane.add(txtName);
		
		JLabel lbResultName = new JLabel("결과 :");
		lbResultName.setBounds(271, 166, 125, 15);
		contentPane.add(lbResultName);
		
		JButton btnName = new JButton("확인");
		btnName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String uid = txtName.getText();
				lbResultName.setText("결과 : " + uid);
				
			}
		});
		btnName.setBounds(190, 162, 65, 23);
		contentPane.add(btnName);
		
		
		
		JLabel lblNewLabel_2_1_1 = new JLabel("휴대폰");
		lblNewLabel_2_1_1.setBounds(12, 197, 57, 15);
		contentPane.add(lblNewLabel_2_1_1);
		
		txtHp = new JTextField();
		txtHp.setColumns(10);
		txtHp.setBounds(74, 194, 116, 21);
		contentPane.add(txtHp);
		
		JLabel lbResultHp = new JLabel("결과 :");
		lbResultHp.setBounds(271, 197, 125, 15);
		contentPane.add(lbResultHp);
		
		JButton btnNewButton_1_1 = new JButton("확인");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String uid = txtHp.getText();
				lbResultHp.setText("결과 : " + uid);
			}
		});
		btnNewButton_1_1.setBounds(190, 193, 65, 23);
		contentPane.add(btnNewButton_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("덧셈");
		lblNewLabel_3.setBounds(12, 222, 57, 15);
		contentPane.add(lblNewLabel_3);
		
		txtPlus1 = new JTextField();
		txtPlus1.setBounds(74, 219, 65, 21);
		contentPane.add(txtPlus1);
		txtPlus1.setColumns(10);
		
		txtPlus2 = new JTextField();
		txtPlus2.setBounds(165, 219, 65, 21);
		contentPane.add(txtPlus2);
		txtPlus2.setColumns(10);
		
		JButton btnNewButton = new JButton("확인");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String strNum1 = txtPlus1.getText();
				String strNum2 = txtPlus2.getText();
				
				int num1 = Integer.parseInt(strNum1);
				int num2 = Integer.parseInt(strNum2);
				
				int intNum3 = num1 + num2;
				
				String num3 = ""+intNum3;
				
				txtPlusResult.setText(num3);
				
			}
		});
		btnNewButton.setBounds(331, 218, 97, 23);
		contentPane.add(btnNewButton);
		
		txtPlusResult = new JTextField();
		txtPlusResult.setBounds(254, 219, 65, 21);
		contentPane.add(txtPlusResult);
		txtPlusResult.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("+");
		lblNewLabel_4.setBounds(145, 222, 57, 15);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("=");
		lblNewLabel_5.setBounds(234, 222, 57, 15);
		contentPane.add(lblNewLabel_5);
		
		JCheckBox chk1 = new JCheckBox("서울");
		chk1.setBounds(10, 406, 76, 23);
		contentPane.add(chk1);
		
		JLabel lblNewLabel_6 = new JLabel("체크박스 실습");
		lblNewLabel_6.setBounds(12, 372, 103, 15);
		contentPane.add(lblNewLabel_6);
		
		JCheckBox chk2 = new JCheckBox("대전");
		chk2.setBounds(88, 406, 76, 23);
		contentPane.add(chk2);
		
		JCheckBox chk3 = new JCheckBox("대구");
		chk3.setBounds(179, 406, 76, 23);
		contentPane.add(chk3);
		
		JCheckBox chk4 = new JCheckBox("부산");
		chk4.setBounds(271, 406, 76, 23);
		contentPane.add(chk4);
		
		JCheckBox chk5 = new JCheckBox("광주");
		chk5.setBounds(366, 406, 76, 23);
		contentPane.add(chk5);
		
		JLabel lblNewLabel_3_1 = new JLabel("뺄셈");
		lblNewLabel_3_1.setBounds(12, 251, 57, 15);
		contentPane.add(lblNewLabel_3_1);
		
		txtMin1 = new JTextField();
		txtMin1.setColumns(10);
		txtMin1.setBounds(74, 248, 65, 21);
		contentPane.add(txtMin1);
		
		JLabel lblNewLabel_4_1 = new JLabel("-");
		lblNewLabel_4_1.setBounds(145, 251, 57, 15);
		contentPane.add(lblNewLabel_4_1);
		
		txtMin2 = new JTextField();
		txtMin2.setColumns(10);
		txtMin2.setBounds(165, 248, 65, 21);
		contentPane.add(txtMin2);
		
		JLabel lblNewLabel_5_1 = new JLabel("=");
		lblNewLabel_5_1.setBounds(234, 251, 57, 15);
		contentPane.add(lblNewLabel_5_1);
		
		txtMinResult = new JTextField();
		txtMinResult.setColumns(10);
		txtMinResult.setBounds(254, 248, 65, 21);
		contentPane.add(txtMinResult);
		
		JButton btnNewButton_1 = new JButton("확인");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String strNum1 = txtMin1.getText();
				String strNum2 = txtMin2.getText();
				
				int num1 = Integer.parseInt(strNum1);
				int num2 = Integer.parseInt(strNum2);
				
				int intNum3 = num1 - num2;
				
				String num3 = ""+intNum3;
				
				txtMinResult.setText(num3);
				
			}
		});
		btnNewButton_1.setBounds(331, 247, 97, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("곱셈");
		lblNewLabel_3_2.setBounds(12, 280, 57, 15);
		contentPane.add(lblNewLabel_3_2);
		
		txtMul1 = new JTextField();
		txtMul1.setColumns(10);
		txtMul1.setBounds(74, 277, 65, 21);
		contentPane.add(txtMul1);
		
		JLabel lblNewLabel_4_2 = new JLabel("*");
		lblNewLabel_4_2.setBounds(145, 280, 57, 15);
		contentPane.add(lblNewLabel_4_2);
		
		txtMul2 = new JTextField();
		txtMul2.setColumns(10);
		txtMul2.setBounds(165, 277, 65, 21);
		contentPane.add(txtMul2);
		
		JLabel lblNewLabel_5_2 = new JLabel("=");
		lblNewLabel_5_2.setBounds(234, 280, 57, 15);
		contentPane.add(lblNewLabel_5_2);
		
		txtMulResult = new JTextField();
		txtMulResult.setColumns(10);
		txtMulResult.setBounds(254, 277, 65, 21);
		contentPane.add(txtMulResult);
		
		JButton btnNewButton_2 = new JButton("확인");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String strNum1 = txtMul1.getText();
				String strNum2 = txtMul2.getText();
				
				String n3 = strNum1 + strNum2;
				
				int num1 = Integer.parseInt(strNum1);
				int num2 = Integer.parseInt(strNum2);
				
				int intNum3 = num1 * num2;
				
				String num3 = ""+intNum3;
				
				txtMulResult.setText(num3);
				
			}
		});
		btnNewButton_2.setBounds(331, 276, 97, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("나눗셈");
		lblNewLabel_3_3.setBounds(12, 309, 57, 15);
		contentPane.add(lblNewLabel_3_3);
		
		txtDiv1 = new JTextField();
		txtDiv1.setColumns(10);
		txtDiv1.setBounds(74, 306, 65, 21);
		contentPane.add(txtDiv1);
		
		JLabel lblNewLabel_4_3 = new JLabel("/");
		lblNewLabel_4_3.setBounds(145, 309, 57, 15);
		contentPane.add(lblNewLabel_4_3);
		
		txtDiv2 = new JTextField();
		txtDiv2.setColumns(10);
		txtDiv2.setBounds(165, 306, 65, 21);
		contentPane.add(txtDiv2);
		
		JLabel lblNewLabel_5_3 = new JLabel("=");
		lblNewLabel_5_3.setBounds(234, 309, 57, 15);
		contentPane.add(lblNewLabel_5_3);
		
		txtDivResult = new JTextField();
		txtDivResult.setColumns(10);
		txtDivResult.setBounds(254, 306, 65, 21);
		contentPane.add(txtDivResult);
		
		JButton btnNewButton_3 = new JButton("확인");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String strNum1 = txtDiv1.getText();
				String strNum2 = txtDiv2.getText();
				
				int num1 = Integer.parseInt(strNum1);
				int num2 = Integer.parseInt(strNum2);
				
				int intNum3 = num1 / num2;
				
				String num3 = ""+intNum3;
				
				txtDivResult.setText(num3);
				
			}
		});
		btnNewButton_3.setBounds(331, 305, 97, 23);
		contentPane.add(btnNewButton_3);
		
		JLabel lbResultCheck = new JLabel("결과 :");
		lbResultCheck.setBounds(22, 439, 297, 15);
		contentPane.add(lbResultCheck);
		
		JButton btnCheck = new JButton("확인");
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				List<String> cities = new ArrayList<>();
				
				if(chk1.isSelected()) {
					cities.add(chk1.getText());
					
				} if(chk2.isSelected()) {
					cities.add(chk2.getText());
					
				} if(chk3.isSelected()) {
					cities.add(chk3.getText());
					
				} if(chk4.isSelected()) {
					cities.add(chk4.getText());
					
				} if(chk5.isSelected()) {
					cities.add(chk5.getText());
					
				}
				
				lbResultCheck.setText("결과 : " + cities);
				
			}
		});
		btnCheck.setBounds(350, 435, 97, 23);
		contentPane.add(btnCheck);
		
		JLabel lblNewLabel_7 = new JLabel("테이블 실습");
		lblNewLabel_7.setBounds(22, 486, 79, 15);
		contentPane.add(lblNewLabel_7);
		
		table = new JTable();
		table.setBounds(48, 508, 348, 132);
		contentPane.add(table);
		
		// 테이블 설정
				String[] columnNames = {"아이디", "이름", "나이", "휴대폰"};
				
				DefaultTableModel model = new DefaultTableModel(columnNames, 0);
				model.setRowCount(0);
				table.setModel(model);
				
				
		
		JButton btnTable = new JButton("출력");
		btnTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				List<Person> persons = new ArrayList<>();
				persons.add(new Person("a101", "김유신", 23, "010-1234-1001"));
				persons.add(new Person("a102", "김춘추", 21, "010-1234-1002"));
				persons.add(new Person("a103", "장보고", 33, "010-1234-1003"));
				persons.add(new Person("a104", "강감찬", 43, "010-1234-1004"));
				persons.add(new Person("a105", "이순신", 53, "010-1234-1005"));
				
				for(Person person : persons) {
					Object[] rowData = {person.getId(), person.getName(), person.getAge(), person.getHp()};
					model.addRow(rowData);
				}
			}
		});
		btnTable.setBounds(32, 650, 97, 23);
		contentPane.add(btnTable);
	}
}
