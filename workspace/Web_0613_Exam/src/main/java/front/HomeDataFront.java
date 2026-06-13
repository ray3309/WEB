package front;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vo.HomeDataVO;


@WebServlet("/HomeDataFront")
public class HomeDataFront extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setHeader("Access-Control-Allow-Origin", "*");
		resp.setHeader("Access-Control-Methods", "GET,POST,OPTIONS");
		resp.setHeader("Access-Control-Allow-Headers", "Content-Type");
		
		req.setCharacterEncoding("UTF-8");
		
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("application/json");
		
		ObjectMapper om = new ObjectMapper();
		
		List<HomeDataVO> hlist = HomeDataModel.getModel().getData(Integer.parseInt(req.getParameter("num")));
		String jsonResp = om.writeValueAsString(hlist);
		
		PrintWriter out = resp.getWriter();
		out.println(jsonResp);
	}
}
