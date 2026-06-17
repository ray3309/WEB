package ex1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class ServletCfgCtx extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String company;
	private String email;
	private String tel;
	private String fax;
	
	public ServletCfgCtx() {
		System.out.println("Construct Call");
        // getServletConfig() 이 호출이 되는 이유는??
		// ServletConfig config = getServletConfig();
		// System.out.println("Construct Call:"+config)
		
//        ServletConfig config = getServletConfig();
//        ServletContext context = getServletContext();
//        System.out.println("Construct Config Call:"+config);
//        System.out.println("Construct Context Call:"+context);
//
//        //context 
//        company = context.getInitParameter("company");
//
//        //config
//        email = config.getInitParameter("email");
//        tel = config.getInitParameter("tel");
	}
	
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
	
//	@Override
//	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
//		System.out.println("service() Call");
//	}
	
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
}
