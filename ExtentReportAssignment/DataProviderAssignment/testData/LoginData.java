package DataProviderAssignment.testData;

import org.testng.annotations.DataProvider;

public class LoginData {
    @DataProvider(name = "loginData")
    public Object[][] getLoginData() {
        return new Object[][] {
                { "admin", "password" },
                { "shubham", "shubham123" },
                { "rohit", "rohit456" },
                { "shivam", "shivam789" },
                { "user123", "user123" },
                { "admin", "wrongpassword" },
                { "user", "password" },
                { "inpass", "inpass121" },
                { "selenium", "webdriver" },
                { "user", "pass" }
        };
    }
}
