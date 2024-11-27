package seleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BigBasket {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.bigbasket.com/");
		
		driver.findElement(By.xpath("(//input[contains(@placeholder, 'Search for Products..')])"));
		
		driver.findElement(By.xpath("(//span[contains(text(),'Shop by')])"));
		
		driver.findElement(By.xpath("(//span[contains(text(),'Category')])"));
		
		driver.findElement(By.xpath("(//span[contains(text(),'Fresh Vegetables')])"));
		
		driver.findElement(By.xpath("(//span[contains(text(),'Snacks Store')])"));
		
		driver.quit();
		
	}
}
