package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicLoadingE2Page;
import pages.HomePage;

public class DynamicLoadingTests extends BaseTests{
    @Test
    public void DynamicLoadingTest(){
        HomePage homePage = new HomePage(driver);
        var DynamicLoadingPage = homePage.clickDynamicLoading();
        var DynamicLoadingE2Page = DynamicLoadingPage.clickExample2();
        Assert.assertEquals(DynamicLoadingE2Page.getFinishConformation(),"Hello World");
    }
}
