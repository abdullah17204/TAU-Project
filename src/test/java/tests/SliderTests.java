package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.SliderPage;

public class SliderTests extends BaseTests{
    @Test
    public void sliderTest(){
        HomePage homePage = new HomePage(driver);
        SliderPage sliderPage = homePage.clickSilder();
        sliderPage.moveSlider(5);
    }
}
