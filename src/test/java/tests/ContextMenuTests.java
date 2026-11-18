package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ContextMenuPage;
import pages.HomePage;

public class ContextMenuTests extends BaseTests{
    @Test
    public void contextMenuTest(){
        HomePage homePage = new HomePage(driver);
        ContextMenuPage contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.rightClickHotSpot();
        Assert.assertEquals(contextMenuPage.alert_GetText(),"You selected a context menu");
        contextMenuPage.alert_accept();
    }
}
