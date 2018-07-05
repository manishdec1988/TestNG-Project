package ITestListenerDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;

//@Listeners(ITestListenerDemo.ITestListenerTest.class)
public class MyFirstTestcaseWithListner {
	
	@Test
	public void GoogleTitelVerify() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/n0257057/Desktop/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		Assert.assertEquals("Google", driver.getTitle());
		driver.quit();
	}
	
	@Test
	public void FailTestVerify() {
		System.out.println("Test 2 Dummy");
		Assert.assertEquals(2,7);
	}

}
