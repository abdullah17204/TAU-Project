package tests;

import org.testng.annotations.Test;
import pages.ContextMenuPage;
import pages.HomePage;

public class ContextMenuTests extends BaseTests{
    @Test
    public void contextMenuTest(){
        HomePage homePage = new HomePage(driver);
        ContextMenuPage contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.rightClickHotSpot();
        contextMenuPage.alert_accept();
        contextMenuPage
    }
}
