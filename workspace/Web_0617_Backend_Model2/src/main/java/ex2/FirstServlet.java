package ex2;

import java.io.IOException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//PageMove
@WebServlet("/first")
public class FirstServlet extends HttpServlet {

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
		System.out.println("FirstServlet Execute");	
					
		ctx.setAttribute("myMsg", "Hello");
		
		//PageMove redirect(Get Type Send Argument)
		resp.sendRedirect("second");		
	}
}
