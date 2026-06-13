package front;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vo.MemoVO;


@WebServlet("/memo/list")
public class MemoListServlet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {	
		setCorsHeaders(resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		setCorsHeaders(resp);
		
		req.setCharacterEncoding("utf-8");
		resp.setContentType("application/json");
		resp.setCharacterEncoding("utf-8");
		
		List<MemoVO> listme = new ArrayList<MemoVO>();
		for(int i=0; i< 3; i++) {
		MemoVO v = new MemoVO();
			v.setNum(i);
			v.setMdate("data");
			v.setMerip("ip");
			v.setWriter("테스형" + i);
			v.setContent("내용" + i);
			listme.add(v);
		}

		PrintWriter out = resp.getWriter();
		ObjectMapper om = new ObjectMapper();
		String jsonResp = om.writeValueAsString(listme);
		out.println(jsonResp);		
	}
	
	//CORS Header Setting Method
		private void setCorsHeaders(HttpServletResponse resp) {	
			resp.setHeader("Access-Control-Allow-Origin", "*");
			resp.setHeader("Access-Control-Methods", "GET,POST,PUT,PATCH,OPTIONS");
			resp.setHeader("Access-Control-Allow-Headers", "Content-Type");
		}
}

