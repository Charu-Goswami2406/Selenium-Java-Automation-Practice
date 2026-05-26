package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserMethods {

	public static void main(String[] args) throws InterruptedException{
		
		//Two Browser Methods - close()-> close only single browser window where driver is focused  & quit()-> close multiple windows
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");		Thread.sleep(3000);
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();		
		Thread.sleep(3000);
		//driver.close();
		driver.quit();

	}

}
