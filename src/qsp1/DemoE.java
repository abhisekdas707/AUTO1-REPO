package qsp1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoE {
	static{
		//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.edge,driver",",/driver/msedgedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		DemoD.testB(d);;
		WebDriver d1= new ChromeDriver();
		DemoD.testB(d1);
		
		

	}

}
