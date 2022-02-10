package tests.base;

import settings.DriverSettings;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import pages.apple.TouchApplePage;
import pages.base.BasePage;
import pages.listing.TouchListingPage;
import pages.touch_home.TouchHomePage;

import static settings.Config.CLEAR_COOKIES_AND_STORAGE;
import static settings.Config.HOLD_BROWSER_OPEN;

public class BaseTest {

    protected WebDriver driver = DriverSettings.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected TouchHomePage touchHomePage = new TouchHomePage(driver);
    protected TouchListingPage touchListingPage =  new TouchListingPage(driver);
    protected TouchApplePage touchApplePage = new TouchApplePage(driver);

    @AfterTest(description = "Очищаем куки и кэш")  //TestNG - аннотация - действие совершается после каждого теста
    public void clearCookiesAndLocalStorage(){
        if (CLEAR_COOKIES_AND_STORAGE){
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }
    }

    @AfterSuite (alwaysRun = true, description = "Закрываем браузер") //TestNG - аннотация - действие совершается после каждого набора, alwaysRun = true - выполнение в любом случае
    public void close(){
        if (HOLD_BROWSER_OPEN){
            driver.quit();
        }
    }
}
