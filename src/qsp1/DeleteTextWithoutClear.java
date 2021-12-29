package qsp1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteTextWithoutClear {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("abhisekdas707@gmailcom");
		driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+"a");
		driver.findElement(By.id("email")).sendKeys(Keys.DELETE);
		driver.quit();
	}
}