package ex1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ServletLifeCycle extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String company;
	private String email;
	private String tel;
	private String fax;

	public ServletLifeCycle() {
		System.out.println("Default Contsructor Call!");
	}
	
//	@Override
//	public void init() throws ServletException{
//		System.out.println("init() Call!");
		
//        ServletConfig config = getServletConfig();
//        ServletContext context = getServletContext();
//        System.out.println("init Config Call :"+config);
//        System.out.println("init Context Call :"+context);
//
//        //context 
//        company = context.getInitParameter("company");
//
//        //config
//        email = config.getInitParameter("email");
//        tel = config.getInitParameter("tel");
//	}	
			
//	@Override
//	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		System.out.println("service() Call!");
//		System.out.println("Transfer type:" + req.getAuthType() + ":" +req.getMethod());
//		
//		resp.setCharacterEncoding("utf-8");
//		resp.setContentType("text/html;charset=utf-8");
//		PrintWriter out = resp.getWriter();
//		
//		out.println("<ul>");
//		out.println("<li>Company :"+company+"</li>");
//      out.println("<li>CEO :"+email+"</li>");
//      out.println("<li>Corp Tel :"+tel+"</li>");
//		out.println("</ul>");
//	}
	
	@Override
	 public void init() throws ServletException {
       //
       System.out.println("init Call");
       ServletConfig config = getServletConfig();
       ServletContext context = getServletContext();
       System.out.println("init Config Call :"+config);
       System.out.println("init Context Call :"+context);

       //context 
       company = context.getInitParameter("company");

       //config
       email = config.getInitParameter("email");
       tel = config.getInitParameter("tel");
       fax = config.getInitParameter("fax");
   }
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		
		out.println("<ul>");
		out.println("<li>Company :"+company+"</li>");
        out.println("<li>CEO :"+email+"</li>");
        out.println("<li>Corp Tel :"+tel+"</li>");
        out.println("<li>Corp Fax :"+fax+"</li>");
		out.println("</ul>");
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy() Call");
	}
	
}
