package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.allure.annotations.Step;
import steps.BaseSteps;

import java.util.concurrent.TimeUnit;

public class BasePage {
    WebDriver driver = BaseSteps.getDriver();
    private static String s="";

    public static String getS() {
        return s;
    }

    public static void setS(String s) {
        BasePage.s = s;
    }

    public BasePage(){
        PageFactory.initElements(driver, this);
    }

    public boolean isElementPresent(WebElement webElement) {
        try {
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            return webElement.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
        finally {
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
    }

    public void fillField(WebElement element, String value)  {
        try{
            new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(element));
            element.clear();
            element.sendKeys(value);
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    public void click(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", element);
        new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }


}
