package seleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartAutomation {

    public static void main(String[] args) throws InterruptedException {
      
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.flipkart.com/");

        // Test action - 1.
        try {
            WebElement closeLoginPopup = driver.findElement(By.cssSelector("button._2KpZ6l._2doB4z"));
            closeLoginPopup.click();
        } catch (Exception e) {
            System.out.println("Login popup did not appear.");
        }

        // Test action - 2.
        String actual_title = driver.getTitle(); 
        
        System.out.println("Actual Title: " + actual_title);
        
        if (actual_title.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!")) { 
        	System.out.println("Title verification passed!"); 
        	} else {
        		System.out.println("Title verification failed!");
        		}
        
        Thread.sleep(1000);
        
        // Test action - 3.
        WebElement cartBtn = driver.findElement(By.cssSelector("[class='_3RX0a-']"));
        cartBtn.click();
      
        // Test action - 4.
        WebElement searchBar = driver.findElement(By.name("q"));
        searchBar.sendKeys("iphone 15 pro max");
        searchBar.submit();
        
        // Test action - 5.
        WebElement loginbtn = driver.findElement(By.cssSelector("[class='wsejfv']"));
        loginbtn.click();
        
        //Test action - 6.
        driver.findElement(By.cssSelector("[class='QqFHMw NEEcDr']")).click();
        
        // Test action - 7.
        driver.findElement(By.name("q")).clear();
        
        // Test action - 8.
        WebElement becomeSeller = driver.findElement(By.cssSelector("[class='CDJO0-']"));
        becomeSeller.click();
        
        // Test action - 9
        WebElement element = driver.findElement(By.cssSelector("a.styles__Anchor-sc-a90kxg-11.styles__StyledPreHeaderAnchor-sc-uypo58-2.fciqmG")); 
        String text1 = element.getText(); 
        System.out.println("Element Text: " + text1);
        
        
        // Test action - 10.
        driver.findElement(By.cssSelector("div[aria-label='Electronics']")).click();
        WebElement ele =  driver.findElement(By.cssSelector("[class='_1BJVlg _11MZbx']"));
        		String text = ele.getText();
        		
        		System.out.println("Text content: " + text);
        		
        
        
        driver.quit();
        
    }
}
