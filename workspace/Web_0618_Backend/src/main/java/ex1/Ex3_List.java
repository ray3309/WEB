package ex1;

import vo.Customer;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//List Collection Use
@WebServlet("/ex3_List")
public class Ex3_List extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//List Use
		List<String> ProductList = new ArrayList<String>();		
		ProductList.add("AI TV");
		ProductList.add("AI 냉장고");
		ProductList.add("AI 청소기");
		request.setAttribute("productList", ProductList);
		
		Customer[] cusList = new Customer[3];
		String[] name = {"자드", "보아", "세리"};		
		
		for(int nloop = 0; nloop <3; nloop++) {
			Customer v = new Customer();
			v.setNum(nloop+1);
			v.setName(name[nloop]);
			v.setEmail("ict" + nloop + "@ict.co.kr");
			v.setPhone("010-2734-828"+nloop);
			v.setDate(new SimpleDateFormat("yyyy/MM/dd").format(new Date()));
			cusList[nloop] = v;			
		}
		request.setAttribute("cusList", cusList);
		
		List<Customer> clist = new ArrayList<Customer>();
		for(int nloop = 0; nloop < cusList.length; nloop++) {
			Customer v = new Customer();
			v.setNum(nloop+1);
			v.setName(name[nloop]);
			v.setEmail("ict" + nloop + "@ict.co.kr");
			v.setPhone("010-2734-828"+nloop);
			v.setDate(new SimpleDateFormat("yyyy/MM/dd").format(new Date()));
			clist.add(v);		
		}
		request.setAttribute("cList", clist);
		
		//RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/ex3List.jsp");
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/ex3ListLoop.jsp");
		rd.forward(request, response);		
	}

	protected void doOptions(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
	}
}
