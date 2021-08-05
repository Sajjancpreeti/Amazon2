package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\csajj\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://omayo.blogspot.com/");
		
		driver.findElement(By.xpath("//input[@id='uploadfile']")).sendKeys("C:\\Users\\csajj\\Downloads\\ScreenShot1.png");
		System.out.println("first");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@id='uploadfile']")).sendKeys("C:\\Users\\csajj\\Downloads\\ScreenShot2.png");
		System.out.println("Second");

}

}
