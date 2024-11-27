package seleniumPack;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayAnutomation {
    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();
 
        driver.get("https://www.ebay.com");

        // Test action - 1.
//        WebElement signInButton = driver.findElement(By.xpath("//a[text()='Sign in']"));
//        signInButton.click();

        // Test action - 2.
//        WebElement dealsLink = driver.findElement(By.xpath("//a[text()='Sell']"));
//        dealsLink.click();

        // Test action - 3.
//        WebElement myEbay = driver.findElement(By.xpath("//a[text()='My eBay']"));
//        myEbay.click();

        // Test action - 4.
   //     driver.findElement(By.xpath("(//a[text()='Electronics'])[1]")).click();

        // Test action - 5.
        WebElement helpContactLink = driver.findElement(By.xpath("//a[text()='Help & Contact']"));
        helpContactLink.click();

        driver.quit();
    }
}
