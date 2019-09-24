package test.automation.lesson4;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Driver {

    public static WebDriver getDriver(Browser browser, String arguments)
    {
        WebDriver driver = null;
        if (browser.toString() == "Chrome")
        {

            ChromeDriverManager.chromedriver().setup();
            ChromeOptions opt = new ChromeOptions();
            if (arguments == "full-screen")
            {
                opt.addArguments("start-fullscreen");
            }
            driver =  new ChromeDriver(opt);

        }
        if (browser.toString() == "Firefox")
        {
            FirefoxDriverManager.firefoxdriver().setup();
            FirefoxOptions opt = new FirefoxOptions();
            if (arguments == "full-screen")
            {
                //opt.addArguments("fullscreen");
            }
            driver =  new FirefoxDriver(opt);

        }

        return driver;
    }
}
