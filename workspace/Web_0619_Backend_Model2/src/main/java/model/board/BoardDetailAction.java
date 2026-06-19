package model.board;

import java.io.IOException;

import controller.ActionFoward;
import dao.BoardDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.IAction;
import vo.BoardVO;

//boardDetail=model.board.BoardDetailAction
public class BoardDetailAction implements IAction {

	public ActionFoward execute(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		//번호 파라미터 처리
		int num = Integer.parseInt(req.getParameter("no"));
		BoardDao dao = BoardDao.getDao();
		//hit처리 
		//Dao + hit + getDetail(n) => VO
		dao.hit(num);
		BoardVO e = dao.getDetail(num);
		req.setAttribute("vo", e);
		
		return new ActionFoward("/board/info", false);
	}
}
