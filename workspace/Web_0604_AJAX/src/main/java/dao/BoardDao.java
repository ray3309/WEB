package dao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BoardDao {

	private static BoardDao dao;
	private BoardDao() {

	}

	public static BoardDao getDao() {
		if(null == dao) {
			dao = new BoardDao();
		}

		return dao;
	}

	//dummy data create
	public List<BoardVO> getList(){
		List<BoardVO> list = new ArrayList<>();
		String [] nameList = {"테스","카리나","유진","빅보이","빅대디","골드헌터"};
		int nLoop = 0;

		for (String s : nameList) {
			BoardVO v = new BoardVO();
			v.setNum(nLoop+1);
			v.setWriter(s);
			v.setSubject(s+"가 남긴글");
			v.setBcont(s+"가 작성한 내용");
			v.setReip("192.168.0." + nLoop);
			v.setHit(0);
			v.setRdate(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
			list.add(v);
			nLoop+=1;
		}
		return list;
	}

	//상세 보기 더미 데이터
	//get 방식으로 번호를 받아 1번에 해당하는 데이터 VO를 반환
	//select * from board where num = ?
	public BoardVO getBoardDeatil(int num) {
		BoardVO v = new BoardVO();
		int nLoop = 1;
		String s = "테스형";
		v.setNum(nLoop);
		v.setWriter(s);
		v.setSubject(s+"가 남긴글");
		v.setBcont(s+"가 작성한 내용");
		v.setReip("192.168.0." + nLoop);
		v.setHit(0);
		v.setRdate(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
		return v;
	}
}
