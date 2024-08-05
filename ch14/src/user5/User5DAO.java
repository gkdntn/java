package user5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class User5DAO {
	private static User5DAO instance = new User5DAO();
	public static User5DAO getInstance() {
		return instance;
	}
	private User5DAO() {}
	
	private final static String HOST = "jdbc:mysql://localhost:3306/studydb";
	private final static String USER = "root";
	private final static String PASS = "1234";
	
	public void insertUser(User5VO vo) {
		String sql = "insert into `user2` values (?, ?, ?, ?, ?)";
		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setInt(1, vo.getSeq());
			psmt.setString(2, vo.getName());
			psmt.setString(3, vo.getGender());
			psmt.setInt(4, vo.getAge());
			psmt.setString(5, vo.getAddr());
			
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
