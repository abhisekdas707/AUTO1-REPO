package qsp1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoG {
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}

	public static void main(String[] args) {
 WebDriver d= new FirefoxDriver();
    DemoF.testC(d);
	    WebDriver d1= new ChromeDriver();
	    DemoF.testC(d1);

	}

}
