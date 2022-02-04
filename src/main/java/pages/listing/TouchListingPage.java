package pages.listing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.base.BasePage;

import static constants.Constant.PageItems.BASIC_AMOUNT_OF_CARDS;

public class TouchListingPage extends BasePage {


    public TouchListingPage(WebDriver driver) {  //конструктор
        super(driver);
    }

    private final By card = By.xpath("//div[@class='item product sku']"); //находим карточку на странице

    public TouchListingPage checkAmountOfCards(){  // метод который проверяет кол-во карточек

        int countCard = driver.findElements(card).size(); // ищем коллекцию карточек и получаем её размер
        Assert.assertEquals(countCard, BASIC_AMOUNT_OF_CARDS);  //проверка на верное кол-во карточек
        return this; //возвращаем экземпляр класса

    }

}
