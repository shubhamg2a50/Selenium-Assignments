package stepOfDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SimpleFormStep {

    WebDriver driver;

    @Given("I am on the Simple Form page")
    public void i_am_on_the_simple_form_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://v1.training-support.net/selenium/simple-form");
        driver.manage().window().maximize();
    }


    @When("I enter {string} in the input box")
    public void i_enter_in_the_input_box() {
        WebElement firstname = driver.findElement(By.id("firstName"));
        firstname.sendKeys("Shubham");
        
        WebElement lastname = driver.findElement(By.id("lastName"));
        lastname.sendKeys("Gupta");
        
        WebElement emailfield = driver.findElement(By.id("email"));
        emailfield.sendKeys("shubham@gmail.com");
    }

    @And("I click the {string} button")
    public void i_click_the_button() {
        WebElement submitButton = driver.findElement(By.cssSelector("input[value='submit']"));
        submitButton.click();
    }

    @Then("I should see {string} as the output")
    public void i_should_see_as_the_output(String expectedOutput) {
        WebElement output = driver.findElement(By.id("message"));
        String actualOutput = output.getText();
        assert actualOutput.equals(expectedOutput) : "Expected: " + expectedOutput + " but got: " + actualOutput;
        driver.quit();
    }
}

