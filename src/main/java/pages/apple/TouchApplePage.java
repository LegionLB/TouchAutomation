package pages.apple;

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

    public TouchApplePage applePageHeader(){
        WebElement header = driver.findElement(appleHeader);
        waitElementIsVisible(header);

        Assert.assertEquals(header.getText(), "Техника Apple");

        return this;
    }

    public TouchApplePage checkIsAppleCards(){

        List<WebElement> appleCards = driver.findElements(appleCard);

        for (WebElement webElement: appleCards){

            Assert.assertTrue(webElement.getText().contains("Apple"));

        }
        return this;
    }
}
