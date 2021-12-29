package qsp1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterUrlWithoutGet {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.co.in/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.navigate().to("https://www.gmail.com/");
		String title2 = driver.getTitle();
		System.out.println(title2);
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		driver.quit();
	}

}
