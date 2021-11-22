package Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage2{


    public HomePage2() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "tab__3")
    public WebElement refinance;

    @FindBy(linkText = "New Auto Refinance")
    public WebElement newAutoRefinance;

    @FindBy(linkText = "Used Auto Refinance")
    public WebElement usedAutoRefinance;


    public void NavigateToNewAutoRatesOfRefinance() {
    refinance.click();
    newAutoRefinance.click();
    }
    public void NavigateToUsedAutoRatesOfRefinance(){
        refinance.click();
    }
}