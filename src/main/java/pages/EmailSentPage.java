package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EmailSentPage {
    private WebDriver driver;
    private By emailsentconformation = By.id("content");
    public EmailSentPage(WebDriver driver) {this.driver = driver;}

    public String getEmailsentconformation()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.urlContains("email_sent"));
        return wait.until(ExpectedConditions.presenceOfElementLocated(emailsentconformation)).getText();
    }
}
