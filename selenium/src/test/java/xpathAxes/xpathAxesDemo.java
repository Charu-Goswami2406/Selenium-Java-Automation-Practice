package xpathAxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathAxesDemo {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/web-form.html?utm_source=chatgpt.com/");
		driver.manage().window().maximize();
		
		//self-selects the current node
		String text = driver.findElement(By.xpath("//a[contains(text(),'Return to index')]/self::a")).getText();
		System.out.println("Self: " + text);
		
		//Parent - selects parent of current node
		WebElement parent = driver.findElement(By.xpath("//a[contains(text(),'Return to index')]/parent::div"));
		System.out.println("Parent: " + parent.getAttribute("class"));
		
		//Child - selects all the children of current node
		List<WebElement> childs = driver.findElements(By.xpath("//div[@class = 'form-group tp-align-right mt-3']/child::*"));
		System.out.println("No of childs: " + childs.size());
		
		//Ancestor - return parent of parent node
		List<WebElement> ancestors = driver.findElements(By.xpath("//a[contains(text(),'Return to index')]//ancestor::*"));
		System.out.println("No of Ancestors: " + ancestors.size());
		
		//Descendant - return child of child node
		List<WebElement> descendants =  driver.findElements(By.xpath("//a[contains(text(),'Return to index')]//descendant::*"));
		System.out.println("No of Descendants: " + descendants.size());
		
		//Following - following node to current node
		List<WebElement> following = driver.findElements(By.xpath("//a[contains(text(),'Return to index')]/following::*"));
		System.out.println("No of following Elements: " + following.size());
		
		//Preceding - preceding node of current node
		List<WebElement> preceding = driver.findElements(By.xpath("//a[contains(text(),'Return to index')]/preceding::*"));
		System.out.println("No of preceding Elements: " + preceding.size());
		
		//Following-sibling - same level following sibling
		List<WebElement> following_siblings = driver.findElements(By.xpath("//a[contains(text(),'Return to index')]/following-sibling::*"));
		System.out.println("No of following-sibling Elements: " + following_siblings.size());
				
		//Preceding-siblings - same level preceding nodes
		List<WebElement> preceding_siblings = driver.findElements(By.xpath("//a[contains(text(),'Return to index')]/preceding-sibling::*"));
		System.out.println("No of preceding-sibling Elements: " + preceding_siblings.size());
				
		Thread.sleep(3000);
		driver.quit();
		
	}

}
