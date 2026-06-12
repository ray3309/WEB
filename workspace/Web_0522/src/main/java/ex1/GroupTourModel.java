package ex1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class GroupTourModel {

	//1. tour.txt파일을 읽어와서 출력
	//2. VO에 저장 ArrayList 저장
	
	private String filePath = "D:\\Ray_Study\\PROJECT\\WEB_PROJECT\\workspace\\Web_0522\\src\\main\\java\\ex1\\tour.txt";
	
	public ArrayList<GroupTourVO> tourReadData(){

		ArrayList<GroupTourVO> arrTour = new ArrayList<GroupTourVO>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(filePath))){			
			String readLine = null;			
			while((readLine = br.readLine()) != null) {
				String[] data = readLine.split(":");		
								
				GroupTourVO v = new GroupTourVO();				
				v.setTourNum(Integer.parseInt(data[0]));
				v.setTourTitle(data[1]);
				v.setTourWriter(data[2]);
				v.setTourImagePath(data[3]);
				v.setTourDate(data[4]);				
				
				arrTour.add(v);
			}
			
			return arrTour;
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}		
	}
	
//	public static void main(String[] args) {
//		ArrayList<GroupTourVO> tempArr = new ArrayList<GroupTourVO>();
//		
//		GroupTourModel ref = new GroupTourModel();
//		
//		tempArr = ref.tourReadData();
//		
//		for (GroupTourVO gTVO : tempArr) {
//			System.out.println(
//					"No : " + gTVO.getTourNum() +
//					", Title : " + gTVO.getTourTitle() +
//					", Writer : " + gTVO.getTourWriter() +
//					", FilePath : " + gTVO.getTourImagePath() +
//					", Date : " + gTVO.getTourDate());
//		}
//	}
}
