package tests.applePageTest.positive;

import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constants.Constant.Urls.TOUCH_HOME_PAGE;

public class OpenApplePageTest extends BaseTest {

    @Test
    public void checkIsItApplePage(){
        //basePage.open(TOUCH_HOME_PAGE);

        //touchHomePage.goToApplePage();

        basePage.open("https://touch.com.ua/tekhnika-apple/");

        touchApplePage.applePageHeader();
    }

}
