package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon2 {
	
public static void main(String args[]) throws InterruptedException{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\csajj\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		System.out.println("Launched the Amazon Website");
		
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//span[normalize-space()='Account & Lists']"));
		action.moveToElement(element).perform();
		Thread.sleep(2000);
		System.out.println("Hover on Accout & Lists");
		
		driver.findElement(By.xpath("//span[@class='nav-action-inner']")).click(); 
		Thread.sleep(2000);
		System.out.println("I Click on Sign-in Option");
		
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("8073202229");
		Thread.sleep(2000);
		System.out.println("I enter the email/phone filed");
		
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		Thread.sleep(2000);
		System.out.println("I Click on Continue");
		
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("IshaaNAyaaN");
		Thread.sleep(2000);
		System.out.println("I Enter the password");
		
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		Thread.sleep(5000);
		System.out.println("I click on Sign-in submit");
		
		driver.findElement(By.xpath("//div[@class='hud-profile-category-box hud-profile-categories-container-0']//a[@aria-label='top categories recomendations']")).click();
		Thread.sleep(5000);
		System.out.println("I navigate to My Order Page");
		
		driver.navigate().back();
		Thread.sleep(2000);
		System.out.println("I navigate back to Home Page");
		
		Actions action2 = new Actions(driver);
		WebElement element2 = driver.findElement(By.xpath("//span[normalize-space()='Account & Lists']"));
		action2.moveToElement(element2).perform();
		Thread.sleep(5000);
		System.out.println("Hover on Accout & Lists");
		
		driver.findElement(By.xpath("//span[normalize-space()='Sign Out']")).click();
		Thread.sleep(2000);
		System.out.println("I log out of Amazon Website");
		
		driver.quit();
		
	}
}
