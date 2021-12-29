package qsp1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2PopHandling {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.xpath("//input[@name='policynumber']")).sendKeys("123");
		driver.findElement(By.xpath("//input[@name='dob']")).click();
		WebElement allmonths = driver.findElement(By.xpath("(//select)[1]"));
		Select s1=new Select(allmonths);
		s1.selectByIndex(1);
		
		WebElement allyears = driver.findElement(By.xpath("(//select)[2]"));
		Select s2=new Select(allyears);
		s2.selectByVisibleText("1996");
		
	    driver.findElement(By.xpath("//a[.='15']")).click();
	    
	    driver.findElement(By.id("alternative_number")).sendKeys("987654321");
	    
	    driver.findElement(By.xpath("//button[.='Lets Renew']")).click();
	    
	    boolean message = driver.findElement(By.id("alternative_number_error")).isDisplayed();
	    
	    if(message==true) {
	    	System.out.println("invalid text is displayed");
	    }
	    else {
	    	System.out.println("invalid text is not displayed");

	    }
	    
	    
	    driver.quit();
	
	}

}
