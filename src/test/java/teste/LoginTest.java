package teste;

import com.relevantcodes.extentreports.LogStatus;
import common.pages.accordion.AccordionPage;
import common.pages.base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class LoginTest extends BasePage{

    public AccordionPage accordionPage(){
        return new AccordionPage();
    }

    @Test(description = " Happy Test")
    @Parameters({"username", "password", "typeOfRunning"})
    public void verifyLogin() throws InterruptedException {
        accordionPage().getPageTitle();
        Assert.assertEquals(accordionPage().getPageTitle(), "Demo");
        Assert.assertEquals(driver_local.getCurrentUrl(), "https://opaaaensource-demo.orangehrmlive.com/web/index.php/auth/login");
        logger.log(LogStatus.PASS, "HomePage is displayed");
    }
}
