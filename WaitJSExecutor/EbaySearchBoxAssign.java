package seleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class EbaySearchBoxAssign {
    public static void main(String[] args) {
    	
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://www.ebay.com");

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            WebElement searchBox = driver.findElement(By.id("gh-ac"));

            searchBox.sendKeys("Shoe");

            WebElement searchButton = driver.findElement(By.id("gh-btn"));
            searchButton.click();

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".srp-results")));

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".srp-results")));

            js.executeScript("window.scrollTo(0, 0);");

            searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gh-ac")));
            searchBox.clear();

        } catch (StaleElementReferenceException e) {
            System.out.println("StaleElementReferenceException caught. Re-locating the element.");
            WebElement searchBox = driver.findElement(By.id("gh-ac"));
            searchBox.clear();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
