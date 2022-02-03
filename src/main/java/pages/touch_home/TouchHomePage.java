package pages.touch_home;

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

    public TouchHomePage inputToSearch(String input){
        WebElement searchField = driver.findElement(searchingField);
        waitElementIsVisible(searchField).sendKeys(input);

        return this;
    }


    public TouchHomePage clickToSearch(){
        WebElement searchButton = driver.findElement(findButton);
        waitElementIsVisible(searchButton).click();

        return this;
    }


}
