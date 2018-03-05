package programs;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pageTitleJunit {
	
	//Declare variables/objects at class level to use it throughout the program
	WebDriver driver;
	String webURL = "https://www.hm.com/us/";
	
	
	
	@Test
	public void pageTitleTest() {
		
		System.out.println("Running the test");
		driver.get(webURL);
	    String actualTitle = driver.getTitle();
	    String expectedTitle = "H&M offers fashion and quality at the best price | H&M US";
	    Assert.assertEquals(expectedTitle, actualTitle);
	    
	    //Assert.fail("We intentionally failed this test");
	}
	
	@Before
	public void setUp() {
		
		System.out.println("Setting up the test environment");
		System.out.println("Initializing the driver");
		System.setProperty("webdriver.chrome.driver","/Users/vije/Downloads/chromedriver/");
	    driver = new ChromeDriver();
	}
	
	@After
	public void tearDown() {
		System.out.println("Closing the test environment");
		driver.close();
	}

}
