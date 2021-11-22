package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CarBuyingServicePage;

public class CarBuyingServicePageTest extends Tests.TestBase {


    @Test(groups = {"smokeTest"})
    public void navigateToCarBuyingServicePage() {

        CarBuyingServicePage carBuyingServicePage = new CarBuyingServicePage();
        carBuyingServicePage.NavigateToCarBuyingServicePage();
        Assert.assertEquals(driver.getTitle(),"Rates on Auto Loans | PenFed Car Buying Service | Used Car Loans");




    }
}
