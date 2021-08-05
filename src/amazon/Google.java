package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google {
	
	public static void main(String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\csajj\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		System.out.println("Lauched Google");
		
		String title = driver.getTitle();
		System.out.println("The title of the application is:"+title);
		
		WebElement search = driver.findElement(By.xpath("//input[@title='Search']"));
		search.sendKeys("iPhone");
		Thread.sleep(2000);
		System.out.println("I entered the item to be searched");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(6000);
		System.out.println("I clicked on search button");
		
		driver.findElement(By.xpath("//img[@alt='Google']")).click();
		Thread.sleep(4000);
		System.out.println("Press on Google");
		
		WebElement search1= driver.findElement(By.xpath("//input[@title='Search']"));
		search1.sendKeys("Samsung");
		search1.sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		System.out.println("Enter Samsung on search bar");
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
		driver.get("https://www.myntra.com/");
		Thread.sleep(3000);
		System.out.println("New tab");
		
		WebElement search2 = driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
		search2.sendKeys("Dresses");
		search2.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		System.out.println("Search for dresses");
		
		
		driver.quit();
		
	}

}