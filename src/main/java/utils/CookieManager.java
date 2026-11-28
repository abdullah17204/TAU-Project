package utils;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

public class CookieManager {
    private WebDriver driver;
    public CookieManager(WebDriver driver) {
        this.driver = driver;
    }
    private void setCookie(){
        Cookie cookie = new Cookie.Builder("TAU","123")
                .domain("https://the-internet.herokuapp.com").build();
        driver.manage().addCookie(cookie);
    }
    private void deleteCookie(){
        var cookie = driver.manage().getCookies();
        driver.manage().deleteCookieNamed("cookie");
    }
}
