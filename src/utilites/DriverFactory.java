package utilites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {
	
	public static WebDriver open(String browserType) {
		
		if(browserType.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","/Users/vije/Downloads/geckodriver/");
			 return new FirefoxDriver();
		}
		else if (browserType.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver","/Users/vije/Downloads/IEDriverdriver/");
			 return new InternetExplorerDriver();
			
		}
		else{
				System.setProperty("webdriver.chrome.driver","/Users/vije/Downloads/chromedriver/");
			    return new ChromeDriver();
			}
		}

	
	
}


