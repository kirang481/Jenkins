package jenkins.demo.maven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class googleTest {
	WebDriver driver;
	@Test
	public void validateTitle() {
		String expected = "Google";
		String actual = driver.getTitle();
		Assert.assertEquals(actual, expected);
	}
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KiranG\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https:\\www.google.com");
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
