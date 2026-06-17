package ex1;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ServletLifeCycle extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ServletLifeCycle() {
		System.out.println("Default Contsructor Call!");
	}
	
	@Override
	public void init() throws ServletException{
		System.out.println("init() Call!");
	}
			
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service() Call!");
		System.out.println("Transfer type:" + req.getAuthType() + ":" +req.getMethod());
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy() Call");
	}
	
}
