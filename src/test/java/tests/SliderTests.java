package tests;

import dataproviders.SliderData;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SliderPage;

public class SliderTests extends BaseTests{
    @Test (dataProviderClass = SliderData.class,dataProvider = "slider data")
    public void sliderTest(double sliderGoal){
        HomePage homePage = new HomePage(driver);
        SliderPage sliderPage = homePage.clickSilder();
        var minValue = sliderPage.getMinValue();
        var maxValue = sliderPage.getMaxValue();
        var stepValue = sliderPage.getStepValue();
        if (sliderGoal < minValue || sliderGoal > maxValue || (sliderGoal%stepValue) != 0) {
            Assert.fail("invalid number"+sliderGoal);
        }
        sliderPage.moveSlider(sliderGoal);
        Assert.assertEquals(sliderPage.getSliderValue(), sliderGoal);
    }
}
