package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;
    private final By formAuth = By.partialLinkText("Form Auth");
    private final By dropDown = By.partialLinkText("Dropdown");

    public LoginPage clickFormAuth() {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(formAuth)).click();
        return new LoginPage(driver);
    }
    public DropDownPage clickDropDown() {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(dropDown));
        return new DropDownPage(driver);
    }

    public HomePage(WebDriver driver) {this.driver=driver;}

}
