package conn;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ConnUtils {
	//데이터 베이스로 부터 받은 정보(context.xml)가지고 Connection을 가져오는
	//객체 
	private static DataSource ds;
	static {
		try {
			//자동으로 /MET-INF/context.xml에 기명한 name을 읽어 오도록
			//lookup 메서드를 제공해준다.
			//java:comp/env/Naming
			// Naming -> context.xml에서 DataSource의 이름
			// jdbc/oracle
			InitialContext ctx = new InitialContext();
			ds = (DataSource) ctx.lookup("java:comp/env/jdbc/oracle");
		} catch (NamingException e) {
		
			e.printStackTrace();
		}
	}
	//DataSource가 받아온 Connection 반환 해주는 메서드 
	public static Connection getConnection() throws SQLException {
		return ds.getConnection();
	}
	
	
}
