package model;

import java.io.IOException;

import controller.ActionFoward;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class IndexAction implements IAction {

	@Override
	public ActionFoward execute(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException{
		req.setAttribute("idxmsg", "index Page");
		return new ActionFoward("index", false);
	}
}
