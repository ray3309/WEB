package ex1;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//서버를 만드는 규칙
//1)HttpServlet를 상속받는다
//2)요청 url을 작성 @WebServlet("/form의 이름")
//form에서 전송되어 오는 요청을 받는 방식
//Get : url에서 보여지는 파라미터 값, 보안관련 없는 데이터, 제한적인 용량, 문자열만 가능
//POST : url에서 보여지지 않는 파라미터 값, 보안관련 데이터, 무제한 용량, 이미지/영상도 가능
@WebServlet("/formRes")//<form action="formRes">
public class FormServlet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//Get 방식의 주요 매개변수
	//HttpServletRequest : 요청을 처리할때 사용하라고 제공해주는 클래스
	//HttpServletResponse : 응답처리 클래스
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//요청시 인코딩 타입을 지정
		req.setCharacterEncoding("utf-8");
		//요청 받아보기
		//<input type="text" name="msg1"
		//req.getParameter("msg1"); 이름정해서 받기
		String msg1 = req.getParameter("msg1");
		System.out.println(msg1);
		System.out.println("==========================");
		String msg2 = req.getParameter("msg2");
		System.out.println(msg2);
		System.out.println("==========================");
		String msg3 = req.getParameter("name");
		System.out.println(msg3);
		System.out.println("==========================");
		int age =Integer.parseInt(req.getParameter("age"));
		if (age > 19) {
			System.out.println("성인입니다");
		} else {
			System.out.println("미성년자 입니다");
		}
	}
}
