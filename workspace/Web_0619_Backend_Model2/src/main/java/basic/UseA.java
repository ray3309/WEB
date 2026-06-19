package basic;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//추론)
// useA?cmd=a ==> TargetA Method Call
// 

@WebServlet("/useA")
public class UseA extends HttpServlet {
	//has A Releation
	//UseA가 필요할때 Target객체를 have

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/hteml;charset=utf-8");
		
		//polymorphism		
		// Factory Pattern
		ICommTarget comm = TargetFactory.getFactory().getTarget(req.getParameter("cmd"));
		
		req.setAttribute("msg",  comm.Msg());		
		req.getRequestDispatcher("/WEB-INF/views/any.jsp").forward(req, resp);
	}
}
