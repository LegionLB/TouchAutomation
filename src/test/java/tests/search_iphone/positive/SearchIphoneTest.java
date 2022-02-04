package tests.search_iphone.positive;

import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constants.Constant.Urls.TOUCH_HOME_PAGE;

public class SearchIphoneTest extends BaseTest {

    @Test  //TestNG - аннотация, показывает что это Тест
    public void checkIsRedirectToListing(){
        basePage.open(TOUCH_HOME_PAGE);

        touchHomePage.inputToSearch("iPhone").clickToSearch();

        touchListingPage.checkAmountOfCards();
    }
}
