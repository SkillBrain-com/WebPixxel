package common.base;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestContext;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DriverConfiguration {
    public static WebDriver driver;
    public static ExtentTest logger;
    public static ExtentReports report;

    @BeforeMethod(alwaysRun = true)
    public void setDriver(ITestContext context) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://dev.webpixels.io?_vercel_share=iu3iQf3W4jtz727a39FefR6HEFMdMeeW");
        context.setAttribute("WebDriver", driver);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        driver.quit();
    }

    public void reportLog(String message){
        Reporter.log(message);
    }
}
