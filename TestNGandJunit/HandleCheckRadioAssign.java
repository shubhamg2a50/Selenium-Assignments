package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HandleCheckRadioAssign {

	WebDriver driver;
	
	@BeforeTest
	void setUp() {
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
	}
	
	@Test(priority = 1)
	void handleCheckBox() {
		WebElement checkBox = driver.findElement(By.name("checkBoxOption1"));
		checkBox.click();
		if(checkBox.isSelected()) {
			System.out.println("Check Box Option 1 is selected...");
		}
		else {
			System.out.println("Check Box is not be able to select...");
		}
		checkBox.click();
	}
	
	@Test(priority = 2)
	void radioButton() {
		WebElement radiobtn = driver.findElement(By.cssSelector("[value='radio1']"));
		radiobtn.click();
		if(radiobtn.isSelected()) {
			System.out.println("Radio Button 1 is selected...");
		}
		else {
			System.out.println("Radio Button is not be able to select...");
		}
		radiobtn.click();
	}
	
	@Test(priority = 3)
	void multipleCheckBox() {
		WebElement checkBox1 = driver.findElement(By.name("checkBoxOption1"));
		WebElement checkBox2 = driver.findElement(By.name("checkBoxOption2"));
		WebElement checkBox3 = driver.findElement(By.name("checkBoxOption3"));
		checkBox1.click();
		checkBox2.click();
		checkBox3.click();
		if(checkBox1.isSelected() && checkBox2.isSelected() && checkBox3.isSelected()) {
			System.out.println("Selected all the Check Boxes...");
		}
		else {
			System.out.println("Failed to select all the Check Boxes...");
		}
	}
	
	@Test(priority = 4)
	void multipleRadioBtn() {
		WebElement radiobtn1 = driver.findElement(By.cssSelector("[value='radio1']"));
		WebElement radiobtn2 = driver.findElement(By.cssSelector("[value='radio2']"));
		WebElement radiobtn3 = driver.findElement(By.cssSelector("[value='radio3']"));
		radiobtn1.click();
		radiobtn2.click();
		radiobtn3.click();
		if(radiobtn1.isSelected() || radiobtn2.isSelected() || radiobtn3.isSelected()) {
			System.out.println("Selected all the Radio Buttons...");
		}
		else {
			System.out.println("Failed to select all the Radio Button...");
		}
	}
	
	@AfterTest
	void setOff() {
		driver.close();
	}
}
