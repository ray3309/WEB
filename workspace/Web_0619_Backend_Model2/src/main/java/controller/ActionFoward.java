package controller;

// 각 모델이 수행한 결과를 반환 하는 클래스
public class ActionFoward {

	private String url;			// viewName -> jsp
	private boolean methods;	// MoveType - false : forward ...
	
	public ActionFoward(String url, boolean methods) {	
		this.url = url;
		this.methods = methods;
	}
	
	public ActionFoward(String url) {
		this.url = url;
	}
	
	public ActionFoward() {		
	}

	// setter / getter
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public boolean isMethods() {
		return methods;
	}

	public void setMethods(boolean methods) {
		this.methods = methods;
	}	
}
