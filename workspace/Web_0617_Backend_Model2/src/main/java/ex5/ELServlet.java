package ex5;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/elServlet")
public class ELServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7245811696669647926L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Custommer cust = new Custommer();
		cust.setName("희상");
		cust.setEmail("ray3309@gmail.com");
		cust.setPhone("010-2734-8281");
		
		req.setAttribute("customer", cust);
		RequestDispatcher rd = req.getRequestDispatcher("el1.jsp");
		rd.forward(req, resp);
	}
}
