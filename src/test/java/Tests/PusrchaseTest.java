package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutoLoanApplicationPage;
import pages.AutoRefinancePage;
import pages.PurchasePage;

public class PusrchaseTest extends Tests.TestBase {

    @Test(groups = {"regressionTest"})
    public void checkPurchaseRatesforNewCarBuyingServise() {

        AutoLoanApplicationPage autoLoanApplicationPage = new AutoLoanApplicationPage();
        autoLoanApplicationPage.NavigateToAutoRatesPage();
        AutoRefinancePage autoRefinancePage = new AutoRefinancePage();
        autoRefinancePage.purchaseButton.click();
        PurchasePage purchasePage = new PurchasePage();
        purchasePage.newCarBuyingService.click();
        Assert.assertEquals(driver.findElement(By.linkText("New Car Buying Service")));


    }

    @Test(groups = {"regressionTest"})
    public void checkPurchaseForNewAuto() {

        AutoLoanApplicationPage autoLoanApplicationPage = new AutoLoanApplicationPage();
        autoLoanApplicationPage.NavigateToAutoRatesPage();
        AutoRefinancePage autoRefinancePage = new AutoRefinancePage();
        autoRefinancePage.purchaseButton.click();
        PurchasePage purchasePage = new PurchasePage();
        purchasePage.newAutoPurchase.click();
        Assert.assertEquals(driver.findElement(By.linkText("New Auto Purchase")));


    }

    @Test(groups = {"regressionTest"})
    public void checkPurchase() {

        AutoLoanApplicationPage autoLoanApplicationPage = new AutoLoanApplicationPage();
        autoLoanApplicationPage.NavigateToAutoRatesPage();
        AutoRefinancePage autoRefinancePage = new AutoRefinancePage();
        autoRefinancePage.purchaseButton.click();
        PurchasePage purchasePage = new PurchasePage();
        purchasePage.newPaymentSaver.click();
        Assert.assertEquals(driver.findElement(By.linkText("New Payment Saver")));


    }

    @Test(groups = {"regressionTest"})
    public void checkPurchaseRatesforNewCarBuyingServise() {

        AutoLoanApplicationPage autoLoanApplicationPage = new AutoLoanApplicationPage();
        autoLoanApplicationPage.NavigateToAutoRatesPage();
        AutoRefinancePage autoRefinancePage = new AutoRefinancePage();
        autoRefinancePage.purchaseButton.click();
        PurchasePage purchasePage = new PurchasePage();
        purchasePage.usedCarBuyingService.click();
        Assert.assertEquals(driver.findElement(By.linkText("Used Car Buying Service")));


    }
}

