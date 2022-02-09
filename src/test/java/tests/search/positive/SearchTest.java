package tests.search.positive;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constants.Constant.SearchItems.IPHONE;
import static constants.Constant.Urls.TOUCH_HOME_PAGE;

@Epic("Поиск") //название суита
@Feature("Тестирование поиска")
public class SearchTest extends BaseTest {

    @Test(description = "Проверка перенаправления на страницу с указанным параметром поиска") //TestNG - аннотация, показывает что это Тест
    public void checkIsRedirectToListing(){
        String itemToSearch = IPHONE; // change it to compare

        basePage.open(TOUCH_HOME_PAGE);

        touchHomePage.inputToSearch(itemToSearch).clickToSearch();

        touchListingPage.checkSearchingResult(itemToSearch); //put here expected result

        touchListingPage.checkAmountOfCards(); // amount of cards
    }
}
