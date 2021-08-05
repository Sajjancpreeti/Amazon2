package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\csajj\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver,30);
		driver.get("https://staging.twohootsapp.com/complaint/r5924888/optional");
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("btn btn-default btn-file"))));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='btn btn-default btn-file']")).sendKeys("C:\\Users\\csajj\\Downloads\\ScreenShot1.png");
		Thread.sleep(5000);
		System.out.println("upload");

		driver.quit();
	}

}
