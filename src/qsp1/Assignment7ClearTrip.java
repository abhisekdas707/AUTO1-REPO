package qsp1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7ClearTrip {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.cleartrip.com/");
        driver.findElement(By.xpath("(//input[@placeholder='Any worldwide city or airport'])[1]")).sendKeys("bang");
		driver.findElement(By.xpath("//p[text()='Bangalore, IN - Kempegowda International Airport (BLR)']")).click();
		driver.findElement(By.xpath("(//input[@placeholder='Any worldwide city or airport'])[2]")).sendKeys("bhub");
		List<WebElement> sugg = driver.findElements(By.xpath("//p[contains(text(),'Bhu')]"));
		sugg.get(0).click();
		driver.findElement(By.xpath("//button[@style='min-width: 185px;']")).click();
		driver.findElement(By.xpath("(//div[text()='21'])[1]")).click();
		driver.findElement(By.xpath("//button[text()='Search flights']")).click();
		List<WebElement> allflights = driver.findElements(By.xpath("//div[text()='Flight details']/../../div/div/img"));
		List<WebElement> departure = driver.findElements(By.xpath("//div[text()='Flight details']/../../../../div[2]/div[1]/div[1]/p"));
		System.out.println(allflights.size());
		for(int i=0;i<allflights.size();i++) {
			System.out.println(allflights.get(i).getAttribute("alt")+"------>"+ departure.get(i).getText());
	
		}
		driver.close();
	}

}
