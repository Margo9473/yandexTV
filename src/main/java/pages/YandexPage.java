package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class YandexPage extends BasePage {

    @FindBy(xpath = "//div[1]/a[text()='Маркет']")
    WebElement clickMarket;

    public YandexPage() {
        PageFactory.initElements(driver, this);
    }

    public WebElement getClickMarket() {
        return clickMarket;
    }
}

