package ex01;

import java.util.ArrayList;

public class ProductModel {
	private static ProductModel pModel;	//Singleton
	private ArrayList<ProductVO> proList;	//data save to return 
	private int[] pri;	//price
	private ProductModel() {
		proList = new ArrayList<ProductVO>();
		pri = new int[] {120000, 220000, 320000};
		makeProduct(3);
	}

	public synchronized static ProductModel getpModel() {
		if(pModel == null) {
			pModel = new ProductModel();
		}
		return pModel;
	}
	
	// 생성자에 의해 내부에서 호출되는 메소드
	private void makeProduct(int num) {
		for (int i = 0; i < num; i++) {
			ProductVO v = new ProductVO();
			v.setNum(i+1);
			v.setPtitle("상품"+(i+1));
			v.setImg("http://192.168.0.3:8080/Web_0526/images/prod"+(i+1)+".jpg");
			v.setPrice(pri[i]);
			v.setPcont("상품"+(i+1)+" : 설명 텍스트");			
			v.setPdate("2026-05-26");
			proList.add(v);
		}
	}
	
	public ArrayList<ProductVO> getProList() {
		return proList;
	}
}
