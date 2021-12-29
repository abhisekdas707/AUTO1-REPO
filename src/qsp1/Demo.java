package qsp1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver c=new ChromeDriver();
		c.get("https://www.instagram.com/");
		String title=c.getTitle();
		System.out.println(title);
		c.close();
		

	}

}
