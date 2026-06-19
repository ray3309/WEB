package model.board;

import java.io.IOException;

import controller.ActionFoward;
import dao.BoardDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.IAction;

public class BoardDeleteAction implements IAction {

	@Override
	public ActionFoward execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		BoardDao.getDao().RemoveBoard(Integer.parseInt(req.getParameter("no")));
		
		return new ActionFoward("board.ict?cmd=boardList",true);
	}

}
