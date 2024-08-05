package user2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class User2DAO {
	private static User2DAO instance = new User2DAO();
	public static User2DAO getInstance() {
		return instance;
	}
	private User2DAO() {}
	
	private final static String HOST = "jdbc:mysql://localhost:3306/studydb";
	private final static String USER = "root";
	private final static String PASS = "1234";
	
	public void insertUser(User2VO vo) {
		String sql = "insert into `user2` values (?, ?, ?, ?)";
		
		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getUid());
			psmt.setString(2, vo.getName());
			psmt.setString(3, vo.getBirth());
			psmt.setString(4, vo.getAddr());
			
			psmt.executeUpdate();
			
			psmt.close();
			conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	public User2VO selectUser(String uid) {
		String sql = "select * from `user2` where `uid`=?";
		User2VO user = null;
		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, uid);
			ResultSet rs = psmt.executeQuery();
			if(rs.next()) {
				user = new User2VO();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return user;
	}
	public void selectUsers() {}
	public void updateUser() {}
	public void deleteUser() {}
	
}
