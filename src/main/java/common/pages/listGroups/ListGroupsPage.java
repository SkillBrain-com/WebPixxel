package common.pages.listGroups;

import com.sun.tools.javac.util.List;
import common.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class ListGroupsPage extends BaseTest{

    @FindBy(xpath = "//input[@placeholder=\"Search library ...\"]")
    private WebElement searchElement;

    @FindBy(xpath = "//div[@class='row row-cols-1 row-cols-sm-2 row-cols-md-3 g-8']//div[@class='position-relative card-img-top']")
    private List <WebElement> listGroupsWidgets;

    @FindBy(xpath = "//div[@class='d-flex align-items-center gap-1']//div[@class='d-inline-flex ms-auto gap-3']//div[@class='d-inline-flex gap-1 align-items-center text-body-tertiary']//i[@class='bi bi-heart-fill text-sm text-opacity-50-hover text-opacity-100 text-body-tertiary']")
    private List <WebElement> listGroupsHearts;
}
