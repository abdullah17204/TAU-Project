package tests;

import dataproviders.LoginData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.LoginPage;
import pages.HomePage;
import pages.SecurePage;

public class LoginTests extends BaseTests{

    @Test (dataProviderClass = LoginData.class, dataProvider = "loginCredentials")
    public void loginTest(String username,String password,boolean expectedResult){

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);

        homePage.clickFormAuth();
        loginPage.login(username, password);

        if (expectedResult) {
            // Valid Login Credentials
            SecurePage securePage = new SecurePage(driver);
            String pageFlashTest = securePage.getFlashTest();
            Assert.assertTrue(pageFlashTest.contains( "You logged into a secure area!"), "Valid login credentials failed");
        }
        else {
            // Invalid login Credentials
            String errorMessage = loginPage.getFailFlash();
            Assert.assertTrue(errorMessage.contains("invalid!"), "Invalid credentials logged in");
        }
    }

}
