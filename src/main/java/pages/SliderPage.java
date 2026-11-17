package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SliderPage {
    private WebDriver driver;
    private By slider =  By.cssSelector("input[type='range']");
    private By sliderValue = By.id("range");
    public SliderPage(WebDriver driver) {
        this.driver=driver;
    }
    public void moveSlider(int number) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(slider)).click();
        driver.findElement(slider).sendKeys(Integer.toString(number));
    }
    public String getSliderValue() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        return wait.until(ExpectedConditions.presenceOfElementLocated(sliderValue)).getText();
    }


}
