package day1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Annotations2 {
	
	@Test
	public static void Demo()
	{
		System.out.println("Demo run .....");
//		Assert.assertTrue(false);
//		Assert.assertTrue(false, "Demo is failed...");
		Assert.assertFalse(false, "Demo failed");
	}
	

	public static void main(String args[]) {
		System.out.println("heeloo ..");
		Annotations2.Demo();
	}

}
