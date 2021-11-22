package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PurchasePage {

    @FindBy(xpath ="//button[@class='button button--tab']")
    public WebElement purchaseButton;

    @FindBy(linkText = "New Car Buying Service")
    public WebElement newCarBuyingService;

    @FindBy(linkText = "New Auto Purchase")
    public WebElement newAutoPurchase;

    @FindBy(linkText = "New Payment Saver")
    public WebElement newPaymentSaver;

    @FindBy(linkText = "Used Car Buying Service")
    public WebElement usedCarBuyingService;



}
