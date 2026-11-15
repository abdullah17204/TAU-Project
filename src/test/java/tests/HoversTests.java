package tests;

import dataproviders.HoversData;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HoversPage;

public class HoversTests extends BaseTests{
    @Test (dataProviderClass = HoversData.class, dataProvider = "indexes")
    public void HoversTests(int index,String figureCaption){
        HoversPage hoversPage = new HoversPage(driver);
        var hoversFigure = hoversPage.HoverOverFigure(index);
        Assert.assertTrue(hoversFigure.isHeaderDisplayed());
        Assert.assertEquals(hoversFigure.getHeader(), figureCaption);
    }
}
