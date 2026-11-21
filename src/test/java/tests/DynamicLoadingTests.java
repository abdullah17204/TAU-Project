package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicLoadingE2Page;
import pages.HomePage;

public class DynamicLoadingTests extends BaseTests{
    @Test
    public void DynamicLoadingTest(){
        HomePage homePage = new HomePage(driver);
        var dynamicLoadingPage = homePage.clickDynamicLoading();
        var dynamicLoadingE2Page = dynamicLoadingPage.clickExample2();
        dynamicLoadingE2Page.clickStartButton();
        Assert.assertEquals(dynamicLoadingE2Page.getFinishConformation(),"Hello World!");
    }
}
