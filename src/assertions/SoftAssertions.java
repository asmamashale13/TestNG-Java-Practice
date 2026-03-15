package assertions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertions {
	WebDriver driver;
	
	@Test(priority=1)
	public void Browser()
	{
		driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
	}
	@Test(priority=2)
	public void Title()
	{
		String ExpTitle="Automation Testing Practicee";
		
		// soft assertion -- uses SoftAssert class --and creat obj of that class 
		SoftAssert as=new SoftAssert();
	
		as.assertEquals(driver.getTitle(), ExpTitle);
		
		System.out.println("Hello Welcome");
		as.assertAll();
		
	}
	@Test(priority=3)
	public void Soft()
		{
		String Exp="abcd";
		String act="abcd";
		SoftAssert as=new SoftAssert();
		as.assertEquals(true, false);               
		System.out.println("This is soft assertion...");
		System.out.println("hiii");
		
		as.assertEquals(act, Exp);
		System.out.println("Passed the exp");
		
		as.assertAll();
			
		}


}
