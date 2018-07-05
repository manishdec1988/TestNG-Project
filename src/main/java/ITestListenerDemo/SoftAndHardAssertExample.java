package ITestListenerDemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAndHardAssertExample {
	
	@Test
	public void TestSoftAssert() {
		
		SoftAssert assertion=new SoftAssert();
		System.out.println("Test 1 started using soft Assert");
		assertion.assertEquals(12, 13);
		//TODO this will  run incase of Soft Assert
		System.out.println("Test 1 Completed using soft Assert");
		assertion.assertAll();
	}
	
	@Test
	public void TestHardAssert() {
		System.out.println("Test 2 started using Hard Assert");
		Assert.assertEquals(12, 13);
		//TODO this will not run incase of Hard Assert
		System.out.println("Test 2 Completed using sofHardt Assert");
	}

}
