package qsp1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment5downloadResume {
static {		
	System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
}
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("abhisekdas707@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("abhi");
		driver.findElement(By.xpath("//button[.='Login']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[text()='UPDATE PROFILE']")).click();
		Thread.sleep(5000);
		File f=new File("./data/resume demo blank.docx");
		String absolutepath = f.getAbsolutePath();
		
		driver.findElement(By.id("attachCV")).sendKeys(absolutepath);
		
		driver.findElement(By.xpath("(//i[text()='Download'])[1]")).click();
		
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		driver.quit();
		
		
		
	}

}
