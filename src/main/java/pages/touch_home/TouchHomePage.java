package pages.touch_home;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

public class TouchHomePage extends BasePage {

    public TouchHomePage(WebDriver driver) {
        super(driver);
    }

    private final By searchingField = By.xpath("//input[@id='searchQuery']");
    private final By findButton = By.xpath("//input[@id='goSearch']");
    private final By appleFromCategoryButton = By.xpath("//li[@class='eChild'][1]");

    @Step("Для поиска вводим {input}")
    public TouchHomePage inputToSearch(String input){
        WebElement searchField = driver.findElement(searchingField);
        waitElementIsVisible(searchField).sendKeys(input);

        return this;
    }

    @Step("Нажать на кнопку поиска")
    public TouchHomePage clickToSearch(){
        WebElement searchButton = driver.findElement(findButton);
        waitElementIsVisible(searchButton).click();

        return this;
    }
    @Step("Нажать на кнопку 'Apple' в меню категорий")
    public TouchHomePage goToApplePage(){
        WebElement applePageButton = driver.findElement(appleFromCategoryButton);
        waitElementIsVisible(applePageButton).click();

        return this;
    }


}
