package ex2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * Servlet implementation class reserve
 */
@WebServlet("/reserve")
public class reserve extends HttpServlet {
	private static final long serialVersionUID = 1L;
//	const Obj{
//		name : ""
//		email : ""
//		phone : ""
//		country : ""
//		date : ""			
//		days : "1900/01/01" 
//		activities : ""		
//	}
       
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String country = request.getParameter("country");
		String date = request.getParameter("date");
		String days = request.getParameter("days");
		String activities = request.getParameter("activities");

		request.setAttribute("name", name);
		request.setAttribute("email", email);
		request.setAttribute("phone", phone);
		request.setAttribute("country", country);
		request.setAttribute("date", date);
		request.setAttribute("days", days);
		request.setAttribute("activities", activities);

		request.getRequestDispatcher("/reserve.jsp").forward(request, response);
	}

}
