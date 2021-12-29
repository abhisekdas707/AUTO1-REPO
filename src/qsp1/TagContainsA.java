package qsp1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagContainsA {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		String tag = driver.findElement(By.xpath("//a[text()='actiTIME Inc.']")).getTagName();
		if(tag.equals("a")) {
			System.out.println("a achi");
		}
		else {
			System.out.println("a nahi");
		}

		driver.quit();
	}
	

}
