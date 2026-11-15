package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HoversPage {
    private WebDriver driver;
    private By figureBox = By.className("figure");
    private By figureCaption = By.className("figcaption");

    public HoversPage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * @param index starts at 1
     */
    public FigureCaption HoverOverFigure(int index){
        WebElement figure = driver.findElements(figureBox).get(index-1);
        Actions actions = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(figureBox));
        actions.moveToElement(figure).perform();
        return new FigureCaption(figure.findElement(figureCaption));
    }
    public class FigureCaption {
        private WebElement caption;
        private By header = By.tagName("h5");
        public FigureCaption(WebElement caption) {
            this.caption = caption;
        }
        public boolean isHeaderDisplayed() {
            return caption.isDisplayed();
        }
        public String getHeader() {
            return caption.findElement(header).getText();
        }
    }
}
