package tests;

import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.*;
import org.testng.annotations.Parameters;
import utils.WindowManager;

import java.io.File;
import java.io.IOException;

public class BaseTests {
    protected WebDriver driver;

    @Parameters("browser")
    @BeforeMethod
    public void setUp(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("brave")) {
            ChromeOptions options = new ChromeOptions();
            options.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
            driver = new ChromeDriver(options);
        }
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @AfterMethod
    public void recordFailure(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
        var camera = (TakesScreenshot)driver;
        File screenshot = camera.getScreenshotAs(OutputType.FILE);
        try {
            Files.move(screenshot,new File("C:\\Users\\abdul\\IdeaProjects\\TestProject\\resources\\screenshots\\" + result.getMethod().getMethodName() + System.currentTimeMillis()+ ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Screenshot taken : "+ screenshot.getAbsolutePath());
        }
    }

    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }
}
