package qsp1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartIphoneProducts {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("iphone 13"+Keys.ENTER);
		List<WebElement> alliphone13 = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 13')]"));
		List<WebElement> allprice = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 13')]/../../div[2]/div[1]/div[1]"));
		for(WebElement iphone:alliphone13) {
			for(WebElement price:allprice) {
			System.out.println(iphone.getText()+":"+price.getText());
			}
		}                                       
		
		
		driver.close();
	}

}
