package tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTest extends Tests.TestBase {


    @Test(groups = {"smokeTest"})
    public void HomePageTest() {

        HomePage homePage = new HomePage();
        Assert.assertEquals(driver.getTitle(), "Auto Loan Rates & Calculators | New, Used, & Refinancing | www.penfed.org");
    }

}

