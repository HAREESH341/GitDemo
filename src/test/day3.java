package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day3 {
	
	@Test
	public void WebLogin() {
		//selenium
		System.out.println("WebLogin");
	}

	@Test
	public void MobileLogin() {
		//Appium
		System.out.println("MobileLogin");
	}
	@Test(dataProvider="getData")
	public void MobileSignOut(String username,String password) {
		System.out.println("Mobile SignOUT");
		System.out.println("username");
		System.out.println("password");

	}
	
	@Test
	public void LoginApi() {
		//Rest API Automation
		System.out.println("LoginAPI");
	}
	@DataProvider
	public Object[][] getData() {
		Object[][] data=new Object[3][2];
		
		data[0][0]="FUName";
		data[0][1]="FPassword";
		data[1][0]="SUName";
		data[1][1]="SFPassword";
		data[2][0]="TUName";
		data[2][1]="TPassword";
		
		return data;
		
		
	}
	
}
