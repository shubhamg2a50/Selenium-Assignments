package DataProvider;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class DataProviderDemo {
    
	WebDriver driver;
	
    @Test(groups = { "smoke" }, priority = 1)
    public void setUp() {
    	
    	driver = new ChromeDriver();
    	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
    }

    @Test(groups = { "regression" }, priority = 2)
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

    @Test(groups = { "smoke", "regression" }, priority = 3, dependsOnMethods = { "setUp" })
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

    @AfterClass(groups = { "smoke" })
    public void tearDown() {
       driver.quit();
    }

}
