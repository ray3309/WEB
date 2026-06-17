package ex2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//PageMove
@WebServlet("/second")
public class SecondServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ServletContext ctx = null;
	
	@Override
	public void init() throws ServletException {
		 ctx = getServletContext(); 
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("SecondServlet Execute");
		resp.setContentType("text/html;charset=UTF-8");
		
		ctx.getAttribute("myMsg");
		PrintWriter out = resp.getWriter();
		out.println("<ul>");
		out.println("<li>"+ctx.getAttribute("myMsg")+"</li>");
		out.println("</ul>");
		
	}
}

