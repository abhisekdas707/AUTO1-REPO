package qsp1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenderAlignment  {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		int l1=driver.findElement(By.xpath("(//input[@type='radio'])[1]")).getLocation().getY();
		int l2 = driver.findElement(By.xpath("(//input[@type='radio'])[2]")).getLocation().getY();
		int l3 = driver.findElement(By.xpath("(//input[@type='radio'])[3]")).getLocation().getY();
System.out.println(l1);
System.out.println(l2);
System.out.println(l3);
		
		if(l1==l2 && l1==l3) {
			System.out.println("gender selectors location are same");
		}
		else {
			System.out.println("gender selectors location are not same");
		}
		

		driver.quit();
	}
	

}
