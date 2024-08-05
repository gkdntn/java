package user1.app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import user1.User1DAO;
import user1.User1VO;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class User1AppMain extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable tblList;
	private JTextField textUid;
	private JTextField textName;
	private JTextField textBirth;
	private JTextField textHp;
	private JTextField textAge;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User1AppMain frame = new User1AppMain();
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
	
	
	
	
	
	public User1AppMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JPanel listPanel = new JPanel();
		contentPane.add(listPanel, "listPanel");
		listPanel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("User1 목록");
		listPanel.add(lblNewLabel, BorderLayout.NORTH);
		
		JScrollPane scrollPane = new JScrollPane();
		listPanel.add(scrollPane, BorderLayout.CENTER);
		
		////////////////////////////////////////////////////////
		// 테이블 설정
		////////////////////////////////////////////////////////
		// 테이블 생성
		tblList = new JTable();
		scrollPane.setViewportView(tblList);
		
		// 컬럼 설정
		String[] columNames = {"아이디", "이름", "생년월일", "휴대폰", "나이"};
		DefaultTableModel model = new DefaultTableModel(columNames, 0);
		model.setRowCount(0);
		tblList.setModel(model);
		
		// 데이터 출력
		User1DAO dao = User1DAO.getInstance();
		List<User1VO> users = dao.selectUsers();
		
		for(User1VO user : users) {
			Object[] rowData = {user.getUid(), user.getName(), user.getBirth(), user.getHp(), user.getAge()};
			model.addRow(rowData);
		}
		///////////////////////////////////////////////////////////////
		
		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		listPanel.add(panel_1, BorderLayout.SOUTH);
		
		JButton btnRegister = new JButton("등록");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// 등록화면으로 전환
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(getContentPane(), "registerPanel");
				
			}
		});
		
		
		panel_1.add(btnRegister);
		
		JPanel registrePanel = new JPanel();
		contentPane.add(registrePanel, "registerPanel");
		registrePanel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("User1등록");
		lblNewLabel_1.setBounds(0, 0, 452, 15);
		registrePanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("아이디");
		lblNewLabel_2.setBounds(22, 49, 57, 15);
		registrePanel.add(lblNewLabel_2);
		
		textUid = new JTextField();
		textUid.setBounds(91, 46, 116, 21);
		registrePanel.add(textUid);
		textUid.setColumns(10);
		
		textName = new JTextField();
		textName.setColumns(10);
		textName.setBounds(91, 74, 116, 21);
		registrePanel.add(textName);
		
		JLabel lblNewLabel_2_1 = new JLabel("이름");
		lblNewLabel_2_1.setBounds(22, 77, 57, 15);
		registrePanel.add(lblNewLabel_2_1);
		
		textBirth = new JTextField();
		textBirth.setColumns(10);
		textBirth.setBounds(91, 105, 116, 21);
		registrePanel.add(textBirth);
		
		JLabel lblNewLabel_2_2 = new JLabel("생년월일");
		lblNewLabel_2_2.setBounds(22, 108, 57, 15);
		registrePanel.add(lblNewLabel_2_2);
		
		textHp = new JTextField();
		textHp.setColumns(10);
		textHp.setBounds(91, 134, 116, 21);
		registrePanel.add(textHp);
		
		JLabel lblNewLabel_2_3 = new JLabel("휴대폰");
		lblNewLabel_2_3.setBounds(22, 137, 57, 15);
		registrePanel.add(lblNewLabel_2_3);
		
		textAge = new JTextField();
		textAge.setColumns(10);
		textAge.setBounds(91, 165, 116, 21);
		registrePanel.add(textAge);
		
		JLabel lblNewLabel_2_4 = new JLabel("나이");
		lblNewLabel_2_4.setBounds(22, 168, 57, 15);
		registrePanel.add(lblNewLabel_2_4);
		
		JButton btnInsert = new JButton("등록하기");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String uid = textUid.getText();
				String name = textName.getText();
				String birth = textBirth.getText();
				String hp = textHp.getText();
				int age = Integer.parseInt(textAge.getText());
				
				User1VO vo = new User1VO(uid, name, birth, hp, age);
				User1DAO.getInstance().insertUser(vo);
				JOptionPane.showMessageDialog(null, "등록 완료!");
				
			}
		});
		btnInsert.setBounds(110, 208, 84, 23);
		registrePanel.add(btnInsert);
		
		JButton btnList = new JButton("목록");
		btnList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(getContentPane(), "listPanel");
				
			}
		});
		btnList.setBounds(25, 208, 84, 23);
		registrePanel.add(btnList);
	}
}