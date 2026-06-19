package controller;

import model.IAction;

import java.io.FileReader;
import java.util.Properties;

import java.lang.reflect.Constructor;

public class ActionFactory {

	private static ActionFactory fact;
	
	private Properties prop;	
	private String path;
	
	private ActionFactory() {
		prop = new Properties();
		path = "D:\\Ray_Study\\PROJECT\\WEB_PROJECT\\workspace\\Web_0619_Backend_Model2\\src\\main\\java\\controller\\classinfo.properties";
	}
	
	public synchronized static ActionFactory getInstance() {
		if(null == fact)
			fact = new ActionFactory();
		return fact;
	}
	
	public IAction getAction(String cmd) {
		IAction ref = null;
		
//		switch(cmd) {		
//			case "index":
//			{
//				act = new IndexAction();
//			}break;
//			
//			case "hello":
//			{
//				act = new HelloAction();
//			}break;
//			
//			case "profile":
//			{
//				act = new ProfileAction();
//			}break;
//		}
		
		try(FileReader fr = new FileReader(path)) {
			prop.load(fr);
			String cmdPath = prop.getProperty(cmd, "model.IndexAction");
			Class<?> handle = Class.forName(cmdPath);
			
			// Default Construct Call newInstance Call (jdk9 over)
			Constructor<?> ct = handle.getDeclaredConstructor();
			
			ref = (IAction) ct.newInstance();			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return ref;		
	}
}
