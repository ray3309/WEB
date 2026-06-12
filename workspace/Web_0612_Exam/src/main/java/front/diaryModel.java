package front;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import vo.diaryVO;

public class diaryModel {
	private static diaryModel model;
	private diaryModel() {}
	public synchronized static diaryModel getModel() {
		if(null == model)
			model = new diaryModel();
		
		return model;
	}
	
	
	public List<diaryVO> getDiary(int num) {
		List<diaryVO> list = new ArrayList<>();
		diaryVO diary = new diaryVO();
		
		diary.setDate(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
		diary.setTitle("리액트 1일차");
		diary.setImage("yujimin01.png");
		diary.setContent("오늘은....");
		
		list.add(diary);
		
		diaryVO diary2 = new diaryVO();
		diary2.setDate(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
		diary2.setTitle("리액트 2일차");
		diary2.setImage("yujimin02.png");
		diary2.setContent("오늘은2....");
		
		list.add(diary2);
		
		return list;
	}

}
