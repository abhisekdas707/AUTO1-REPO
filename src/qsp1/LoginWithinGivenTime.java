package qsp1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWithinGivenTime {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
		try {
			driver.get("https://demo.actitime.com/login.do");
			System.out.println("page is loaded within 3 seconds");
		}
		catch(TimeoutException t) {
			System.out.println("page is not loaded within 3 seconds");
		}
		driver.quit();
	}

}
