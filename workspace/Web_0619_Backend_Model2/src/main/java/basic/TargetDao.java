package basic;

public class TargetDao {

	private static TargetDao dao;
	
	private TargetDao() {}
	
	public synchronized static TargetDao getDao() {
		if(null == dao)
			dao = new TargetDao();
		return dao;
	}
	
	// argument into TargetVO
	public void addTarget() {
		
		System.out.println("Targete데이터 input");
	}
}
