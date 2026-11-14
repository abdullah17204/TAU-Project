package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmailSentPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private By emailsentconformation = By.id("content");
    public EmailSentPage(WebDriver driver) {this.driver = driver;}

    public String getEmailsentconformation()
    {
        return wait.until(ExpectedConditions.presenceOfElementLocated(emailsentconformation)).getText();
    }
}
