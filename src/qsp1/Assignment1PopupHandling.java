package qsp1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1PopupHandling {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Alerts.html");
	
		driver.findElement(By.xpath("//a[.='Alert with OK & Cancel ']")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'confirm box')]")).click();
		driver.switchTo().alert().dismiss();
		boolean message = driver.findElement(By.id("demo")).isDisplayed();
		if(message==true) {
			System.out.println("you pressed cancel message is displayed");
		}
		else {
			System.out.println("you pressed cancel message is not displayed");
		}
		driver.quit();
	}

}
