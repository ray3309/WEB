package ex2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


/**
 * Servlet implementation class singIn
 */
@WebServlet("/singup")
public class singup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		String name = request.getParameter("name");
		@SuppressWarnings("unused")
		String email = request.getParameter("email");
		@SuppressWarnings("unused")
		String phone = request.getParameter("phone");	
		LocalDate today = LocalDate.now();
		@SuppressWarnings("unused")
		String regdate = today.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		
		request.getRequestDispatcher("/signup.jsp").forward(request, response);
	}

}
