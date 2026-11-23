package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OpenNewWindowPage {
    private WebDriver driver;
    private By clickHere = By.linkText("Click Here");
    public OpenNewWindowPage(WebDriver driver) {this.driver = driver;}

    public void ClickLink(String linkText) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(clickHere)).click();
    }
}
