package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropDownPage;
import pages.HomePage;

public class DropDownTests extends BaseTests {
    @Test
    public void testDropDown() {
        HomePage homePage = new HomePage(driver);
        String option = "Option 1";
        DropDownPage dropDownPage = homePage.clickDropDown();
        dropDownPage.selectFromDropDown(option);
        var selectedOptions = dropDownPage.getDropDownOptions();
        Assert.assertEquals(selectedOptions.size(), 1,"Wrong number of options selected");
        Assert.assertTrue(selectedOptions.contains(option),"Wrong option selected");
    }
}
