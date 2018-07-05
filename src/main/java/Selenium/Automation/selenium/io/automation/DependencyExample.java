package Selenium.Automation.selenium.io.automation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyExample {

	@Test
	public void stratApp() {
		Assert.assertEquals(12, 13);
		System.out.println("Starting the App");
	}

	@Test(dependsOnMethods = "stratApp")
	public void loginApp() {
		System.out.println("Login the App");
	}

	@Test(dependsOnMethods = "loginApp")
	public void logoutApp() {
		System.out.println("Logout the App");
	}

}
