package qsp1;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTime {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(7, TimeUnit.SECONDS);
		try {
		driver.get("https://demo.actitime.com/login.do");
		System.out.println("page is loaded within 7 seconds");
		}
		catch(TimeoutException e){
			System.out.println("page is not loaded within 7 seconds");
		}
		
		driver.quit();
		}

}
