package qsp1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/HP/Desktop/brokenDemo1.html");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=0;i<links.size();i++) {
			WebElement element = links.get(i);
			String url=element.getAttribute("href");
			URL link=new URL(url);
			HttpURLConnection httpcon=(HttpURLConnection)link.openConnection();
			Thread.sleep(2000);
			httpcon.connect();
			int response=httpcon.getResponseCode();
			if(response>=400){
				System.out.println(url+"is broken");
				
			}
			else {
				System.out.println(url+"is not broken");
			}
			
			
		}


	}

}
