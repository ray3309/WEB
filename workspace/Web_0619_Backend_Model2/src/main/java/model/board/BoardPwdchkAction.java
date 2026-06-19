package model.board;

import java.io.IOException;

import controller.ActionFoward;
import dao.BoardDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.IAction;
import vo.BoardVO;

// 입력받은 비밀번호 확인 후 수정폼 이동 또는 삭제 처리
public class BoardPwdchkAction implements IAction {

    @Override
    public ActionFoward execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int no = Integer.parseInt(req.getParameter("no"));
        String pwd = req.getParameter("pwd");
        String ct = req.getParameter("ct"); // up 또는 del

        BoardVO vo = new BoardVO();
        vo.setNo(no);
        vo.setPwd(pwd);

        int result = BoardDao.getDao().checkpass(vo);

        if (result == 0) {
            req.setAttribute("no", no);
            req.setAttribute("ct", ct);
            req.setAttribute("msg", "비밀번호가 일치하지 않습니다.");
            return new ActionFoward("board/pwdchk", false);
        }

        if ("up".equals(ct)) {
            BoardVO detail = BoardDao.getDao().getUpdateDelete(no);
            req.setAttribute("vo", detail);
            return new ActionFoward("board/upform", false);
        }

        if ("del".equals(ct)) {
            BoardDao.getDao().RemoveBoard(no);
            return new ActionFoward("board.ict?cmd=boardList", true);
        }

        return new ActionFoward("board.ict?cmd=boardList", true);
    }
}
