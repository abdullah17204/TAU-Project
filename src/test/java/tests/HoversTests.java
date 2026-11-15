package tests;

import dataproviders.HoversData;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.HoversPage;

public class HoversTests extends BaseTests{
    @Test (dataProviderClass = HoversData.class, dataProvider = "indexes")
    public void HoversTests(int index,String figureCaption){
        HomePage homePage = new HomePage(driver);
        HoversPage hoversPage = homePage.clickHovers();
        var hoversFigure = hoversPage.HoverOverFigure(index);
        Assert.assertTrue(hoversFigure.isHeaderDisplayed());
        Assert.assertTrue(hoversFigure.getHeader().contains(figureCaption));
    }
}
