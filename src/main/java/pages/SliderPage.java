package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

public class SliderPage {
    private WebDriver driver;
    private By slider =  By.cssSelector("input[type='range']");
    private By sliderValue = By.id("range");
    public SliderPage(WebDriver driver) {
        this.driver=driver;
    }

    /**
     * @param number = the final value the slider should reach
     */
    public void moveSlider(double number) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        while(getSliderValue()!=number){
            driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
        }
    }
    public double getMinValue() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(sliderValue));
        return Double.parseDouble(Objects.requireNonNull(driver.findElement(slider).getAttribute("min")));
    }
    public double getMaxValue() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(slider));
        return Double.parseDouble(Objects.requireNonNull(driver.findElement(slider).getAttribute("max")));
    }
    public double getStepValue() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(slider));
        return Double.parseDouble(Objects.requireNonNull(driver.findElement(slider).getAttribute("step")));
    }
    public double getSliderValue() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        var value = wait.until(ExpectedConditions.presenceOfElementLocated(sliderValue)).getText();
        return Double.parseDouble(value);
    }


}
