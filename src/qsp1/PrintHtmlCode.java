package qsp1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintHtmlCode {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}


	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https:/google.com/");
		String h = driver.getPageSource();
		System.out.println(h);
		driver.close();
	}

}
