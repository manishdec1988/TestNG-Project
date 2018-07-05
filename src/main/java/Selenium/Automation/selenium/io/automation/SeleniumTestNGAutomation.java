package Selenium.Automation.selenium.io.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import junit.framework.Assert;
import java.util.concurrent.TimeUnit;

public class SeleniumTestNGAutomation {

	WebDriver driver;
	
	@BeforeClass
	public void startBrowser() {
		System.out.println("Browser started successfully!!");
	}

	@Test
	public void StartApplication() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/n0257057/Desktop/chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Browser started!!");
		driver.get("https://test-pcm.lmig.com/palclaims/cc/ClaimCenter.do");
		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue(currentUrl.contains("LMAuth/VIAClaimCenterLogin"));
		System.out.println("Browser loaded successfully!!");
	}

	@Test(dependsOnMethods = "StartApplication")
	public void LoginApplication() {
		driver.findElement(By.name("USER")).sendKeys("N9980035");
		driver.findElement(By.name("PASSWORD")).sendKeys("PALSTCC1");
		driver.findElement(By.name("submitButton")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		boolean ActionButton = driver.findElement(By.id("Desktop:DesktopMenuActions-btnInnerEl")).isDisplayed();
		Assert.assertTrue(ActionButton);
		System.out.println("Login successfully!!");
	}
	
	@AfterClass
	public void closeApplication() {
		driver.quit();
		System.out.println("Browser closed");
	}

}