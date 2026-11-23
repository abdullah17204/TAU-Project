package utils;

import org.openqa.selenium.WebDriver;

public class WindowManager {
    private WebDriver driver;
    public WindowManager(WebDriver driver) {this.driver = driver;}

    public void back() {driver.navigate().back();}
    public void forward() {driver.navigate().forward();}
    public void refresh() {driver.navigate().refresh();}
    public void goTo(String url) {driver.navigate().to(url);}

    public void switchToNewTab() {
        String current = driver.getWindowHandle();
        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(current)) {
                driver.switchTo().window(handle);
                return;
            }
        }
        throw new RuntimeException("No new tab found");
    }

    public void switchToTab(String tabTitle) {
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
            if (driver.getTitle().equals(tabTitle)) {
                return;
            }
        }
        throw new RuntimeException("No tab found with title: " + tabTitle);
    }
}
