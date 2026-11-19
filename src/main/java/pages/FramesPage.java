package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FramesPage {
    private WebDriver driver;
    private By nestedFramesLink = By.linkText("Nested Frames");
    public FramesPage(WebDriver driver) {
        this.driver = driver;
    }
    public NestedFramesPage clickNestedFrames(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(nestedFramesLink)).click();
        return new NestedFramesPage(driver);
    }
}
