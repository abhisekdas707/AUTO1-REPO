package qsp1;

import org.openqa.selenium.WebDriver;

public class DemoD {
	public static void testB(WebDriver driver) {
		driver.get("https://www.instagram.com/");
		String S= driver.getTitle();
		System.out.println(S);
		driver.close();
	

}
}