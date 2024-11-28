package seleniumPack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingPopUps {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html#google_vignette");
		
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("window.scrollBy(0, 250)");
		
		// Alert Pop Up
		WebElement alert = driver.findElement(By.cssSelector("[onclick='alertFunction()']"));
		alert.click();
		
		Alert alert1 = driver.switchTo().alert();
		System.out.println("Alert Box text is: " + alert1.getText());
		alert1.accept();
		
		// Confirm Pop Up.
		WebElement confirm = driver.findElement(By.cssSelector("#confirmBox"));
		confirm.click();
	
		Alert confirm1 = driver.switchTo().alert();
		System.out.println("Confirmation Box text is: " + confirm1.getText());
		confirm1.accept();
		
		// Prompt Box.
		WebElement prompt = driver.findElement(By.cssSelector("#promptBox"));
		prompt.click();
		
		Alert prompt1 = driver.switchTo().alert();
		System.out.println("Prompt Box text is: " + prompt1.getText());
		prompt1.accept();
		
		driver.quit();
		
	}
}
