package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import conn.ConnUtils;
import vo.ProductVO;

public class productDao {
	private static productDao dao;
	private productDao() {}
	public static synchronized productDao getDao() {
		if(dao == null) {
			dao = new productDao();
		}		
		return dao;
	}
	
	//출력 처리를 위한 메서드 정의
	public List<ProductVO> getProduct(){
		
		String sql = "select num, ptitle, price, img, pdate from product order by num desc";
		
		List<ProductVO> plist = new ArrayList<ProductVO>();
		
		try(Connection conn = ConnUtils.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery()) {
			
			while(rs.next()) {
				ProductVO v = new ProductVO();
				v.setNum(rs.getInt("num"));				
				v.setPtitle(rs.getString("ptitle"));
				v.setPrice(rs.getInt("price"));
				v.setImg(rs.getString("img"));
				v.setPdate(rs.getString("pdate"));
				plist.add(v);				
			}			
			
		}catch(Exception e) {			
			e.printStackTrace();
			return null;
		}
		
		return plist;
	}
}
