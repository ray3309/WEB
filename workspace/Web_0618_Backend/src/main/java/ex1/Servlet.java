package ex1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

//form(WEBAPP) => servlet => forward <= forEachChoose


@WebServlet("/servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@Override
	protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setHeader("Access-Control-Allow-Origin", "*");
		resp.setHeader("Access-Control-Methods", "GET,POST,OPTIONS");
		resp.setHeader("Access-Control-Allow-Headers", "Content-Type");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Access-Control-Methods", "GET,POST,OPTIONS");
		response.setHeader("Access-Control-Allow-Headers", "Content-Type");
		
		request.setAttribute("start", Integer.parseInt(request.getParameter("start")));
		request.setAttribute("end", Integer.parseInt(request.getParameter("end")));
		request.setAttribute("range", Integer.parseInt(request.getParameter("range")));
		request.getRequestDispatcher("/WEB-INF/views/forEachChoose.jsp").forward(request, response);
	}
	
	
}
