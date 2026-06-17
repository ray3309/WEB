package ex4;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/logoutProcess")
public class LogoutProcess extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// select userid, name from member where userid=#{userid} and pass=#{pass}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		
		//getSession(false) ==> 기존의 세션을 사용
		HttpSession hs = req.getSession(false);
		hs.removeAttribute("userid");
		hs.removeAttribute("username");
		
		resp.sendRedirect("index.jsp");
	}
}
