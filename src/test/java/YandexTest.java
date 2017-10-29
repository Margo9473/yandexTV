import org.junit.Test;
import pages.BasePage;
import pages.CategoryPages;
import pages.FoundTvPages;
import ru.yandex.qatools.allure.annotations.Title;
import steps.*;

import java.util.Calendar;

public class YandexTest extends BaseSteps {

    @Test
    @Title("Выбор телевизора")

    public void Test(){
        YandexSteps yandexSteps = new YandexSteps();
        CategorySteps categorySteps = new CategorySteps();
        SelectTVSteps selectTVSteps = new SelectTVSteps();
        FoundTVSteps foundTvStepss = new FoundTVSteps();

        yandexSteps.stepClickMarket("Маркет");
        categorySteps.selectPageKategory("Электроника");
        categorySteps.selectTV("Телевизоры");
        selectTVSteps.selectMinPrice("20000");
        selectTVSteps.selectLG();
        selectTVSteps.selectSamsung();
        selectTVSteps.clickButtonApply();
        selectTVSteps.checkListTV();
        selectTVSteps.searchString();
        selectTVSteps.clickButtonFind();
        foundTvStepss.compareTV();


    }

}
