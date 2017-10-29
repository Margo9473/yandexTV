package steps;

import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import pages.SelectTVPage;
import ru.yandex.qatools.allure.annotations.Step;

import static org.junit.Assert.assertEquals;

public class SelectTVSteps {

    SelectTVPage selectTVPage = new SelectTVPage();

    @Step("Выбор минимальной стоимости {0}")
    public void selectMinPrice(String param){
        selectTVPage.fillField(selectTVPage.getMinPrice(),"20000");
    }

    @Step("Выбор LG")
    public void selectLG(){
        selectTVPage.click(selectTVPage.getLG());
    }

    @Step("Выбор Samsung")
    public void selectSamsung(){
        selectTVPage.click(selectTVPage.getSamsung());
    }

    @Step("Нажатие на кнопку Применить")
    public void clickButtonApply(){
        selectTVPage.click(selectTVPage.getButtonApply());
    }

    @Step("Проверка на 12 элементов")
    public void checkListTV(){
        selectTVPage.waitVisibility(selectTVPage.getListTV().get(0));
        assertEquals("Проверка списка на наличие 12 элементов",selectTVPage.getListTV().size(),12);

    }
    @Step("Ввести первое значение в поисковую строку")
    public void searchString(){
        selectTVPage.waitVisibility(selectTVPage.getListTV().get(0));
        selectTVPage.fillField(selectTVPage.getSearchField(), selectTVPage.memorizeFirstElement());
    }

    @Step("Поиск по элементу")
    public void clickButtonFind(){
        selectTVPage.click(selectTVPage.getButtonFind());
    }


}
