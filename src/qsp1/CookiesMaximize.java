package qsp1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesMaximize {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.co.in/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.close();
		

	}

}
