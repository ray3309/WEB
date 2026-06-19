package model;

import java.io.IOException;

import controller.ActionFoward;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vo.ProfileVO;

public class ProfileAction implements IAction {
	
	@Override
	public ActionFoward execute(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException{
		
		ProfileVO v = new ProfileVO();
		v.setNum(1);
		v.setName("희상");
		v.setAge(44);
		v.setEmail("ray3309@gmail.com");
		v.setLoc("Seoul");
		
		req.setAttribute("vo", v);		
		return new ActionFoward("profile", false);
	}

}
