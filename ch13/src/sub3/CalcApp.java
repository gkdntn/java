package sub3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalcApp extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textCalc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcApp frame = new CalcApp();
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
	public CalcApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 358, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textCalc = new JTextField();
		textCalc.setEditable(false);
		textCalc.setFont(new Font("맑은 고딕", Font.PLAIN, 23));
		textCalc.setHorizontalAlignment(SwingConstants.RIGHT);
		textCalc.setText("0");
		textCalc.setBounds(12, 10, 318, 66);
		contentPane.add(textCalc);
		textCalc.setColumns(10);
		String a;
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n7 = "7";
				textCalc.setText(textCalc.getText() + n7);
				
			}
		});
		btn7.setBounds(12, 86, 58, 43);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n8 = "8";
				textCalc.setText(textCalc.getText() + n8);
			}
		});
		btn8.setBounds(102, 86, 58, 43);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n9 = "9";
				textCalc.setText(textCalc.getText() + n9);
			}
		});
		btn9.setBounds(190, 86, 58, 43);
		contentPane.add(btn9);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnDiv = "/";
				textCalc.setText(btnDiv);
			}
		});
		btnDiv.setBounds(272, 86, 58, 43);
		contentPane.add(btnDiv);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n4 = "4";
				textCalc.setText(textCalc.getText() + n4);
			}
		});
		btn4.setBounds(12, 139, 58, 43);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n5 = "5";
				textCalc.setText(textCalc.getText() + n5);
			}
		});
		btn5.setBounds(102, 139, 58, 43);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n6 = "6";
				textCalc.setText(textCalc.getText() + n6);				
			}
		});
		btn6.setBounds(190, 139, 58, 43);
		contentPane.add(btn6);
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnMul = "*";
				textCalc.setText(btnMul);
			}
		});
		btnMul.setBounds(272, 139, 58, 43);
		contentPane.add(btnMul);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String n1 = "1";
				textCalc.setText(textCalc.getText() + n1);
			}
		});
		btn1.setBounds(12, 192, 58, 43);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n2 = "2";
				textCalc.setText(textCalc.getText() + n2);				
			}
		});
		btn2.setBounds(102, 192, 58, 43);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n3 = "3";
				textCalc.setText(textCalc.getText() + n3);				
			}
		});
		btn3.setBounds(190, 192, 58, 43);
		contentPane.add(btn3);
		
		JButton btnMin = new JButton("-");
		btnMin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnMin = "-";
				textCalc.setText(btnMin);
			}
		});
		btnMin.setBounds(272, 192, 58, 43);
		contentPane.add(btnMin);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnC = null;
				textCalc.setText(btnC);
			}
		});
		btnC.setBounds(12, 245, 58, 43);
		contentPane.add(btnC);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n0 = "0";
				textCalc.setText(textCalc.getText() + n0);
			}
		});
		btn0.setBounds(102, 245, 58, 43);
		contentPane.add(btn0);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnEqual = "=";
				textCalc.setText(btnEqual);
			}
		});
		btnEqual.setBounds(190, 245, 58, 43);
		contentPane.add(btnEqual);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnPlus = "+";
				textCalc.setText(btnPlus);
			}
		});
		btnPlus.setBounds(272, 245, 58, 43);
		contentPane.add(btnPlus);
	}

}
