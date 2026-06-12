package front;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vo.ProductVO;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import dao.ProductDao;

/**
 * Servlet implementation class ProductList
 */
@WebServlet("/Fsout")
public class Fsout extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			resp.setHeader("Access-Control-Allow-Origin", "*");
			resp.setHeader("Access-Control-Methods", "GET,POST,OPTIONS");
			resp.setHeader("Access-Control-Allow-Headers", "Content-Type");
			
			req.setCharacterEncoding("UTF-8");
			resp.setCharacterEncoding("UTF-8");
			resp.setContentType("application/json");
			
			PrintWriter out = resp.getWriter();
			
			List<ProductVO> _list = ProductDao.getDao().getProduct();
			
			ObjectMapper om = new ObjectMapper();
			String jsonResp = om.writeValueAsString(_list);
			
			out.println(jsonResp);
		}
}
