package qsp1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyPaste {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("abhisekdas707@gmail.com");
		driver.findElement(By.name("email")).sendKeys(Keys.CONTROL+"ac");
		driver.findElement(By.name("pass")).sendKeys(Keys.CONTROL+"av");


		driver.quit();
	}
	

}
