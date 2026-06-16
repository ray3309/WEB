package ex1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//jsp -> Servlet으로 변환 된다.
@WebServlet("/ex1_Servlet")
public class Ex1_Servlet extends HttpServlet {
	// 선언부 - 멤버필드 , 멤버메서드
	private int num = 10;

	public String test(int age) {
		return "멤버 메서드의 반환값: 매개변수값:" + age;
	}

	// 재정의 Get
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// service 메서드를 거친 doGet 영역 안 - 지역변수 , 메서드 호출
		int age = 18; // 지역변수
		//브라우저에 출력 하기 
		PrintWriter out = resp.getWriter();
		out.println("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"UTF-8\">\r\n"
				+ "<title>jsp -> View</title>\r\n"
				+ "</head>\r\n"
				+ "<body>");
		out.println("<h1>jsp : 서블릿이 복잡한 구문을 간소하기 위해서 개발한 웹 자바 </h1>");
		out.println("멤버변수 값 :" + num + "<br>");
		out.println("당신의 나이는:" + test(age) + "<br>");
		out.println("<br>\r\n"
				+ "<h2>표현식으로도 출력이 가능하다.</h2>");
	}
}






