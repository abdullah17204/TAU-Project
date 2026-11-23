package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingPage {
    private WebDriver driver;
    private By example2 = By.partialLinkText("Example 2");
    public DynamicLoadingPage(WebDriver driver) {this.driver = driver;}
    public DynamicLoadingE2Page clickExample2 (){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(example2)).click();
        return new DynamicLoadingE2Page(driver);
    }
    public DynamicLoadingE2Page rightClickExample2(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(example2));

        driver.findElement(example2).sendKeys(Keys.CONTROL, Keys.RETURN);
        return new DynamicLoadingE2Page(driver);
    }
}
