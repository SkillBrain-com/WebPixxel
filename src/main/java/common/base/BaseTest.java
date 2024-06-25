package common.base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static common.base.DriverConfiguration.driver;

public class BaseTest {
    DriverConfiguration driverConfiguration;
    Actions action;

    public BaseTest() {
        driverConfiguration = new DriverConfiguration();
        action = new Actions(driver);
        PageFactory.initElements(driver, this);
    }
    private WebDriverWait waitElement() {
        return new WebDriverWait(driver, 15);
    }
    protected void addText(String inputText, WebElement locator) {
        clear(locator);
        locator.sendKeys(inputText);
    }
    protected void click(WebElement locator) {
        clickAble(locator).click();
    }
    protected void movetoElement() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }
    protected String getPageTitle() {
        return driver.getTitle();
    }
    public String getUrl() {
        return driver.getCurrentUrl();
    }
    protected WebElement listOfElements(List<WebElement> list, String text) {
        WebElement elem = null;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getText().equalsIgnoreCase(text)) {
                elem = list.get(i);
                break;
            }
        }
        return elem;
    }
    protected WebElement clickAble(WebElement locator) {
        waitElement().until(ExpectedConditions.elementToBeClickable(locator));
        return locator;
    }
    protected void clear(WebElement locator) {
        click(locator);
        Keys Keys = null;
        if (getOperationSystem().contains("Windows")) {
            locator.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        } else if (getOperationSystem().contains("Mac OS X")) {
            locator.sendKeys(Keys.chord(Keys.COMMAND, "a"));
        }
    }
    private String getOperationSystem() {
        String operateSystem = System.getProperty("os.name");
        return operateSystem;
    }
}
