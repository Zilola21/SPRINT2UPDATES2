package Tests;


import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest2 extends Tests.TestBase {
    @Test(groups = {"smokeTest"})
    public void NavigateToNewAutoRatesOfRefinance() {

        HomePageTest2 homePageTest2 = new HomePageTest2();
        homePageTest2.NavigateToNewAutoRatesOfRefinance();
        Assert.assertEquals(driver.getTitle(), "Auto Loan Rates & Calculators | New, Used, & Refinancing | PenFed | penfed.org");


    }

    @Test(groups = {"smokeTest"})
    public void NavigateToUsedAutoRatesOfRefinance() {

        HomePageTest2 homePageTest2 = new HomePageTest2();
        homePageTest2.NavigateToUsedAutoRatesOfRefinance();
        Assert.assertEquals(driver.getTitle(), "Auto Loan Rates & Calculators | New, Used, & Refinancing | PenFed | penfed.org");
    }
}
