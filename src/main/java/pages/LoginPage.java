package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class LoginPage {
    private WebDriver driver;
    private final By usernamefield = By.id("username");
    private final By passwordfield = By.id("password");
    private final By loginbutton = By.cssSelector(".fa-sign-in");
    private final By failalert = By.id("flash");

    public LoginPage(WebDriver driver) {this.driver = driver;}

    public SecurePage login(String username, String password) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(usernamefield)).sendKeys(username);
        System.out.println("Entered username: " + username);
        driver.findElement(passwordfield).sendKeys(password);
        System.out.println("Entered password: " + password);
        driver.findElement(loginbutton).click();
        return new SecurePage(driver);
    }
    public String getFailFlash(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        return wait.until(ExpectedConditions.presenceOfElementLocated(failalert)).getText();
    }
}
