package seleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookSignUpAutomation {

	public static void main(String[] args) {
		
		// Setting up the Browser Driver chrome.
		WebDriverManager.chromedriver().setup();
		WebDriver driver1 = new ChromeDriver();
		
		// Visiting or Open the website URL.
		driver1.get("https://www.facebook.com/r.php");
		
		// Printing the Website Title.
		String title = driver1.getTitle();
		System.out.println(title + ".");
		
		// Printing the header text of Container Box.
		WebElement text = driver1.findElement(By.cssSelector("[class='mbs _52lq _9bp_ fsl fwb fcb']"));
		String headtxt = text.getText();
		System.out.println(headtxt + ".");
		
		// Enter First Name.
		WebElement firstName = driver1.findElement(By.name("firstname"));
		firstName.sendKeys("JOE");
		
		// Enter Last Name.
		WebElement lastName = driver1.findElement(By.name("lastname"));
		lastName.sendKeys("GOLDBERG");
		
		// Select Date of Day
		WebElement day = driver1.findElement(By.id("day"));
		day.click();
		driver1.findElement(By.xpath("//option[@value='19']")).click();
		day.click();
		
		// Select Month.
		WebElement month = driver1.findElement(By.xpath("//select[@id='month']"));
		month.click();
		driver1.findElement(By.cssSelector("select[id='month'] option[value='9']")).click();
		month.click();
		
		//Select Year.
		WebElement year = driver1.findElement(By.cssSelector("#year"));
		year.click();
		driver1.findElement(By.xpath("//option[@value='1988']")).click();
		year.click();
		
		// Select Gender.
		WebElement gender = driver1.findElement(By.xpath("//label[normalize-space()='Male']"));
		gender.click();
		
		// Enter Mobile no..
		WebElement mobile = driver1.findElement(By.name("reg_email__"));
		mobile.sendKeys("9167788998");
		
		//Enter Password.
		WebElement password = driver1.findElement(By.id("password_step_input"));
		password.sendKeys("joegold19");
		
		// Click on Sign Up button.
		WebElement button = driver1.findElement(By.name("websubmit"));
		
		if(button.isEnabled()) {
			button.click();
			System.out.println("Clicked on Sign Up button and it is enabled");
		}
		else {
			System.out.println("Sign up button is not enabled");
		}
		
		System.out.println("Sign Up process done successfully!");
	
		driver1.quit();
		
	}
	
}
