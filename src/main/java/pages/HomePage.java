package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;
//    private final By formAuth = By.partialLinkText("Form Auth");
//    private final By dropDown = By.partialLinkText("Dropdown");

    public LoginPage clickFormAuth() {
        clickLink("Form Auth");
        return new LoginPage(driver);
    }
    public DropDownPage clickDropDown() {
        clickLink("Dropdown");
        return new DropDownPage(driver);
    }
    private void clickLink(String linkText) {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(linkText))).click();
        }

    public HomePage(WebDriver driver) {this.driver=driver;}

}
