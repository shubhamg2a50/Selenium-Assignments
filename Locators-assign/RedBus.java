package seleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {
	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.com/");
		
		driver.findElement(By.xpath("//img[@class='hero-image']"));
		
		driver.findElement(By.xpath("//div[@class='cust-wrapper']"));
		
		driver.findElement(By.xpath("//div[@id='return-box']"));
		
		driver.findElement(By.xpath("//img[@src='https://st.redbus.in/Images/rdc/Oxford-ImResizer.jpeg']"));
		
		driver.findElement(By.xpath("//div[@class='manageHeaderLbl']"));
		
		driver.findElement(By.xpath("//div[@id='curr_chosen']"));
		
		driver.findElement(By.xpath("//a[@id='Airport Transfers']"));
		
		driver.findElement(By.xpath("//img[@class='home-redirect rdc-redbus-logo ']"));
		
		driver.findElement(By.xpath("//a[normalize-space()='Help']"));
		
		driver.findElement(By.xpath("//div[@id='lang_chosen']//img[contains(@class,'flags')]"));
		
		driver.findElement(By.xpath("//div[contains(@class,'source input-box')]"));
		
		driver.findElement(By.xpath("//div[@class='toggle']"));
		
		driver.findElement(By.xpath("//div[@class='destination input-box']"));
		
		driver.findElement(By.xpath("//div[@class='destination input-box']"));
		
		driver.findElement(By.xpath("//div[@class='input-area']"));
		
		driver.findElement(By.xpath("//div[@id='date-box']"));
		
		driver.findElement(By.xpath("//div[@class='trvl-head']"));
		
		driver.findElement(By.xpath("//div[@class='trvl-wrapper']//a[1]"));
		
		driver.findElement(By.xpath("//div[@class='safety-wrapper']"));
		
		driver.findElement(By.xpath("//footer[@id='rh_footer rdc-login']"));
		
		driver.quit();
		
	}

}
