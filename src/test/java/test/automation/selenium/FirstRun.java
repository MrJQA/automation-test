package test.automation.selenium;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FirstRun {

    WebDriver driver;

    @Before
    public void start()
    {
        //WebDriverManager.chromedriver().setup();
        ChromeDriverManager.chromedriver().setup();
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("start-fullscreen");
        driver = new ChromeDriver(opt);


    }

    @After
    public void stop()
    {
        driver.quit();
    }

    @Test
    public void firstRun()
    {
        driver.get("https://www.ukr.net");
    }




}
