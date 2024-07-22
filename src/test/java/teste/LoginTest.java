package teste;

import com.relevantcodes.extentreports.LogStatus;
import common.pages.accordion.AccordionPage;
import common.pages.base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTest {
    private final AccordionPage accordion;
    public LoginTest(){
        accordion = new AccordionPage();
    }

    @Test(description = " Happy Test")
//    @Parameters({"username", "password", "typeOfRunning"})
    public void verifyLogin() {
        accordion.getUrl();

        Assert.assertEquals(BasePage.driver_local.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
//        logger.log(LogStatus.PASS, "HomePage is displayed");
    }
}
