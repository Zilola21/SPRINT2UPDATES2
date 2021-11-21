package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FindCar {
    public FindCar() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "tab__1")
    public WebElement purchase;

    @FindBy(linkText = "New Car Buying Service")
    public WebElement newCarBuyingService;

    @FindBy(name = "truecar-model")
    public WebElement dropDownBox;

    @FindBy(name = "truecar-zip")
    public WebElement zipCode;

    @FindBy(linkText = "SEARCH NEW CARS")
    public WebElement searchButton;


//// navigate to this page: https://www.penfed.org/auto/car-buying-service
    public void NavigateToFindingCarPage(){
        purchase.click();
        newCarBuyingService.click();
    }
}
