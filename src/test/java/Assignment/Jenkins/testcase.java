package Assignment.Jenkins;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testcase {
	static WebDriver driver;
	
	
	@Test
	public void openAmazon() {
		
		System.setProperty("webdriver.chrome.driver",".\\drivers\\\\chromedriver.exe" );
		
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		
		Assert.assertTrue(driver.getTitle().contains("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"),"Title match");
	     driver.quit();
	}

}
