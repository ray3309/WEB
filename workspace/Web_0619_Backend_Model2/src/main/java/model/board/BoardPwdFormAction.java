package model.board;

import java.io.IOException;

import controller.ActionFoward;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.IAction;

// 수정/삭제 전에 비밀번호 입력 화면으로 이동하는 Action
public class BoardPwdFormAction implements IAction {

    @Override
    public ActionFoward execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("no", req.getParameter("no"));
        req.setAttribute("ct", req.getParameter("ct")); // up 또는 del
        return new ActionFoward("board/pwdchk", false);
    }
}
