package ex4;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/loginProcess")
public class LoginProcess extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// select userid, name from member where userid=#{userid} and pass=#{pass}	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
				
		if(req.getParameter("userid").equals("admin") &&
		   req.getParameter("password").equals("12")){
			//session create, auth user id save
			HttpSession hs = req.getSession();
			hs.setAttribute("userid", req.getParameter("userid"));
			hs.setAttribute("username", "관리자");
			resp.sendRedirect("index.jsp");
			
		}else {
			resp.sendRedirect("LoginForm.jsp");
		}
		
		out.println("동작 잘됨");
	}
}
