package common.pages.sidebars;

import common.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SidebarPage extends BaseTest {
    @FindBy(xpath = "//input[@placeholder=\"Search library ...\"]")
    private WebElement searchElement;
    @FindBy(xpath = "//div[@class = 'container mw-screen-xxl mb-10 px-8 px-lg-16']//div[@class = 'd-flex align-items-center gap-1']//div[1]//div[1]//i")
    private WebElement likeButton;
}
