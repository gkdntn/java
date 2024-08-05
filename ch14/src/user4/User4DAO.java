package user4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class User4DAO {
	private static User4DAO instance = new User4DAO();
	public static User4DAO getInstance() {
		return instance;
	}
	private User4DAO() {}
	
	private final static String HOST = "jdbc:mysql://localhost:3306/studydb";
	private final static String USER = "root";
	private final static String PASS = "1234";
	
	public void insertUser(User4VO vo) {
		String sql = "insert into `user2` values (?, ?, ?, ?, ?, ?)";
		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getUid());
			psmt.setString(2, vo.getName());
			psmt.setString(3, vo.getGender());
			psmt.setInt(4, vo.getAge());
			psmt.setString(5, vo.getHp());
			psmt.setString(6, vo.getAddr());
			
			psmt.executeUpdate();
			
			psmt.close();
			conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void selectUser() {}
	public void selectUsers() {}
	public void updateUser() {}
	public void deleteUser() {}
}
