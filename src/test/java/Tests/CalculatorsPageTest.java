package tests;

import org.testng.annotations.Test;
import pages.CalculatorsPage;

public class CalculatorsPageTest extends Tests.TestBase {

    @Test(groups = {"regressionTest"})
        public void navigateToCalculatorsPage() throws InterruptedException{
        CalculatorsPage calculatorsPage = new CalculatorsPage();
        calculatorsPage.NavigateToCalculatorsPage();





    }
}
