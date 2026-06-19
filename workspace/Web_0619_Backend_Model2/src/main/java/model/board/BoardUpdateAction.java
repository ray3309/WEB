package model.board;

import java.io.IOException;

import controller.ActionFoward;
import dao.BoardDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.IAction;
import vo.BoardVO;

// 수정폼에서 넘어온 게시글 데이터를 DB에 반영하는 Action
public class BoardUpdateAction implements IAction {

    @Override
    public ActionFoward execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BoardVO vo = new BoardVO();
        vo.setNo(Integer.parseInt(req.getParameter("no")));
        vo.setTitle(req.getParameter("title"));
        vo.setWriter(req.getParameter("writer"));
        vo.setContent(req.getParameter("content"));
        vo.setPwd(req.getParameter("pwd"));
        vo.setReip(req.getParameter("reip"));

        BoardDao.getDao().updateBoard(vo);

        return new ActionFoward("board.ict?cmd=boardDetail&no=" + vo.getNo(), true);
    }
}
