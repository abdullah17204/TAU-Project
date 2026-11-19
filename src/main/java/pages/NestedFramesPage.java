package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {
    private WebDriver driver;
    private String TopFrame = "frame-top";
    private String BottomFrame = "frame-bottom";
    private String LeftFrame = "frame-left";
    private String RightFrame = "frame-right";
    private By body = By.tagName("body");
    public NestedFramesPage(WebDriver driver) { this.driver = driver; }

    public String getLeftFrameText() {
        switchToFrame(TopFrame);
        switchToFrame(LeftFrame);
        String text = driver.findElement(body).getText();
        switchToParentFrame();
        return text;
    }
    public String getBottomFrameText() {
        switchToFrame(BottomFrame);
        String text = driver.findElement(body).getText();
        switchToParentFrame();
        return text;
    }

    private void switchToFrame(String frameName) {
        driver.switchTo().frame(frameName);
    }
    private void switchToParentFrame() {
        driver.switchTo().parentFrame();
    }
}

