package teste;

import common.pages.base.BasePage;
import common.pages.mediaGroups.MediaGroups;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MediaGroupsTest extends BasePage {

    @Test(description = "Media Groups Test")
    public void mediaGroupTest() {
        MediaGroups mediaGroups = new MediaGroups();
        mediaGroups.pressLibrary();
        mediaGroups.pressComponentsFromLibrary();
        mediaGroups.chooseComponentsOption();
        Assert.assertTrue(mediaGroups.getCurrentURL("https://dev.webpixels.io/library/components/media"));
        Assert.assertTrue(mediaGroups.isMediaGroupsPopulatedWithWidgets());
        Assert.assertTrue(mediaGroups.isMediaGroupsFunctional());
    }
}





