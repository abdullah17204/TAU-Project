package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingE2Page {
    private WebDriver driver;
    private By startButton = By.cssSelector("#start button");
    private By finishMessage = By.cssSelector("#finish h4");
    public DynamicLoadingE2Page(WebDriver driver) {this.driver = driver;}
    public void clickStartButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(startButton)).click();
    }
    public boolean conformButtonIsDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(startButton));
        return true;
    }
    public String getFinishConformation(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        return wait.until(ExpectedConditions.elementToBeClickable(finishMessage)).getText();
    }
}
