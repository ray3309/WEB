package board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import conn.ConnUtils;
import service.FactoryService;

//싱글톤으로 정의
@SuppressWarnings("unused")
public class BoardDao {
	private static BoardDao dao;

	private BoardDao() {
	}

	public synchronized static BoardDao getDao() {
		if (dao == null) {
			dao = new BoardDao();
		}
		return dao;
	}
	// 입력받은 값을 데이터 베이스나 장치로 저장하는 메서드
	// write -> insert.jsp(파라미터, vo) : useBean액션태그를 사용해서 vo
	// -> add(vo) 전달 및 검수 -> Database로 저장

	// INSERT INTO BOARD VALUES(board_seq.nextVal,?,?,?,?,0,?,sysdate)
	// <insert id="save" parameterType="ex2.BoardVO">
	public void addBoard(BoardVO vo) {
		SqlSession ss = FactoryService.getFactory().openSession(true); 
		ss.insert("board.save", vo);
		ss.close();
	}

	// 출력 메서드
	// SELECT NO,title,writer,hit,regdate FROM BOARD ORDER BY 1 DESC
	public List<BoardVO> getList() {
		SqlSession ss = FactoryService.getFactory().openSession();
		List<BoardVO> list = ss.selectList("board.list");
		ss.close();
		return list;
	}

	// 조회수 증가 - insert , update, delete pstmt.executeUpdate();
	// UPDATE BOARD SET hit=hit + 1 WHERE no=1;
	// <update id="hit" parameterType="int">
	public void hit(int num) {
		SqlSession ss = FactoryService.getFactory().openSession(true);
		ss.update("board.hit", num);		
		ss.close();
	}

	// 상세보기
	// <select id="detail" parameterType="int" resultType="ex2.BoardVO">
	public BoardVO getDetail(int num) {
		SqlSession ss = FactoryService.getFactory().openSession();
		BoardVO v = ss.selectOne("board.detail", num);
		ss.close();
		return v;
	}

	// password check 기능
	//<select id="checkpass" parameterType="ex2.BoardVO" resultType="int">
	public int checkpass(BoardVO vo) {
		SqlSession ss = FactoryService.getFactory().openSession();
		int ret = ss.selectOne("board.checkpass", vo);
		ss.close();
		return ret;
	}

	// <select id="getUpdateDelete" parameterType="int" resultType="ex2.BoardVO">
	public BoardVO getUpdateDelete(int num) {
		SqlSession ss = FactoryService.getFactory().openSession();
		BoardVO v = ss.selectOne("board.getUpdateDelete", num);
		ss.close();
		return v;
	}

	// <update id="updateBoard" parameterType="ex2.BoardVO">
	public void updateBoard(BoardVO vo) {
		SqlSession ss = FactoryService.getFactory().openSession(true);
		ss.update("board.updateBoard", vo);
		ss.close();
	}

	// delete From board where no = ?
	public void RemoveBoard(int num) {
		SqlSession ss = FactoryService.getFactory().openSession(true);
		ss.delete("board.RemoveBoard", num);
		ss.close();
	}
}
