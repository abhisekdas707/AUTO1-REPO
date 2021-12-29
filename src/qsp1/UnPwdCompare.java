package qsp1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnPwdCompare  {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		int h1 = driver.findElement(By.name("email")).getSize().getHeight();
		int w1 = driver.findElement(By.name("email")).getSize().getWidth();
		
		int h2 = driver.findElement(By.name("pass")).getSize().getHeight();
		int w2 = driver.findElement(By.name("pass")).getSize().getWidth();
		//System.out.println(h1);
		//System.out.println(h2);
		//System.out.println(w1);
		//System.out.println(w2);
		if(h1==h2 && w1==w2) {
			System.out.println("UN and PWD text box are equal");
		}
		else {
			System.out.println("UN and PWD text box are not equal");
		}
		

		driver.quit();
	}
	

}
