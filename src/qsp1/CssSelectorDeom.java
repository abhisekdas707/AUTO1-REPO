package qsp1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorDeom {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.findElement(By.cssSelector("a[href='https://www.facebook.com/']")).click();

	}

}