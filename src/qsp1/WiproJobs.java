package qsp1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WiproJobs {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("wipro jobs"+Keys.ENTER);
		List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
		for(WebElement a:alllinks) {
			System.out.println(a.getAttribute("href"));
		}
	}

}
