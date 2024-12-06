package seleniumPack;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class SnapDealSearchAssign {
    public static void main(String[] args) {
       
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://www.snapdeal.com");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("inputValEnter")));

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].value='Shoe';", searchBox);

            WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.searchformButton")));

            js.executeScript("arguments[0].click();", searchButton);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
