package amazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {
	
	public static void main(String[] args) { 
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\csajj\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
	    String baseURL = "http://demo.guru99.com/test/newtours/register.php";
	   	WebDriver driver = new FirefoxDriver();
		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("First Done");

		Select drpCountry = new Select(driver.findElement(By.name("country")));
		drpCountry.selectByVisibleText("ANTARCTICA");
		
		//Selecting Items in a Multiple SELECT elements
		driver.get("http://jsbin.com/osebed/2");
		Select fruits = new Select(driver.findElement(By.id("fruits")));
		fruits.selectByVisibleText("Banana");
		fruits.selectByIndex(1);
		System.out.println("Second Done");
		
		driver.quit();
	}

}