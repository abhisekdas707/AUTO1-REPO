package qsp1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedirectSeleniumDev {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver4=new ChromeDriver();
		driver4.get("https://www.seleniumhq.org/");
		String d = driver4.getCurrentUrl();
		if(d.contains("selenium.dev")) {
			System.out.println("url contains selenium.dev");
		}
		else {
			System.out.println("url doesnot contains selenium.dev");
		}
		driver4.quit();
		
	}

}
