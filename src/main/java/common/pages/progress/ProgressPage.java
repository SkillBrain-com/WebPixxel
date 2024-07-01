package common.pages.progress;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProgressPage {
    @FindBy(xpath = "//div[@class=\"position-fixed start-50 transform translate-x-n50 bg-white p-2 rounded-4 border shadow-5 z-1 bottom-0 mb-6\"]//button//i")
    private List <WebElement> orientationWidgets;

    @FindBy(xpath = "//div[@class=\"row row-cols-1 row-cols-sm-2 row-cols-md-3 g-6\"]//div[@class=\"position-relative card-img-top\"]")
    private List <WebElement> progressWidgets;

    @FindBy(xpath = "//div[@class=\"row row-cols-1 row-cols-sm-2 row-cols-md-3 g-6\"]//div[@class=\"d-inline-flex ms-auto gap-3\"]//div[@class=\"d-inline-flex gap-1 align-items-center text-body-tertiary\"][1]//i")
    private List <WebElement> favoritesWidgets;
}
