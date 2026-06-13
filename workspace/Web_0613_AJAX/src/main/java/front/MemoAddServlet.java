package front;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vo.MemoVO;

@WebServlet("/memo/add")
public class MemoAddServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {	
		setCorsHeaders(resp);
	}
	
	// axios.post() 방식으로 데이터를 전송하기에
	// 백엔드에서는 post 방식으로 처리 해야 함
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		setCorsHeaders(resp);
		
		//setCorsHeaders(resp);
		//json으로 넘어온 데이터 Read
		StringBuilder sb = new StringBuilder();
		try(BufferedReader reader = req.getReader()) {
			String line = null;
			while(null != (line = reader.readLine())) {
				sb.append(line);				
			}
			//JSON Convert
			ObjectMapper om = new ObjectMapper();
			MemoVO mvo = om.readValue(sb.toString(), MemoVO.class);
			
			//DAO LOAD After insert~~~
			System.out.println("=== Check ===");
			System.out.println("Num:" + mvo.getNum());
			System.out.println("Writer:" + mvo.getWriter());
			System.out.println("Content:" + mvo.getContent());
			System.out.println("IP:" + mvo.getMerip());
			System.out.println("Date:" + mvo.getMdate());			
			
			// resp
			resp.setContentType("applcation/json;charset=UTF-8");
			PrintWriter out = resp.getWriter();
			out.write("{\"status\":\"success\",\"message\":\"Memo Registry.\"}");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	

	//CORS Header Setting Method
	private void setCorsHeaders(HttpServletResponse resp) {	
		resp.setHeader("Access-Control-Allow-Origin", "*");
		resp.setHeader("Access-Control-Methods", "GET,POST,PUT,PATCH,OPTIONS");
		resp.setHeader("Access-Control-Allow-Headers", "Content-Type");
	}
}
