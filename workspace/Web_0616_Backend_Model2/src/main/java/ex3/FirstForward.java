package ex3;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/firstFoward")
public class FirstForward extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public void init() throws ServletException {
			 
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("FirstFoward");
		req.setAttribute("msg", "테스트");
		
		//Forward Object
		//getRequestDispatcher("secondFoward") //forward시킬 경로를 지정
		RequestDispatcher rd = req.getRequestDispatcher("secondFoward");
		
		//Current Req Recv HttpServlerReq, HttpServletResp transfer to secondForward
		//req.setAttribute() save value address, HttpServletReq second page transfer
		//Argument, SecondFoward use req.getAttribute() Use disapper value;
		rd.forward(req, resp);
	}
}
