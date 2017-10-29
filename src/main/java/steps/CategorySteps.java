package steps;

import pages.BasePage;
import pages.CategoryPages;
import ru.yandex.qatools.allure.annotations.Step;

public class CategorySteps {

    CategoryPages categoryPages = new CategoryPages();

    @Step("Открытие вкладки {0}")
    public void selectPageKategory(String param){
        if(categoryPages.isElementPresent(categoryPages.getTopMenu())){
            categoryPages.selectMenu(param);
        }
        else if(categoryPages.isElementPresent(categoryPages.getTopMenu2())) {
            categoryPages.selectMenu2(param);
        }
        else if(categoryPages.isElementPresent(categoryPages.getSelectButtonMenu())){
            categoryPages.click(categoryPages.getSelectButtonMenu());
            categoryPages.selectMenu3(param);
        }

    }
    @Step("Выбор категории {0}")
    public void selectTV(String param){
        categoryPages.click(categoryPages.getTelevizory());
    }

}
