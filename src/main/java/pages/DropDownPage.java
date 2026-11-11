package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropDownPage {
    private WebDriver driver;
    private By dropDown = By.id("dropdown");
    public DropDownPage(WebDriver driver) {this.driver = driver;}

    public DropDownPage clickDropDown() {}
}
