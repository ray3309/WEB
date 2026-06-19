package model.board;

import java.io.IOException;

import org.apache.commons.beanutils.BeanUtils;

import controller.ActionFoward;
import dao.BoardDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.IAction;
import vo.BoardVO;

public class BoardAddAction implements IAction {

    @Override
    public ActionFoward execute(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        BoardVO vo = new BoardVO();

        try {
            BeanUtils.populate(vo, req.getParameterMap());
        } catch (Exception e) {
            e.printStackTrace();
        }

        BoardDao.getDao().addBoard(vo);

        return new ActionFoward("board.ict?cmd=boardList", true);
    }
}
