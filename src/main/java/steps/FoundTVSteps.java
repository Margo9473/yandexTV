package steps;

import pages.FoundTvPages;
import ru.yandex.qatools.allure.annotations.Step;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static pages.BasePage.getS;


public class FoundTVSteps {

    FoundTvPages foundTvPages = new FoundTvPages();

    @Step("Проверка на правильно найденый телевизор")
    public void compareTV(){
        assertEquals("Элементы совпали", getS(), foundTvPages.getFoundTV().getText());
    }
}
