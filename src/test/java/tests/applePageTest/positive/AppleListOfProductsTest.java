package tests.applePageTest.positive;

import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constants.Constant.Urls.TOUCH_HOME_PAGE;

public class AppleListOfProductsTest extends BaseTest {

    @Test
    public void checkThatAllProductsHasAWordAppleInName (){
        //basePage.open(TOUCH_HOME_PAGE);

        basePage.open("https://touch.com.ua/tekhnika-apple/");

        //touchHomePage.goToApplePage();

        touchApplePage.checkIsAppleCards();

    }
}
