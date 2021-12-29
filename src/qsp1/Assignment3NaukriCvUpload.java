package qsp1;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3NaukriCvUpload {
static {		
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("abhisekdas707@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("abhi");
		driver.findElement(By.xpath("//button[.='Login']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='UPDATE PROFILE']")).click();
		
		File f=new File("./data/resume demo blank.docx");
		String absolutepath = f.getAbsolutePath();
		
		driver.findElement(By.id("attachCV")).sendKeys(absolutepath);
		
	    boolean message = driver.findElement(By.xpath("//b[@class='truncate exten']")).isDisplayed();
		
		if(message==true) {
			System.out.println("resume uploaded success fully");
		
		}
		else {
			System.out.println("resume upload falied");
		}
		
		driver.quit();
		
		
		
	}

}
