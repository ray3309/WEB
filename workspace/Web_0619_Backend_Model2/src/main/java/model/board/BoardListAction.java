package model.board;

import java.io.IOException;
import java.util.List;

import controller.ActionFoward;
import dao.BoardDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.IAction;
import vo.BoardVO;

//boardList=model.board.BoardListAction
public class BoardListAction implements IAction {

	public ActionFoward execute(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		List<BoardVO> li = BoardDao.getDao().getList();
		req.setAttribute("blist", li);
		
		return new ActionFoward("board/list", false);
	}
}
