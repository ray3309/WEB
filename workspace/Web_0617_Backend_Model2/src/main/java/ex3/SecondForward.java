package ex3;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/secondFoward")
public class SecondForward extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("SecondFoward");
		
		resp.setContentType("text/html;charset=UTF-8");		
		PrintWriter out = resp.getWriter();
		
		out.println("<ul>");
		out.println("<li>"+req.getAttribute("msg")+"</li>");		
		out.println("</ul>");
	}
}
