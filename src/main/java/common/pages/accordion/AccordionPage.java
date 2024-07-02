package common.pages.accordion;

import common.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccordionPage extends BaseTest {

    @FindBy(xpath = "//a[contains(text(), 'Library')]")
    private WebElement libraryOption;

    @FindBy(xpath = "//div[@class='dropdown-menu show']//a")
    private List<WebElement> listOfLibraryOptions;

    @FindBy(xpath = "//a[contains(text(), 'Accordion')]")
    private WebElement accordionOption;

    @FindBy(xpath = "//div[@class = 'row gx-lg-8 mt-8']//div[@class  ='row row-cols-1 row-cols-sm-2 row-cols-md-3 g-8']//div[@class = 'col']")
    private List<WebElement> listOfAccordion;

    @FindBy(xpath = "//i[@class='bi bi-heart-fill text-sm text-opacity-50-hover text-opacity-100 text-danger']")
    private List<WebElement> listOfHeartAccordion;

    @FindBy(xpath = "//div[@class='d-inline-flex ms-auto gap-3']//div[@class='d-inline-flex gap-1 align-items-center text-body-tertiary'][1]//span")
    private List<WebElement> listOfNumberOfHeartAccordion;









}
