package ex1;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ProductModel {
	
	private ArrayList<ProductVO> prlist;
	
	public ProductModel() {
		prlist = new ArrayList<ProductVO>();
		
		for(int i = 0; i<5; i++) {
			ProductVO v = new ProductVO();
			v.setNum(i+1);
			v.setWeight((i+1)+"00g");
			v.setPrice(1000);
			v.setQty(i+100);
			v.setPdate(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
			prlist.add(v);
		}			
	}
	
	public ArrayList<ProductVO> getProduct(){
		return prlist;
	}
}
