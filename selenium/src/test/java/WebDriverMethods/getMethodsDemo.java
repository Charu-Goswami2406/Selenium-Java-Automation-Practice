package WebDriverMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getMethodsDemo {

	public static void main(String[] args) throws InterruptedException {
		
		// get methods - we can access these methods through webdriver instance
		
		//get(url) - opens the url of the browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
		//getTitle() - returns title of page
		System.out.println("Title of the webpage is: " + driver.getTitle());
		
		//getCurrentUrl() - returns url of the page
		System.out.println("Url is: " + driver.getCurrentUrl());
		
		//getPageSource() - returns source code of the page
		//System.out.println(driver.getPageSource());
		
		//getWindowHandle() - returns ID of the single browser window
		//System.out.println("Window ID: " + driver.getWindowHandle());
		
		//getWindowHandles() - returns ID's of multiple browser window
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> windowIds = driver.getWindowHandles();
		System.out.println(windowIds); 
		
		Thread.sleep(3000);
		driver.quit();

	}

}
