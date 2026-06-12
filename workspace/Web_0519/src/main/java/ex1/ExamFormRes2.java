package ex1;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/formRes2")
public class ExamFormRes2 extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.setCharacterEncoding("utf-8");
		
		String sub = req.getParameter("sub");
		System.out.println(sub);
		System.out.println("==========================");
		String wri = req.getParameter("wri");
		System.out.println(wri);
		System.out.println("==========================");
		String pwd = req.getParameter("pwd");
		System.out.println(pwd);
		System.out.println("==========================");
		int age =Integer.parseInt(req.getParameter("age"));
		if (age > 19) {
			System.out.println("성인입니다");
		} else {
			System.out.println("미성년자 입니다");
		}
		System.out.println("==========================");
		String email = req.getParameter("email");
		System.out.println(email);
	}
}
