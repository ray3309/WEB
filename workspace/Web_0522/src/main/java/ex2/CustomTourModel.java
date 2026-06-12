package ex2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class CustomTourModel
 */
@WebServlet("/customIn")
public class CustomTourModel extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    /**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=utf-8");
		
		//form에서 넘어온 파라미터 처리
		// name, email, phone, date, days, activities
		
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String phone = req.getParameter("phone");
		String country = req.getParameter("country");
		String date = req.getParameter("date");
		String days = req.getParameter("days");
		String activities = req.getParameter("activities");
		
		System.out.println( "name : " + name + "\r\n"
						   +" email : " + email + "\r\n"
						   +" phone : " + phone + "\r\n"
						   +" country : " + country + "\r\n"
						   +" date : " + date + "\r\n"
						   +" days : " + days + "\r\n"
						   +" activities" + activities + "\r\n");	
		
		resp.sendRedirect("index.jsp");
	}
}
