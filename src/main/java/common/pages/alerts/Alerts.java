package common.pages.alerts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Alerts {

    @FindBy(xpath = "//a[contains(text(), 'Library')]")
    private WebElement libraryOption;

    @FindBy(xpath = "//div[@class='dropdown-menu show']//a")
    private List<WebElement> libraryOptionList;

    @FindBy(xpath = "//a[@class='nav-link border rounded-pill py-2 text-heading bg-light fw-semibold text-primary']")
    private WebElement alerts;

    @FindBy(xpath = "//div[@class='row row-cols-1 row-cols-sm-2 row-cols-md-3 g-8']//div[@class='col']")
    private List<WebElement> alertsWidgets;

    @FindBy(xpath = "//div[@class='d-inline-flex ms-auto gap-3']//div[@class='d-inline-flex gap-1 align-items-center text-body-tertiary']//i[@class='bi bi-heart-fill text-sm text-opacity-50-hover text-opacity-100 text-body-tertiary']")
    private List<WebElement> greyHeart;

    @FindBy(xpath = "//div[@class='d-inline-flex ms-auto gap-3']//div[@class='d-inline-flex gap-1 align-items-center text-body-tertiary']//i[@class='bi bi-heart-fill text-sm text-opacity-50-hover text-opacity-100 text-danger']")
    private List<WebElement> redHeart;

    @FindBy(xpath = "//div[@class='d-inline-flex ms-auto gap-3']//div[@class='d-inline-flex gap-1 align-items-center text-body-tertiary'][1]//span")
    private List<WebElement> listOfNumberOfHeartAlerts;

    @FindBy(xpath = "//input[@class='form-control form-control-muted ps-2 rounded-end-pill']")
    private WebElement searchBar;


}
