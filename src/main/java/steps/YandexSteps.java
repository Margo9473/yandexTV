package steps;

import pages.YandexPage;
import ru.yandex.qatools.allure.annotations.Step;

public class YandexSteps {

    YandexPage yandexPage = new YandexPage();

    @Step("Выбор вкладки {0}")
    public void stepClickMarket(String param){
        yandexPage.click(yandexPage.getClickMarket());
    }
}
