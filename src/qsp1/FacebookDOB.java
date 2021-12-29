package qsp1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDOB {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		
		WebElement daylist = driver.findElement(By.id("day"));
		Select s=new Select(daylist);
		s.selectByIndex(14);
		
        WebElement monthlist = driver.findElement(By.id("month"));
		Select s1=new Select(monthlist);
		s1.selectByIndex(1);
		
        WebElement yearlist = driver.findElement(By.id("year"));
		Select s2=new Select(yearlist);
		s2.selectByVisibleText("1996");
	
		
		

	}

}
