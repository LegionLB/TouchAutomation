package settings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static settings.Config.PLATFORM_AND_BROWSER;
import static constants.Constant.TimeoutVariable.IMPLICITLY_WAIT;

public class DriverSettings {
    // Инициализируем вебдрайвер
    public static WebDriver createDriver(){
        WebDriver driver = null; // Объявляем вебдрайвер

        switch (PLATFORM_AND_BROWSER){   // Создаём выборку платформы и браузера

            case "mac_chrome":
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--headless"); //отключение UI хрома
                driver = new ChromeDriver();
                break;
            default:
                Assert.fail("Incorrect platform or browser name: " + PLATFORM_AND_BROWSER); // обрабатываем ошибку
        }
        //driver.manage().window().maximize();  // увеличиваем окно открывающегося браузера

        driver.manage().timeouts().implicitlyWait(IMPLICITLY_WAIT, TimeUnit.SECONDS); // создаём автозадержку
        return driver;
    }

}
