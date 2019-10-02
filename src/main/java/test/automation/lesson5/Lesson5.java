package test.automation.lesson5;

import org.openqa.selenium.WebDriver;

public class Lesson5 {


    public static void main(String[] args) {
        String baseURL = "https://www.ukr.net/ua/";

        for (Browser browser : Browser.values()) {
            System.out.println(browser.toString());
            WebDriver driver = Driver.getDriver(browser, "full-screen");
            driver.get(baseURL);
            driver.quit();
        }
    }

}
