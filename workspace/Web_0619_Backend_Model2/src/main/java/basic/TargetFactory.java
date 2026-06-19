package basic;

public class TargetFactory {
	// Service Shutdown Protected, Execute Role of Division ResponseBility
	// Object Create and Return, Execute Role of Factory Same

	private static TargetFactory fact;	
	private TargetFactory() {}
	public synchronized static TargetFactory getFactory() {
		if(null == fact)
			fact = new TargetFactory();		
		return fact;
	}
	
	// cmd analyze, Return of Polymophisim type Object method
	public ICommTarget getTarget(String cmd) {
		ICommTarget ref = null;
		
		switch(cmd) {
			case "a":
			{	
				ref = new TargetA();
				break;
			}
			case "b":
			{
				ref = new TargetB();	
				break;
			}
			case "c":
			{
				ref = new TargetC();
				break;
			}
			case "d":
			{
				ref = new TargetD();
				break;
			}
		}		
		return ref;		
	}
	
}
