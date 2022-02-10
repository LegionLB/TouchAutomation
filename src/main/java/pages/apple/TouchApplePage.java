package pages.apple;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.base.BasePage;

import java.util.List;

public class TouchApplePage extends BasePage {


    public TouchApplePage(WebDriver driver) {
        super(driver);
    }

    private final By appleHeader = By.xpath("//h1[@class='changeName']");
    private final By appleCard = By.xpath("//div[@class='item product sku']");

    @Step("Сравнение Заголовка страницы {appleHeaderExpected}")
    public TouchApplePage appleSearchResult(String appleHeaderExpected){
        WebElement header = driver.findElement(appleHeader);
        waitElementIsVisible(header);

        Assert.assertEquals(header.getText(), appleHeaderExpected);

        return this;
    }

    @Step("В каждом продукте на странице есть слово 'Apple'")
    public TouchApplePage checkIsAppleCards(){

        List<WebElement> appleCards = driver.findElements(appleCard);

        for (WebElement webElement: appleCards){

            Assert.assertTrue(webElement.getText().contains("Apple"));

        }
        return this;
    }
}
