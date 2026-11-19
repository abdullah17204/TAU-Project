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
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }
    public DropDownPage clickDropDown() {
        clickLink("Dropdown");
        return new DropDownPage(driver);
    }
    public ForgotPasswordPage clickForgotPassword() {
        clickLink("Forgot Password");
        return new ForgotPasswordPage(driver);
    }
    public HoversPage clickHovers(){
        clickLink("Hovers");
        return new HoversPage(driver);
    }
    public SliderPage clickSilder(){
        clickLink("Horizontal Slider");
        return new SliderPage(driver);
    }
    public ContextMenuPage clickContextMenu (){
        clickLink("Context Menu");
        return new ContextMenuPage(driver);
    }
    public FramesPage clickFrames(){
        clickLink("Frames Page");
        return new FramesPage(driver);
    }
    private void clickLink(String linkText) {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(linkText))).click();
    }

    public HomePage(WebDriver driver) {this.driver=driver;}

}
