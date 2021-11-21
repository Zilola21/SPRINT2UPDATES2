package Tests;


import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {


    @Test(groups = {"smokeTest"})
    public void HomePageTest() {

        HomePage homePage = new HomePage();
        Assert.assertEquals(driver.getTitle(), "Auto Loan Rates & Calculators | New, Used, & Refinancing | www.penfed.org");
    }
}

