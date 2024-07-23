package common.pages.base;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestContext;
import org.testng.Reporter;
import org.testng.annotations.*;


public class BasePage {


    public static WebDriver driver_local; //--> rulare in mod normal pe local
    public static ExtentTest logger;
    public static ExtentReports report;


    /*pentru Webdriver Local - rularea pe acelasi pc
     */
    @BeforeMethod(alwaysRun = true)
    public void setup(ITestContext context) {
        System.setProperty("webdriver.chrome.driver", "E:\\QA Automation\\Internship_WebPixxel\\WebPixxel\\src\\test\\resources\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver_local = new ChromeDriver(options);
        driver_local.manage().window().maximize();
        driver_local.manage().deleteAllCookies();
        driver_local.get("https://dev.webpixels.io?_vercel_share=iu3iQf3W4jtz727a39FefR6HEFMdMeeW");
        context.setAttribute("WebDriver", driver_local);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver_local.quit();
        report.flush();
    }

    public void reportLog(String message) {
        Reporter.log(message);
    }

}