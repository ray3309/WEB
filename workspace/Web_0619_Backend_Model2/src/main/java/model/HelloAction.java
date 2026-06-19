package model;

import java.io.IOException;

import controller.ActionFoward;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HelloAction implements IAction {

	@Override
	public ActionFoward execute(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		req.setAttribute("msg", "Hello First Model2");
		return new ActionFoward("hello", false);
	}
}
