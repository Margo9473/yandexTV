package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CategoryPages extends BasePage {

    @FindBy(xpath = "//div[1]//span[text()='Все категории']/..")
    WebElement selectButtonMenu;

    @FindBy(xpath = "//div[@class='catalog-menu__item'][3]/div/a[1]")
    WebElement televizory;

    @FindBy(xpath = "//div[3]/div[1]/div")
    WebElement electronicaAllMenu;

    @FindBy(xpath = "//ul[@class='topmenu__list']")
    WebElement topMenu;

    @FindBy(xpath = "//div[@class='n-topmenu-new-horizontal__middle']/div/div/div")
    WebElement topMenu2;

    public CategoryPages(){
        PageFactory.initElements(driver, this);
    }


    public WebElement getTelevizory() {
        return televizory;
    }

    public WebElement getElectronicaAllMenu() {
        return electronicaAllMenu;
    }

    public WebElement getTopMenu() {
        return topMenu;
    }

    public WebElement getTopMenu2() {
        return topMenu2;
    }

    public WebElement getSelectButtonMenu() {
        return selectButtonMenu;
    }

    public void selectMenu(String nameMenu){
        click(topMenu.findElement(By.xpath("./li/a[text()='" + nameMenu + "']")));
    }

    public void selectMenu2(String nameMenu){
        click(topMenu2.findElement(By.xpath("./div/a[text()='" + nameMenu + "']")));
    }
    public void selectMenu3(String nameMenu){
        click(electronicaAllMenu.findElement(By.xpath("//span[text()='"+nameMenu +"']/..")));
    }
}
