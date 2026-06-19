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
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/hteml;charset=utf-8");
		
		String cmd = req.getParameter("cmd");		
		String msg = "";

		//polymorphism
		CommTargetInter comm;
		
		switch(cmd) {
			case "a":
			{	
				comm = new TargetA();
				msg = comm.Msg(); 
				break;
			}
			case "b":
			{
				comm = new TargetB();
				msg = comm.Msg();
				break;
			}
			case "c":
			{
				comm = new TargetC();
				msg = comm.Msg();
				break;
			}
			case "d":
			{
				comm = new TargetD();
				msg = comm.Msg();
				break;
			}
		}
		
		req.setAttribute("msg", msg);		
		req.getRequestDispatcher("/WEB-INF/views/any.jsp").forward(req, resp);
	}
}
