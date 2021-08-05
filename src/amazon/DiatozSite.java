package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DiatozSite{ 
	
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\csajj\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.diatoz.com/");
		System.out.println("I hitted Diatoz URL successfully");
		
		driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
		Thread.sleep(5000);
		System.out.println("I clicked on home nav item");
		
		driver.findElement(By.xpath("//li[@class='nav-item nav-link submenu']//a[normalize-space()='Services']")).click();
		Thread.sleep(5000);
		System.out.println("I clicked on Service nav item");
		
		driver.findElement(By.xpath("//a[normalize-space()='Internet Of Things']")).click();
		Thread.sleep(2000);
		System.out.println("I clicked on IOT to check whether the value is present"); 
		
		String iotText = driver.findElement(By.xpath("//section[@id='common-banner']//h1[contains(text(),'Internet Of Things')]")).getText();
		System.out.println(iotText);
		System.out.println("I verified IOT to check whether the value is present");
		Thread.sleep(2000); 
		
		driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
		System.out.println("I clicked on home nav item");
		Thread.sleep(5000);
		String diatozLogo = driver.findElement(By.xpath("//a[normalize-space()='Know About Our COVID-19 Policy']")).getText();
		System.out.println(diatozLogo);
		System.out.println("I verifed to know about covid policies of Diatoz");
		
		driver.findElement(By.xpath("//a[normalize-space()='Products']")).click();
		Thread.sleep(5000);
		System.out.println("I clicked on Products nav");
		
		driver.findElement(By.xpath("//a[contains(text(),'E2EHiring')]")).click();
		Thread.sleep(2000);
		System.out.println("I clicked on E2EHiring");
		
		driver.findElement(By.xpath("//a[normalize-space()='About Us']")).click();
		Thread.sleep(2000);
		System.out.println("I Clicked on AboutUs");
		
		driver.findElement(By.xpath("//a[normalize-space()='Life At DIATOZ']")).click();
		Thread.sleep(2000);
		System.out.println("I clicked on LifeAtDIATOZ");
		
		driver.findElement(By.xpath("//a[contains(text(),'Contact Us')]")).click();
		Thread.sleep(5000);
		System.out.println("I clicked on ContactUs");
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("xyz");
		Thread.sleep(2000);
		System.out.println("I Entered the value in Name Field");
		
		driver.findElement(By.xpath("//input[@placeholder='Phone']")).sendKeys("0987654321");
		Thread.sleep(2000);
		System.out.println("I entered the value in Phone Field");
		
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("abc@gmail.com");
		Thread.sleep(2000);
		System.out.println("I entered the value in Email Field");
		
		driver.findElement(By.xpath("//textarea[@placeholder='Description']")).sendKeys("Hello all");
		Thread.sleep(2000);
		System.out.println("I entered the value in Descrip Field");
		
		driver.findElement(By.xpath("//input[@placeholder='Enter your email']")).sendKeys("abc@gmail.com");
		Thread.sleep(2000);
		System.out.println("I entered the value in Email Field present at the end");
		
		driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
		System.out.println("I clicked on home nav item");
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Know About Our COVID-19 Policy")).click();
		System.out.println("I clicked on Know about Covid nav item");
		Thread.sleep(5000);
		
		driver.quit();
	}
	
}