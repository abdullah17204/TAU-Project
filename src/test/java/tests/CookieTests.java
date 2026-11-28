package tests;

import org.openqa.selenium.Cookie;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.CookieManager;

public class CookieTests extends BaseTests{
    @Test
    public void CookieTest(){
        var CookieManger = new CookieManager(driver);
        Cookie cookie = CookieManger.buildCookie("TAU","123");
        CookieManger.deleteCookie(cookie);
        Assert.assertFalse(CookieManger.cookieExist(cookie),"Cookie was not deleted");
    }
}
