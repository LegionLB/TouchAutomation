package pages.listing;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.base.BasePage;

import static constants.Constant.PageItems.BASIC_AMOUNT_OF_CARDS;

public class TouchListingPage extends BasePage {


    public TouchListingPage(WebDriver driver) {  //конструктор
        super(driver);
    }

    private final By card = By.xpath("//div[@class='item product sku']"); //находим карточку на странице
    private final By searchResult = By.xpath("//h1[@class='changeName']"); // текст результата

    @Step("Проверяем что кол-во карточек на странице = 30")
    public TouchListingPage checkAmountOfCards(){  // метод который проверяет кол-во карточек

        int countCard = driver.findElements(card).size(); // ищем коллекцию карточек и получаем её размер
        Assert.assertEquals(countCard, BASIC_AMOUNT_OF_CARDS);  //проверка на верное кол-во карточек
        return this; //возвращаем экземпляр класса

    }

    @Step("Сравниваем результат поиска с текстом поиска {searchItem}")
    public TouchListingPage checkSearchingResult(String searchItem){

        WebElement result = driver.findElement(searchResult);
        Assert.assertEquals("Результаты поиска - «" + searchItem + "»", result.getText());

        return this;

    }

}
