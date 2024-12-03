package seleniumPack;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleAssign {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/login");
		
		WebElement clickOnElementSelenium = driver.findElement(By.cssSelector("[href='http://elementalselenium.com/']"));
		clickOnElementSelenium.click();
		
		List<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		
		WebElement input = driver.findElement(By.xpath("//input[@id='email']"));
		input.click();
		input.sendKeys("johndoe12@gmail.com");
		driver.findElement(By.cssSelector("[name='fields[programming_language]']")).click();
		driver.findElement(By.cssSelector("[value='python']")).submit();
		
		driver.switchTo().window(tabs.get(0));
		
		driver.findElement(By.cssSelector("#username")).sendKeys("tomsmith");
		
		driver.findElement(By.cssSelector("#password")).sendKeys("SuperSecretPassword!");
		
		driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in")).click();
		
	}
}
