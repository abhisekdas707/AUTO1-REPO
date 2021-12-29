package qsp1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginEnabled {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abhisekdas707@gmail.com");
driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("password");
boolean login = driver.findElement(By.xpath("//button[@name='login']")).isEnabled();
if(login==true) {
	System.out.println("login button is enabled");
}
else{
	System.out.println("login button is not enabled");
}
driver.close();
	}

}
