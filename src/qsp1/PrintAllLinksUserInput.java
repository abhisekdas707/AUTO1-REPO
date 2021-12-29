package qsp1;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllLinksUserInput {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		System.out.println("enter an url");
		Scanner s=new Scanner(System.in);
		 String url = s.nextLine();
		
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		int count = alllinks.size();
		System.out.println(count);
		WebElement link = alllinks.get(count-1);
		System.out.println(link);
		String text = link.getText();
		System.out.println(text);
		driver.quit();
	}

}
