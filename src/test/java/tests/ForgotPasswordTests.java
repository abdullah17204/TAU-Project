package tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.EmailSentPage;
import pages.ForgotPasswordPage;
import pages.HomePage;

public class ForgotPasswordTests extends BaseTests {
    @Test
    public void forgotPasswordTest(){
        HomePage homePage = new HomePage(driver);
        String email = "John@doe.com";
        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPassword();
        forgotPasswordPage.enterEmail(email);
        EmailSentPage emailSentPage = forgotPasswordPage.clickRetrieve();
        Assert.assertTrue(emailSentPage.getEmailsentconformation().contains("Your e-mail's been sent!"));
    }
}
