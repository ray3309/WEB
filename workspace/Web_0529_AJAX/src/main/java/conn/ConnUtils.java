package conn;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ConnUtils {

	// context.xml을 가지고 connection를 가져오는 객체
	private static DataSource ds;

	static {
		try {
			// 자동으로 /META-INF/Context.xml에 기명한 name을 읽어 오도록
			// lookup 메서드를 제공
			// java:com/env/Naming
			// Naming -> context.xml에서 DataSource의 이름
			// jdbc/dteamOracle
			InitialContext ctx = new InitialContext();
			ds = (DataSource) ctx.lookup("java:comp/env/jdbc/dteamOracle"); // JNDI

		} catch (NamingException e) {
			e.printStackTrace();
		}
	}	
	//DataSource가 받아온 Connection 반환 해주는 메소드
	public static Connection getConnection() throws SQLException {
		return ds.getConnection();
	}

}
