package shop.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import shop.db.DBHelper;
import shop.db.SQL;
import shop.vo.ProductVO;

public class ProductDAO extends DBHelper{
	private static ProductDAO instance = new ProductDAO();
	public static ProductDAO getInstance() {
		return instance;
	}
	private ProductDAO() {}
	
	public int insertProduct(ProductVO vo) {
		return 0;
	}
	public ProductVO selectProduct(int prodNo) {
			ProductVO vo = null;
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.SELECT_PRODUCT);
			psmt.setInt(1, prodNo);
			
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				vo = new ProductVO();
				vo.setProdNo(rs.getInt("prodNo"));
				vo.setProdName(rs.getString("prodName"));
				vo.setStock(rs.getInt("stock"));
				vo.setPrice(rs.getInt("price"));
				vo.setCompany(rs.getString("company"));
			}
			
			closeAll();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return vo;
	}
	public List<ProductVO> selectProducts() {
		List<ProductVO> productVO = new ArrayList<>();
		try {
			 conn = getConnection();
			 stmt = conn.createStatement();
			 rs = stmt.executeQuery(SQL.SELECT_PRODUCTS);
			
			while(rs.next()) {
				ProductVO vo = new ProductVO();
				vo.setProdNo(rs.getInt(1));
				vo.setProdName(rs.getString(2));
				vo.setStock(rs.getInt(3));
				vo.setPrice(rs.getInt(4));
				vo.setCompany(rs.getString(5));
				
				productVO.add(vo);
			}
			
			closeAll();
			
		} catch (Exception e) {
		}
		return productVO;
	}
	public int updateProduct(ProductVO vo) {
		return 0;
	}
	public int deleteProduct(int prodNo) {
		return 0;
	}
}
