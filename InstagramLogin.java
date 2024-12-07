package seleniumPack;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

public class InstagramLogin {
    public static void main(String[] args) {
      
        WebDriver driver = new ChromeDriver();

        try {
           
            driver.get("https://www.instagram.com/accounts/login/?hl=en");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
            WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));

            FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\testData\\InstagramData.xlsx");
            Workbook workbook = new XSSFWorkbook(file);
            Sheet sheet = workbook.getSheetAt(0);
            Row row = sheet.getRow(1);
            String username = row.getCell(0).getStringCellValue();
            String password = row.getCell(1).getStringCellValue();
            workbook.close();
            file.close();

            usernameField.sendKeys(username);
            passwordField.sendKeys(password);

            WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
            loginButton.click();

        } catch (IOException e) {
            e.printStackTrace();
            
        } catch (Exception e) {
           
            e.printStackTrace();
            
        } finally {
           
            driver.quit();
            
        }
    }
}
