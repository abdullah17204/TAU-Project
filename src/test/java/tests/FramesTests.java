package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FramesPage;
import pages.HomePage;
import pages.NestedFramesPage;

public class FramesTests extends BaseTests{
    @Test
    public void FramesTest(){
        HomePage homePage = new HomePage(driver);
        FramesPage framesPage = homePage.clickFrames();
        NestedFramesPage nestedFramesPage = framesPage.clickNestedFrames();

        Assert.assertEquals(nestedFramesPage.getLeftFrameText(), "LEFT");
        Assert.assertEquals(nestedFramesPage.getBottomFrameText(), "BOTTOM");
    }
}
