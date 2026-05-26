package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class conditionalMethods {

	public static void main(String[] args) throws InterruptedException{
		//conditional methods - access these commands through WebElement(return boolean value)
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
		//isDisplayed Method
		WebElement logo = driver.findElement(By.xpath(" //img[@alt='nopCommerce demo store']"));
		System.out.println("Display status of logo: " + logo.isDisplayed());
		
		//isEnabled Method - not for static elements 
		System.out.println(driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled());
		
		//isSelected()
		WebElement male_rb = driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female_rb = driver.findElement(By.xpath("//input[@id='gender-female']"));
		System.out.println(male_rb.isSelected());
		System.out.println("After Selecting Male Radio Button.........");
		male_rb.click();
		System.out.println(male_rb.isSelected());
		
		System.out.println("Newsletter checkbox status: " +driver.findElement(By.xpath(" //input[@id='gender-female']")).isSelected());
		
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
