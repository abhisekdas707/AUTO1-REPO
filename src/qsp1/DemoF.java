package qsp1;

import org.openqa.selenium.WebDriver;

public class DemoF {
	public static void testC(WebDriver driver) {
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
	}
	

}
