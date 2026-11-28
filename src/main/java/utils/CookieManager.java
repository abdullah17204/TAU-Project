package utils;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

public class CookieManager {
    private WebDriver driver;
    public CookieManager(WebDriver driver) {
        this.driver = driver;
    }
    private void addCookie(Cookie cookie){
        driver.manage().addCookie(cookie);
    }
    private void deleteCookie(Cookie cookie){
        driver.manage().deleteCookie(cookie);
    }
    private boolean cookieExist(Cookie cookie){
        return driver.manage().getCookieNamed(cookie.getName()) != null;
    }
    public Cookie buildCookie(String cookieName){
        return new Cookie.Builder("TAU","123")
                .domain("the-internet.herokuapp.com").build();
    }
}
