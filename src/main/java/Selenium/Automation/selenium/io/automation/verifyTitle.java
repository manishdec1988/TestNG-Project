package Selenium.Automation.selenium.io.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class verifyTitle {
	
	@Test
	public void verifyApplicationTitle() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/n0257057/Desktop/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://test-pcm.lmig.com/palclaims/cc/ClaimCenter.do");
		String Act_title=driver.getTitle();
		String Exp_Title="Title is Commercial Insurance Claim Center Login";
		System.out.println("Title is "+Act_title);
		Assert.assertEquals(Act_title, Exp_Title);
		driver.quit();
	}

}
