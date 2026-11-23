package tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.DynamicLoadingE2Page;
import pages.DynamicLoadingPage;
import pages.HomePage;

import java.lang.reflect.AccessFlag;

public class NavigationTests extends BaseTests{
    @Test
    public void navigationTests() {
        HomePage homePage = new HomePage(driver);
        DynamicLoadingPage dynamicLoadingPage = homePage.clickDynamicLoading();
//        getWindowManager().back();
//        getWindowManager().refresh();
//        getWindowManager().forward();
//        getWindowManager().goTo("https://www.google.com");

        var finishMessage = homePage.clickDynamicLoading().clickExample2().clickStartButton();
    }
}
