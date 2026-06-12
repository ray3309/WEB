package front;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/listJson")
public class listJson extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Header - CORS 처리
		resp.setHeader("Access-Control-Allow-Origin", "*");
		resp.setHeader("Access-Control-Methods", "GET,POST,OPTIONS");
		resp.setHeader("Access-Control-Allow-Headers", "Content-Type");
		
		String etc = req.getParameter("etc");
		String group = "";
		
		if(etc.equalsIgnoreCase("A")) {
			group = "1번그룹";
		} else if(etc.equalsIgnoreCase("B")){
			group = "2번그룹";
		} else if(etc.equalsIgnoreCase("C")){
			group = "3번그룹";
		} else {
			group = "공통그룹";
		}		
		
		req.setCharacterEncoding("utf-8");
		resp.setContentType("application/json");
		resp.setCharacterEncoding("utf-8");
		
		PrintWriter out = resp.getWriter();
		
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		sb.append("{\"msg\":\"안녕하세요^^\",\"name\":\"테스형\",\"gp\":\"").append(group).append("\"");
		sb.append("}").append(",");
		sb.append("{\"msg\":\"안녕하세요^^\",\"name\":\"오스형\",\"gp\":\"").append(group).append("\"");
		sb.append("}").append(",");
		sb.append("{\"msg\":\"안녕하세요^^\",\"name\":\"자스형\",\"gp\":\"").append(group).append("\"");
		sb.append("}");
		sb.append("]");
		
		out.println(sb);	
	}	
}
