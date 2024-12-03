package seleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingIframes_Assign {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://v1.training-support.net/selenium/iframes");
		
		 String title =  driver.getTitle();
		 System.out.println("The title is: " + title);
		
		// Switching to Iframe 1.
		WebElement iframe1 = driver.findElement(By.xpath("(//iframe)[1]"));
		driver.switchTo().frame(iframe1);
		
		// Perform action on the iframe 1 button
		driver.findElement(By.cssSelector("#actionButton")).click();
		
		// Switching back to main Content
		driver.switchTo().defaultContent();
		
		// Switching to Iframe 2.
		WebElement iframe2 = driver.findElement(By.xpath("(//iframe)[2]"));
		driver.switchTo().frame(iframe2);
		
		// Perform action on the iframe 1 button
		driver.findElement(By.cssSelector("#actionButton")).click();
		
		driver.quit();
	}
}
