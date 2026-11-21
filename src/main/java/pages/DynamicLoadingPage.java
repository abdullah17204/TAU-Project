package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoadingPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private By example2 = By.partialLinkText("Example 2");
    public DynamicLoadingPage(WebDriver driver) {this.driver = driver;}
    public DynamicLoadingE2Page clickExample2 (){
        wait.until(ExpectedConditions.presenceOfElementLocated(example2)).click();
        return new DynamicLoadingE2Page(driver);
    }
}
