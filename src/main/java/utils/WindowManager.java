package utils;

import org.openqa.selenium.WebDriver;

public class WindowManager {
    private WebDriver driver;
    public WindowManager(WebDriver driver) {this.driver = driver;}

    public void back() {driver.navigate().back();}
    public void forward() {driver.navigate().forward();}
    public void refresh() {driver.navigate().refresh();}
    public void goTo(String url) {driver.navigate().to(url);}
}
