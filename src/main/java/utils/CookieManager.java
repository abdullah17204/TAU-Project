package utils;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

public class CookieManager {
    private WebDriver driver;
    public CookieManager(WebDriver driver) {
        this.driver = driver;
    }
    public void addCookie(Cookie cookie){
        driver.manage().addCookie(cookie);
    }
    public void deleteCookie(Cookie cookie){
        driver.manage().deleteCookie(cookie);
    }
    public boolean cookieExist(Cookie cookie){
        return driver.manage().getCookieNamed(cookie.getName()) != null;
    }
    public Cookie buildCookie(String cookieName,String cookieValue){
        return new Cookie.Builder(cookieName,cookieValue)
                .domain("the-internet.herokuapp.com").build();
    }
}
