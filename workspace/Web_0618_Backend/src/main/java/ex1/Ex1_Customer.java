package ex1;

import vo.Customer;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.beanutils.BeanUtils;


@WebServlet("/ex1_customer")
public class Ex1_Customer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Ex1_Customer() {}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			doProcess(request, response);
		} catch (IllegalAccessException | InvocationTargetException | ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			doProcess(request, response);
		} catch (IllegalAccessException | InvocationTargetException | ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, IllegalAccessException, InvocationTargetException {
		Customer vo = new Customer();
		//vo.setName(request.getParameter("name"));
		
		//Pram name 과 property
		try {
			BeanUtils.populate(vo, request.getParameterMap());
			vo.setNum(1);
			vo.setDate(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
			
			//forward transfer before request in save
			request.setAttribute("customer", vo);
			request.getRequestDispatcher("/WEB-INF/views/EL.jsp").forward(request, response);		
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}		
		
		System.out.println(vo.getName());
		System.out.println(vo.getEmail());
		System.out.println(vo.getPhone());
	}

	protected void doOptions(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
