package day1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAnnotation {
	
	@Test
	public void openapp() {
		System.out.println("Open app test...");
		
	}
	@Test
	public void Add()
	{
		System.out.println("Add test...");
	}
	
	@BeforeMethod
	public void login()
	{
		System.out.println("Login test...");
		
	}
	
	@Test(priority=1)
	public void logout() {
		System.out.println("Logout test run...");
	}
	
//	public static void main(String[] args) {
//		System.out.println("hiii");
//	}
	

}
