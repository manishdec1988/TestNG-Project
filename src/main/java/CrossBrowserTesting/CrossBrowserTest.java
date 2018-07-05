package CrossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import junit.framework.Assert;

public class CrossBrowserTest {
	WebDriver driver;

	@Test
	@Parameters("Browser")
	public void verifyPageTitle(String browserName) {
		if (browserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();

		} else if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:/Users/n0257057/Desktop/chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String Exp_title=driver.getTitle();
		System.out.println(Exp_title);
		driver.quit();
	}
}
