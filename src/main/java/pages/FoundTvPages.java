package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FoundTvPages extends BasePage {

    @FindBy(xpath = "//div[@class='n-title__text']/h1")
    WebElement foundTV;

    public WebElement getFoundTV() {
            return foundTV;
    }

    public FoundTvPages(){
        PageFactory.initElements(driver,this);
    }
}
