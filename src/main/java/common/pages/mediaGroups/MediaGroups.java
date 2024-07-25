package common.pages.mediaGroups;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import common.pages.base.BaseTest;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class MediaGroups extends BaseTest {

    public static final String URL = "https://dev.webpixels.io/library/components";
    @FindBy(xpath = "//input[@placeholder=\"Search library ...\"]")
    private WebElement searchElement;

    @FindBy(xpath = "//a[normalize-space()='Library']")
    private WebElement Library;

   @FindBy(xpath = "//a[@class='px-2 dropdown-item'][normalize-space()='Components']")
   private WebElement Components;

   @FindBy (xpath = "//a[@class='nav-link border rounded-pill py-2 text-heading bg-light fw-semibold text-primary']")
   private WebElement Media;
    @FindBy(xpath = "//div[@class='dropdown-menu show']//a")
    private List<WebElement> dropDownLibrary;

    @FindBy(xpath = "//div[@class='row row-cols-1 row-cols-sm-2 row-cols-md-3 g-8']//div[@class='col']")
    private List<WebElement> mediaGroupsElements;

    @FindBy(xpath = "//div[@class='d-flex align-items-center gap-1']//div[@class='d-inline-flex ms-auto gap-3']//div[@class='d-inline-flex gap-1 align-items-center text-body-tertiary'][1]//i[@class='bi bi-heart-fill text-sm text-opacity-50-hover text-opacity-100 text-danger']")
    private WebElement mediaGroupsHeartRed;

    @FindBy(xpath = "//div[@class='d-flex align-items-center gap-1']//div[@class='d-inline-flex ms-auto gap-3']//div[@class='d-inline-flex gap-1 align-items-center text-body-tertiary']//i[@class='bi bi-heart-fill text-sm text-opacity-50-hover text-opacity-100 text-body-tertiary']")
    private List<WebElement> mediaGoupsHeartDefoult;

    @FindBy(xpath = "//div[@class='d-flex align-items-center gap-1']//div[@class='d-inline-flex ms-auto gap-3']//div[@class='d-inline-flex gap-1 align-items-center text-body-tertiary'][1]//span[@class='text-xs fw-semibold text-body']")
    private List<WebElement> heartsNumber;


    public void pressLibrary() {click(Library);

    }

    public void pressComponentsFromLibrary() {
        click(Components);
    }

    public void chooseComponentsOption() {
        click(Media);
    }

    public boolean getCurrentURL(String url) {
        return waitPage().until(ExpectedConditions.urlToBe(URL));
    }

    public boolean isMediaGroupsPopulatedWithWidgets() {
        return !mediaGroupsElements.isEmpty();
    }

    public boolean isMediaGroupsFunctional() {
        return heartsNumber.size()== mediaGroupsElements.size();
    }
}
