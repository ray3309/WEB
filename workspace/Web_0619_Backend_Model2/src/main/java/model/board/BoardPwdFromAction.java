package model.board;

import java.io.IOException;

import controller.ActionFoward;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.IAction;

public class BoardPwdFromAction implements IAction {

	@Override
	public ActionFoward execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		return new ActionFoward("board/write", false);
	}
}
