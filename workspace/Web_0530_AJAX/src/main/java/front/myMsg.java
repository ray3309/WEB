package front;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/myMsg")
public class myMsg extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// WAS : WebApplicationService 동적 처리 서버
	// Tomcat 서버, WASm ServletContainer라고 함 Tomcat이 스레드로 관리하는 service를 호출
	// service가 톰캣으로 부터 받은 2개의 객체를 주입 하면서 doGet/doPost를 호출 함	
	// Tomcat 서버를 호출하는 과정
	// 최초일때
	// 1. 요청(클라이언트)
	// 2. Tomcat이 해당 요청과 같은 @WebServlet() 찾아서 Servlet 객체를 최초로 생성
	// 3. Servlet객체 안에 service메서드를 호출(스레드로 관리) - 호출시 req,resp 넣어줌
	// 4. service 요청 분석 -> get => doGet() / post => doPost() 함수 호출
	// 5. service는 계속 대기상태 (Accept)
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Header - CORS 처리
		resp.setHeader("Access-Control-Allow-Origin", "*");
		resp.setHeader("Access-Control-Methods", "GET,POST,OPTIONS");
		resp.setHeader("Access-Control-Allow-Headers", "Content-Type");
		
		req.setCharacterEncoding("utf-8");
		//MIME 타입 - 브라우저에게 타입 알려주는 방법
		//resp.setContentType("text/html; charset=UTF-8");	
		resp.setContentType("application/json");
		
		resp.setCharacterEncoding("utf-8");
		// 웹 브라우저와 연결된 스트림, 네트워크는 바이트 스트림
		// PrintWriter는 브릿지, 버퍼 기능을 내제		
		PrintWriter out = resp.getWriter();
		@SuppressWarnings("unused")
		String name = "희상";
		
		// 브라우저로 데이터를 보냄
		//out.println("Hello " + name);
		
		//JSON Object로 데이터 전송
		//{"msg":"Hello", "name":"HeeSang"}
		//{"msg":"Hello", "name":${name}}		
		String jsonResponse = "{\"msg\":\"Hello\", \"name\":\"희상\"}";
		out.println(jsonResponse);
		
		
		String reip = req.getRemoteAddr();
		System.out.println("Your IP Address = " + reip);
		
	}

}
