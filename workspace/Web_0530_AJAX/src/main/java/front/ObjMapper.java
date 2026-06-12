package front;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vo.MsgVO;

@WebServlet("/ObjMapper")
public class ObjMapper extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8326069894789675860L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Header - CORS 처리
		resp.setHeader("Access-Control-Allow-Origin", "*");
		resp.setHeader("Access-Control-Methods", "GET,POST,OPTIONS");
		resp.setHeader("Access-Control-Allow-Headers", "Content-Type");
		
		req.setCharacterEncoding("utf-8");
		resp.setContentType("application/json");
		resp.setCharacterEncoding("utf-8");
		PrintWriter out = resp.getWriter();
		
		
		// List<ProductVO> productList 로 다시 설정 해서 만들기!!! 
		List<MsgVO> list = createData();
		//----------------------------------------------------------
		System.out.println(list.size());
		
		ObjectMapper om = new ObjectMapper();
		String jsonResp = om.writeValueAsString(list);
		
		out.println(jsonResp);		
	}	
	
	// DB DAO에서 가져오기
	private List<MsgVO> createData() {
		List<MsgVO> mlist = new ArrayList<MsgVO>();
		for(int i=0; i<3; i++) {
			MsgVO v = new MsgVO();
			v.setNum(1);
			v.setName("테스형");
			v.setGp("1번그룹");
			v.setMsg("만나서 반가워요"+i);
			v.setMdate(new SimpleDateFormat("yyy-MM-dd").format(new Date()));
			mlist.add(v);
		}
		
		return mlist;
	}
	
}
