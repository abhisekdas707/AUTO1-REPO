package qsp1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedirectingToGoogle {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.gmail.com/");
		String u = driver.getCurrentUrl();
		if(u.contains("google.com")) {
			System.out.println("url contains google so pass");

		}
		else {
			System.out.println("url dosenot contains google so fail");
		}
		driver.quit();
	}

}
