package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/vije/Downloads/chromedriver/");
		org.openqa.selenium.WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hm.com/us/login");
		
		driver.findElement(By.name("username")).sendKeys("deivaa.22@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Dhikha");
		
		driver.findElement(By.name("login")).click();
		
		String message = driver.findElement(By.id("heading.mysitestart")).getText();
		System.out.println("Confirmation : " + message);
		
		

		
	}

}
