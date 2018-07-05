package Selenium.Automation.selenium.io.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class getTextAndgetAttributeTest {
	
	@Test
	public void verifyErrorMessage() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/n0257057/Desktop/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	    driver.findElement(By.id("u_0_2")).click();
		driver.quit();
	}

}
