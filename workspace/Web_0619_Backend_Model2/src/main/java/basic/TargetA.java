package basic;


public class TargetA implements ICommTarget {

//	public String TargetACall() {
//		return "Msg of TargetA";
//	}
	
	@Override
	public String Msg()	{
		TargetDao.getDao().addTarget();
		return "Msg of TargetA";
	}	
}
