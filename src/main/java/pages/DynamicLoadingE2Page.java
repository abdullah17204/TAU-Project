package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoadingE2Page {
    private WebDriver driver;
    private WebDriverWait wait;
    private By startButton = By.cssSelector("#start button");
    private By finishMessage = By.cssSelector("#finish h4");
    public DynamicLoadingE2Page(WebDriver driver) {this.driver = driver;}
    public void clickStartButton(){
        wait.until(ExpectedConditions.elementToBeClickable(startButton)).click();
    }
    public String getFinishConformation(){
        return wait.until(ExpectedConditions.elementToBeClickable(finishMessage)).getText();
    }
}
