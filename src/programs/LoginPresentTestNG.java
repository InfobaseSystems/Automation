package programs;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPresentTestNG {
	WebDriver driver;
	
	@Test
	public void loginElementsPresentTest() {
		
		System.out.println("Running Test");
		
	    driver.get("https://www.hm.com/us/login");
	    
	    boolean loginEmailBox = driver.findElement(By.id("input-login-username")).isDisplayed();
	    boolean passwordBox = driver.findElement(By.id("input-login-password")).isDisplayed();
	    
	    Assert.assertTrue(loginEmailBox,"Username box is present");
	    Assert.assertTrue(passwordBox,"Password box is present");
	    
	    //Assert.assertTrue(!passwordBox,"Password box is not present");
	}
	@BeforeMethod
	public void setUp() {
		
		System.out.println("Starting Test");
		System.out.println("Initializing the driver");
		String browserType = "Chrome";
		driver = utilites.DriverFactory.open(browserType );
		//System.setProperty("webdriver.chrome.driver","/Users/vije/Downloads/chromedriver/");
	    //driver = new ChromeDriver();
	}
	
	@AfterMethod
	public void tearDown() {
		
		System.out.println("Closing Test");
		driver.close();
		
	}

}
