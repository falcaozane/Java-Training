package userDefinedFunctions;

public final class Mobile {
	
	public void openMobile() {
		System.out.println("Open mobile with default settings");
	}
	
	// pattern
	public void openMobile(int pattern) {
		System.out.println("Open mobile with "+pattern);
	}
	
	// fingerprint
	public void openMobile(Boolean fingerprint) {
		System.out.println("Open mobile with "+fingerprint);
	}
	
	// password
	public static void openMobile(String pwd) {
		System.out.println("Open mobile with "+pwd);
	}
	
	// pattern + pwd
	
	public void openMobile(int pattern, String pwd) {
		System.out.println("Open mobile with "+pattern+" and "+pwd);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Mobile iphone = new Mobile();
		
		iphone.openMobile();
		
		iphone.openMobile(true);
		
		openMobile("zane");
		
		iphone.openMobile(1234);
		
		iphone.openMobile(12345,"Zane");
		

	}

}
