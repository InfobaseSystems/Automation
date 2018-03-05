package programs;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilites.DriverFactory;

public class Expedia {
	
	WebDriver driver;
	String browserType = "Chrome";
	String city = "NewYork";
	String checkIn = "02/01/2018";
	String checkOut = "02/10/2018";
	String numOfGuest = "2";
	String searchResult = "2";
	
	
	@Test
	public void hotelReservation() {
		
		//1.Search
		//driver.findElement(By.id("tab-hotel-tab-hp")).click();
		driver.findElement(By.xpath("//*[@id=\"hotel-destination-hlp\"]")).sendKeys(city);
		//driver.findElement(By.xpath("//*[@id=\"hotel-destination-hp-hotel\"]")).sendKeys(city);
		
		driver.findElement(By.id("hotel-checkin-hlp")).clear();
		driver.findElement(By.xpath("//*[@id=\"hotel-checkin-hlp\"]")).sendKeys(checkIn);
		
		
		driver.findElement(By.id("hotel-checkout-hlp")).clear();
		driver.findElement(By.xpath("//*[@id=\"hotel-checkout-hlp\"]")).sendKeys(checkOut);
	
		new Select(driver.findElement(By.xpath("//*[@id=\"gcw-hotel-form-hlp\"]/div[4]/div[4]/label/select"))).selectByValue(numOfGuest);
		driver.findElement(By.xpath("//*[@id=\"gcw-hotel-form-hlp\"]/div[9]/label")).click();
		
		
		
		//Print the name of the city 
		//*[@id="hotelResultTitle"]/h1
		String actualCity = driver.findElement(By.xpath("//*[@id=\"hotelResultTitle\"]/h1")).getText();
		System.out.println("CITY: "+actualCity);
		
		//2.Modify the search results page ,give criteria
		driver.findElement(By.cssSelector("input[name='star'][id='star4']")).click();
		//Selects second hotel in any displayed page
		driver.findElement(By.xpath("//*[@id=\"resultsContainer\"]/section/article[" + searchResult + "]/div[2]/div/a")).click();//not working properly
		//Switch the window to the pop
		ArrayList<String>windows = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windows.get(1));
		//Print hotel name and start rating
		String hotelName = driver.findElement(By.id("hotel-name")).getText();
		String hotelRating = driver.findElement(By.cssSelector("span[class='rating-scale']")).getText();
		System.out.println("HOTELNAME: "+hotelName);
		System.out.println("RATING: "+hotelRating);
		
		
		//3.Analyze the results and make our selection 
		
		//4.Book reservation 
		
		//5.Fill out contact/billing
		
		//6.Get confirmation
		
		
	}
	@BeforeMethod
	public void setUp() {
		
		/*ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		options.addArguments("--start-maximized");
		options.addArguments("test-type");
		options.addArguments("--js-flags=--expose-gc");
		options.addArguments("--enable-precise-memory-info");
		options.addArguments("--disable-popup-blocking");
		options.addArguments("--disable-default-apps");
		options.addArguments("test-type=browser");   */
		

		driver = DriverFactory.open(browserType);	
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.get("https://www.expedia.com/Hotels");
	}
	
	@AfterMethod
	public void teardown() {
		//driver.quit();
	
	}
	
	
	

}
