package front;

import vo.AddressVO;
import vo.CompanyVO;
import vo.UserVO;
import vo.GeoVO;

public class UserDummyModel {
	private static UserDummyModel model;
	private UserDummyModel() {}
	public synchronized static UserDummyModel getModel() {
		if(null == model)
			model = new UserDummyModel();
		
		return model;
	}
	
	public UserVO getDummyUser(int num) {
		UserVO user = new UserVO();
		user.setId(num);
		user.setName("윤희상");
		user.setUsername("Zard");
		user.setEmail("ray3309@gmail.com");
		user.setPhone("010-2734-8281");
		user.setWebsite("https://github.com/ray3309");
		
		AddressVO address = new AddressVO();
		address.setStreet("Yang-chon-ro");
		address.setSuite("APT 103");
		address.setCity("Seoul");
		address.setZipcode("157-745");
		
		GeoVO geo = new GeoVO();
		geo.setLat("37.5640277359057");
		geo.setLng("126.852695154201");
		address.setLoc(geo);
		user.setAddress(address);
		
		CompanyVO company = new CompanyVO();
		company.setName("ITDC");
		company.setChatchPhrase("JAVA&C++ Development Corp!!");
		company.setBs("프로젝트 관리 시스템");
		
		user.setCompany(company);
		
		
		
		return user;
	}

}
