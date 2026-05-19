package seleniumwebdriverlaunch;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class seleniumlocators {
	public static void main(String[]args) throws InterruptedException{
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.selenium.dev/selenium/web/web-form.html?utm_source=chatgpt.com/");
		driver.manage().window().maximize();   // to maximize the window
		
		// name locator 
		driver.findElement(By.name("my-text")).sendKeys("Charu");
		Thread.sleep(5000);
		
		//id
		boolean textid = driver.findElement(By.id("my-text-id")).isDisplayed();
		System.out.println(textid);
		
		//linktext & partiallinktext
		//driver.findElement(By.linkText("Return to index")).click();
		//driver.findElement(By.partialLinkText("index")).click();
		
		
		List<WebElement> l = driver.findElements(By.className("form-control"));
		System.out.println(l.size());
//		for(WebElement we:l) {
//			System.out.println(we.getTagName());
//		}
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("There is" + links.size() + " link on this webpage");
		
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("There are " + images.size() + " images on this webpage");;
		driver.quit();
		
	}

}
