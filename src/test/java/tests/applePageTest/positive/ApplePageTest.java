package tests.applePageTest.positive;

import io.qameta.allure.*;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constants.Constant.SearchingResults.APPLE_PAGE_SEARCH_RESULT;
import static constants.Constant.Urls.TOUCH_HOME_PAGE;

@Feature("Страница продукции Apple") // группируем тесты по фиче
public class ApplePageTest extends BaseTest {


    @Test(description = "Открытие страницы продукции Apple") // Название теста в репорте
    @Description("Переход на страницу продукции Apple с главной страницы")  // Описание теста в репорте
    @Severity(SeverityLevel.TRIVIAL) // severity теста
    @Attachment
    public void checkIsItApplePage(){
        basePage.open(TOUCH_HOME_PAGE);

        touchHomePage.goToApplePage();

        touchApplePage.appleSearchResult(APPLE_PAGE_SEARCH_RESULT);
    }

    @Test(description = "Проверка что все продукты на странице имееют в названии 'Apple'")
    public void checkThatAllProductsHasAWordAppleInName (){
        basePage.open(TOUCH_HOME_PAGE);

        touchHomePage.goToApplePage();

        touchApplePage.checkIsAppleCards();
    }

}
