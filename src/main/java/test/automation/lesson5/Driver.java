package test.automation.lesson5;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import io.github.bonigarcia.wdm.OperaDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class Driver {

    public static WebDriver getDriver(Browser browser, String arguments)
    {
        WebDriver driver = null;

        /*switch (browser)
        {
            case CHROME:
                ChromeDriverManager.chromedriver().setup();
                ChromeOptions chromeOpt = new ChromeOptions();
                if (arguments == "full-screen")
                {
                    chromeOpt.addArguments("start-fullscreen");
                }
                return driver =  new ChromeDriver(chromeOpt);
            case OPERA:
                OperaDriverManager.operadriver().setup();
                OperaOptions operaOpt = new OperaOptions();
                if (arguments == "full-screen")
                {
                    //operaOpt.addArguments("start-fullscreen");
                }
                return driver =  new OperaDriver(operaOpt);
            case IE:
                InternetExplorerDriverManager.iedriver().setup();
                InternetExplorerOptions ieOpt = new InternetExplorerOptions();
                ieOpt.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING,true);
                ieOpt.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
                if (arguments == "full-screen")
                {
                    //ieOpt.addArguments("start-fullscreen");
                }
                return driver =  new InternetExplorerDriver(ieOpt);
            /*case FIREFOX:
                FirefoxDriverManager.firefoxdriver().setup();
                FirefoxOptions foxOpt = new FirefoxOptions();
                foxOpt.setCapability(FirefoxDriver.MARIONETTE, false);
                if (arguments == "full-screen")
                {
                    //foxOpt.addArguments("fullscreen");
                }
                return driver =  new FirefoxDriver(foxOpt);*//*
            default:
                return null;
        }
        */


        if (browser.toString() == "CHROME")
        {

            ChromeDriverManager.chromedriver().setup();
            ChromeOptions opt = new ChromeOptions();
            if (arguments == "full-screen")
            {
                opt.addArguments("start-fullscreen");
            }
            driver =  new ChromeDriver(opt);

        }
        if (browser.toString() == "FIREFOX")
        {
            FirefoxDriverManager.firefoxdriver().setup();
            FirefoxOptions opt = new FirefoxOptions();
            opt.setCapability(FirefoxDriver.MARIONETTE, false);
            if (arguments == "full-screen")
            {
                //opt.addArguments("fullscreen");
            }
            driver =  new FirefoxDriver(opt);

        }
        if (browser.toString() == "OPERA")
        {
            OperaDriverManager.operadriver().setup();
            OperaOptions opt = new OperaOptions();
            if (arguments == "full-screen")
            {
                //opt.addArguments("start-fullscreen");
            }
            driver =  new OperaDriver(opt);

        }
        if (browser.toString() == "IE")
        {
            InternetExplorerDriverManager.iedriver().setup();
            InternetExplorerOptions opt = new InternetExplorerOptions();
            opt.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING,true);
            opt.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
            if (arguments == "full-screen")
            {
                //opt.addArguments("start-fullscreen");
            }
            driver =  new InternetExplorerDriver(opt);

        }


        return driver;
    }
}
