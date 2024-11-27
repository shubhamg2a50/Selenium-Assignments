package seleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	
	public static void main(String[] args) {

	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.com/");
	
	driver.findElement(By.xpath("(//div[@class='a-cardui-header'])[1]"));
	
	driver.findElement(By.xpath("(//div[@class='a-cardui _fluid-fat-image-link-v2_style_fluidFatImageLink__1nw4J'])[10]"));
	
	driver.findElement(By.xpath("(//a[@class='a-link-normal'])[25]"));
	
	driver.findElement(By.xpath("(//a[@class='a-link-normal dcl-product-link'])[60]"));
	
	driver.findElement(By.xpath("(//div[@class='dcl-product-image-container'])[38]"));
	
	driver.quit();
	
	}
	
}
