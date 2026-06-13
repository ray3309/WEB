package front;

import java.util.ArrayList;
import java.util.List;

import vo.HomeDataVO;

public class HomeDataModel {
	private static HomeDataModel model;

	private HomeDataModel() {
	};

	public synchronized static HomeDataModel getModel() {
		if (null == model)
			model = new HomeDataModel();
		
		return model;
	}
	public List<HomeDataVO> getData(int num) {
		List<HomeDataVO> hlist = new ArrayList<HomeDataVO>();
		
		for(int i=1;i<5;i++) {
			HomeDataVO vo = new HomeDataVO();
			vo.setId(i);
			vo.setImg("bg"+i+".png");
			vo.setText("텍스트"+i);
			hlist.add(vo);
		}
		return hlist;
	}
}
