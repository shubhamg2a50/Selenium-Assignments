package seleniumPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementCmds {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// This is the Operation 1 of editBox.
		WebElement editbox = driver.findElement(By.id("name"));
		
		if(editbox.isEnabled()) {
			System.out.println("Edit box is enabled.");
			
			editbox.sendKeys("shubha");
			
			editbox.clear();
			
			editbox.sendKeys("Shubh");
			
			String enteredValue = editbox.getAttribute("value");
			System.out.println("Value in edit box: " + enteredValue);
		}
		else {
			System.out.println("Edit box is not enabled.");
		}
		
		// This is the Operation 2 Button.
		WebElement btnClick = driver.findElement(By.cssSelector("#opentab"));
		
		if(btnClick.isEnabled()) {
			System.out.println("Button is enabled");
			
			btnClick.click();
			
		    String btnTxt = btnClick.getText();
			System.out.println("Button contains text: " + btnTxt);
		}
		else {
			System.out.println("Button is not enabled");
		}
		
		// This is the Operation 3 CheckBox.
		List<WebElement> checkboxes = driver.findElements(By.xpath("(//input[@type='checkbox'])"));
		
		for(WebElement checkbox : checkboxes) {
			if(!checkbox.isSelected()) {
				checkbox.click();
			}
			boolean isSelected = checkbox.isSelected();
			System.out.println("Checkbox is selected: " + isSelected);
		}
	
	    // This is the Operation 4 Radio Button
		List<WebElement> radioButtons = driver.findElements(By.name("radioButton"));
		
		for(WebElement radioButton : radioButtons) {
			String value = radioButton.getAttribute("value");
			if(value.equals("radio1")) {
				radioButton.click();
				break;
			}
		}
		
		for(WebElement radioButton : radioButtons) {
			boolean isSeleected = radioButton.isSelected();
			String value = radioButton.getAttribute("value");
			System.out.println("Radio Button value: " + value + " | Selected: " + isSeleected);
		}
		
		driver.quit();		
	}
}
