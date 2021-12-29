package qsp1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemonstrateIdNameClassnameLocator {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/selenium%20pratice%20google.html");
		driver.findElement(By.id("d1")).click();
		driver.navigate().back();
		driver.findElement(By.name("n1")).click();
		driver.navigate().back();
		driver.findElement(By.className("c1")).click();
		driver.navigate().back();
		
		
		
		driver.findElement(By.linkText("Google")).click();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("gle")).click();
		driver.navigate().refresh();
		driver.close();
		
		
		
	}

}
