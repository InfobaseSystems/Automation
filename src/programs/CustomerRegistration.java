package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.safari.SafariDriver;


	
/*	public void click(WebElement element) {
		   
		while(true){
	        try{
	            element.click();
	            break;
	        }catch (Throwable e){
	            try {
	                Thread.sleep(200);
	            } catch (InterruptedException e1) {
	                e1.printStackTrace();
	        }
	    }
		}
*/


public class CustomerRegistration {
	
	public static void main(String[] args) {
	
		
		
		//Registration using firefox(gecko) driver
		/*System.setProperty("webdriver.safari.driver", "/Users/vije/Downloads//");
		org.openqa.selenium.WebDriver driver = new SafariDriver();*/
		
	
		
		//Registration using chrome driver
		System.setProperty("webdriver.chrome.driver","/Users/vije/Downloads/chromedriver/");
	    WebDriver driver = new ChromeDriver();
		driver.get("https://www.hm.com/us/my-hm#register");
		//driver.get("https://www.hm.com/us/login");
		//driver.findElement(By.tagName("Register")).click();
		
		driver.findElement(By.id("mysite-input-reg-username")).sendKeys("nicky.viju@gmail.com");
		driver.findElement(By.id("mysite-input-reg-password")).sendKeys("Dhikha");
		driver.findElement(By.id("mysite-input-reg-passwordRetype")).sendKeys("Dhikha");
		
		//driver.findElement(By.xpath("//*[@id=\"mysite-form-register\"]/div[2]/label/span")).click();
		//driver.findElement(By.xpath("//*[@id=\"mysite-input-isNewsletterSubscription\"]")).click();
		//WebElement element=driver.findElement(By.xpath("//*[@id=\"mysite-form-register\"]/div[2]/label"));
		
		
		
		driver.findElement(By.id("mysite-input-reg-postalCodeWithoutAddress")).sendKeys("23233");
		driver.findElement(By.id("mysite-input-reg-gender2")).click();
		
		
		
		//WebElement element = driver.findElement(By.id("mysite-input-isNewsletterSubscription"));
	//	((JavascriptExecutor) driver).executeScript("window.scrollTo(0,"+element.getLocation().y+")");
		// Click the element
		//element.click();
		
		
		
		
		
		
		//driver.findElement(By.cssSelector("button[type='submit'][id ='mysite-btn-submit-register']")).click();
		

		}

}
