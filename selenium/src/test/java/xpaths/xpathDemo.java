package xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/web-form.html?utm_source=chatgpt.com/");
		driver.manage().window().maximize();
		
		//xpath with single attribute
		driver.findElement(By.xpath("//input[@name='my-password']")).sendKeys("1234");
		
		//xpath with multiple attribute
		//driver.findElement(By.xpath("//input[@name='my-password'][@type='password']")).sendKeys("1234");
		
		//xpath with 'and' , 'or' operator 
		//driver.findElement(By.xpath("//input[@name='my-password' and @type='password' ]"));
		//driver.findElement(By.xpath("//input[@name='my-password' or @type='p']")).sendKeys("hello");
		
		//xpath with inner text
		//driver.findElement(By.xpath("//button[text()='Submit']")).click();	
		
//		boolean status = driver.findElement(By.xpath("//h1[text()='Web form']")).isDisplayed();
//		System.out.println(status);
//		String value = driver.findElement(By.xpath("//h1[text()='Web form']")).getText();
//		System.out.println(value);
		
		//xpath with contains method
		//driver.findElement(By.xpath("//a[contains(@href,'ind')]")).click();
		
		//xpath with starts-with() method
		//driver.findElement(By.xpath("//a[starts-with(@href,'ind')]")).click();
		
		//chained xpath
		boolean st = driver.findElement(By.xpath("//div[@class='form-group tp-align-right mt-3']/a")).isDisplayed();
		System.out.println(st);
		
		Thread.sleep(3000); 
		driver.quit();
	}

}
  