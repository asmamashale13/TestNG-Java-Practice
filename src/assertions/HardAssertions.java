package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {
	
	@Test
	public void Login()
	{
		Assert.assertEquals("abc", "abc1");  // if assertion fail next code will not execute 
		Assert.assertTrue(true);
		System.out.println("Passing ..");
	}
	
	@Test
	public void Search()
	{
//		Assert.assertEquals("123", 123);// fail
		Assert.assertEquals(1234, 1234);
	}

}
