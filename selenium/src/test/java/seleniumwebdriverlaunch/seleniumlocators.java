package seleniumwebdriverlaunch;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
		
		
		driver.quit();
		
	}

}
