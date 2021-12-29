package qsp1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllLinks {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		int count = alllinks.size();
		for(int i=0;i<count;i++)
		{
			String link = alllinks.get(i).getText();
			System.out.println(link);
		}
		

		driver.quit();
	}

}
