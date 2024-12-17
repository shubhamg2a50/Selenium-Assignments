package DataProviderAssignment.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
    WebDriver driver;
    DataProviderAssignment.pageObject.LoginPage loginPage;

    @BeforeClass
    public void setup() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://v1.training-support.net/selenium/login-form");

        loginPage = new DataProviderAssignment.pageObject.LoginPage(driver);
    }

    @Test(dataProvider = "loginData", dataProviderClass = DataProviderAssignment.testData.LoginData.class)
    public void testLogin(String username, String password) {

        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLogin();

        String confirmationMessage = loginPage.getConfirmationMessage();

        if (username.equals("admin") && password.equals("password")) {
            Assert.assertEquals(confirmationMessage, "Welcome Back, admin");
        } else {
            Assert.assertEquals(confirmationMessage, "Invalid Credentials");
        }

        driver.navigate().refresh();
    }

    @AfterClass
    public void tearDown() {

        driver.quit();
    }
}
