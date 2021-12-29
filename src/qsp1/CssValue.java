package qsp1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssValue {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String colour = driver.findElement(By.linkText("Forgotten password?")).getCssValue("color");
		System.out.println(colour);
		String size = driver.findElement(By.linkText("Forgotten password?")).getCssValue("font-size");
		System.out.println(size);
		driver.quit();

	}

}
