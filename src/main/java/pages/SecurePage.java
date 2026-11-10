package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SecurePage {
    private WebDriver driver;
    private final By flashTest = By.id("flash");

    public String getFlashTest()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        return wait.until(ExpectedConditions.presenceOfElementLocated(flashTest)).getText();
    }
    public SecurePage(WebDriver driver) {this.driver = driver;}
}
