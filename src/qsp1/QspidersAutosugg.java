package qsp1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QspidersAutosugg {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("qspiders");
		List<WebElement> allsugg = driver.findElements(By.xpath("//span[contains(text(),'QSpiders')]"));
		for(WebElement e:allsugg) {
			System.out.println(e.getText());
		}
		allsugg.get(allsugg.size()-1).click();
		driver.quit();
	}
	

}
