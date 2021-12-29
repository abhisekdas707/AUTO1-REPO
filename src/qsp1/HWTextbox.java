package qsp1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWTextbox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		int height = driver.findElement(By.name("email")).getSize().getHeight();
		int width = driver.findElement(By.name("email")).getSize().getWidth();
		System.out.println(height);
		System.out.println(width);

		driver.quit();
	}
	

}
