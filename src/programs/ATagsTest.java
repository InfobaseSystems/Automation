package programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ATagsTest {
  
	  
		WebDriver driver;
		
		@Test
		public void loginElementsPresentTest() {
			
			System.out.println("Running Test");
			boolean HMHomePagePresent = false;
			
			List<WebElement> aElements = driver.findElements(By.tagName("a"));
			int numberOfAElements = aElements.size();
			System.out.println("There are "+ numberOfAElements +"a tags in the page");
			
			for(WebElement a : aElements) {
				System.out.println(a.getText());
				if(a.getText().equalsIgnoreCase("H&M HOME")) {
					HMHomePagePresent = true;
					break; //breaks the loop after finding the a tag of H&M HOME remove it run for all the a tags
				}
			}
			Assert.assertTrue(HMHomePagePresent);
		    
		    
		   
		}
		@BeforeMethod
		public void setUp() {
			
			System.out.println("Starting Test");
			System.out.println("Initializing the driver");
			System.setProperty("webdriver.chrome.driver","/Users/vije/Downloads/chromedriver/");
		    driver = new ChromeDriver();
		    driver.get("https://www.hm.com/us/login");
		}
		
		@AfterMethod
		public void tearDown() {
			
			System.out.println("Closing Test");
			driver.close();
			
		}

	}
  

