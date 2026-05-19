package seleniumwebdriverlaunch;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class FirstTestCase {
	
	public static void main(String[] args) {
		
		/* Launch browser -> open url https://demo.opencart.com/ -> validate title -> close browser */
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://flipkart.com/");
		String act_title = driver.getTitle();
		System.out.println(act_title);
		
		if(act_title.equals("Online Shopping India Mobile, Cameras, Lifestyle & more Online @ Flipkart.com")) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
		driver.close();
	}

}
