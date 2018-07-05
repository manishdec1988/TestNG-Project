package Selenium.Automation.selenium.io.automation;

import org.testng.annotations.Test;

public class priorityAndDiscriptionTest {
	
	@Test(priority=1,description="This testcase will verify the Login functionlaity")
	public void loginApplication() {
		System.out.println("First Test executed by TestNG");
	}
	
	@Test(priority=2,description="This testcase will verify Item selected")
	public void selectItems() {
		System.out.println("Select firtsitem");
	}
	
	@Test(priority=-3,description="This testcase will verify Checkout")
	public void checkout() {
		System.out.println("checkout and made the payment!!!");
	}

}
