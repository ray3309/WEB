package controller;

import model.IAction;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


//url => main.ict?cmd=?
//http://192.168.0.3/Web_0619_Backend_Model2/main.ict?cmd=index
//req가 *.ict로 오면 현재 서블릿이 모두 응답

@WebServlet("*.ict")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    	
	protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}	
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}

	protected void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// cmd -> ActionFactory
		// cmd == index => Action action = new IndexAction();
		// cmd == hello => Action action = new HelloAction();
		
		req.setCharacterEncoding("utf-8");
		
		if(req.getParameter("cmd") != null) {
			ActionFactory fact = ActionFactory.getInstance();
			
			IAction action = fact.getAction(req.getParameter("cmd"));
			
			ActionFoward af = action.execute(req, resp);
			
			System.out.println("viewName " + af.getUrl());
			
			//af.isMethods() == false ? (resp.sendRedirect(af.getUrl())) : (req.getRequestDispatcher("/WEB-INF/views/" + af.getUrl()+".jsp").forward(req, resp));
			
			if(af.isMethods())
				resp.sendRedirect(af.getUrl());
			else
				req.getRequestDispatcher("/WEB-INF/views/" + af.getUrl()+".jsp").forward(req, resp);			
		}else {			
			resp.setContentType("text/html;charset=utf-8");
			PrintWriter out = resp.getWriter();
			
			out.println("<h2 style=\"color:red\"> InCorrect Req");
			out.println("</h2>");
		}		
	}
}
