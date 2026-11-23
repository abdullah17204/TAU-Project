package tests;

import org.testng.annotations.Test;
import pages.DynamicLoadingE2Page;
import pages.DynamicLoadingPage;
import pages.HomePage;

public class NavigationTests extends BaseTests{
    @Test
    public void navigationTests() {
        HomePage homePage = new HomePage(driver);
        DynamicLoadingPage dynamicLoadingPage = homePage.clickDynamicLoading();
        DynamicLoadingE2Page dynamicLoadingE2Page = dynamicLoadingPage.clickExample2();

    }
}
