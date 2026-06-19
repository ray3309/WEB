package model;

import java.io.IOException;

import controller.ActionFoward;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface IAction {
	
	// 모델이 재정의 하고 JOB을 실행 한 후 이동방식, 뷰의위치를 반환 ActionFoward Return Abstract Method
	// Argument는 서블릿으로 부터 주입, service ->doGet/doPost -> execute()
	ActionFoward execute(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException;

}
