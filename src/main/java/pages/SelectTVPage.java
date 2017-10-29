package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.List;

public class SelectTVPage extends BasePage {

    @FindBy(id = "glf-pricefrom-var")
    WebElement minPrice;

    @FindBy(xpath = "//label[@class='checkbox__label'][text()='LG']")
    WebElement LG;

    @FindBy(xpath = "//label[@class='checkbox__label'][text()='Samsung']")
    WebElement samsung;

    @FindBy(xpath = "//span[@class='button__text'][text()='Применить']/..")
    WebElement buttonApply;

    @FindBy(xpath = "//div[@class='n-snippet-card2__hover']/..")
    List<WebElement> listTV;

    @FindBy(id = "header-search")
    WebElement searchField;

    @FindBy(xpath = "//span[@class='search2__button']/button")
    WebElement buttonFind;

    public SelectTVPage(){
        PageFactory.initElements(driver, this);
    }

    public WebElement getMinPrice() {
        return minPrice;
    }

    public WebElement getLG() {
        return LG;
    }

    public WebElement getSamsung() {
        return samsung;
    }

    public WebElement getButtonApply() {
        return buttonApply;
    }

    public List<WebElement> getListTV() {
        return listTV;
    }

    public WebElement getSearchField() {
        return searchField;
    }

    public WebElement getButtonFind() {
        return buttonFind;
    }

    public String memorizeFirstElement(){
        setS(listTV.get(0).findElement(By.xpath("./div[4]/div/div/a")).getText());
        return getS();
    }

}
