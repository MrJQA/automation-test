package test.automation.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;
import static junit.framework.TestCase.*;

public class Lesson7 {
String ttt = "Українська";
    static WebDriver driver;

    @BeforeClass
    public static void setup()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterClass
    public static void stop()
    {
        driver.quit();
    }

    //1.	перевірити, що зверху сторінки є вибір мови
    @Test
    public void test1()
    {
        System.out.println("Test1 ---Початок---");
        driver.navigate().to("https://accounts.ukr.net/registration");
        WebElement header = driver.findElement(By.tagName("header"));
        List<WebElement> langsLong = header.findElements(By.className("header__lang-long-name"));
        List<WebElement> langsShort = header.findElements(By.className("header__lang-short-name"));
        //Українська
        /*if (("Українська".equals(langsLong.get(0).getText()) || "Укр".equals(langsLong.get(0).getText())) &&
            (langsLong.get(0).isDisplayed() || langsShort.get(0).isDisplayed()))
        { System.out.println("Українська мова присутня");}
        else
        { System.out.println("Test 1. халепа з Українська мова");}
        //Російська
        if (("Русский".equals(langsLong.get(1).getText()) || "Рус".equals(langsLong.get(1).getText())) &&
                (langsLong.get(1).isDisplayed() || langsShort.get(1).isDisplayed()))
        { System.out.println("Російська мова присутня");}
        else
        { System.out.println("Test 1. халепа з Російська мова");}
        //Англійська
        if (("English".equals(langsLong.get(2).getText()) || "Eng".equals(langsLong.get(2).getText())) &&
                (langsLong.get(2).isDisplayed() || langsShort.get(2).isDisplayed()))
        { System.out.println("English мова присутня");}
        else
        { System.out.println("Test 1. халепа з English мова");}*/

        assertTrue("\n Test 1. халепа з Українська мова",("Українська".equals(langsLong.get(0).getText()) || "Укр".equals(langsLong.get(0).getText())) &&
                (langsLong.get(0).isDisplayed() || langsShort.get(0).isDisplayed()));
        assertTrue("\n Test 1. халепа з Російська мова", ("Русский".equals(langsLong.get(1).getText()) || "Рус".equals(langsLong.get(1).getText())) &&
                (langsLong.get(1).isDisplayed() || langsShort.get(1).isDisplayed()));
        assertTrue("\n Test 1. халепа з English мова", ("English".equals(langsLong.get(2).getText()) || "Eng".equals(langsLong.get(2).getText())) &&
                (langsLong.get(2).isDisplayed() || langsShort.get(2).isDisplayed()));
        System.out.println("Test1 ---кінець---");
    }

    @Test
    public void tets2()
    {
        System.out.println("Test2 ---Початок---");
        driver.navigate().to("https://accounts.ukr.net/registration");
        WebElement activLang = driver.findElement(By.className("header__lang-item_active"));
        List<WebElement> noActivLang = driver.findElements(By.className("header__lang-item"));
        assertTrue("\n Test 2. Колір активної не корректний", "rgba(52, 56, 64, 1)".equals(activLang.getCssValue("color")));
        assertTrue("\n Test 2. Колір не активних мов не корректний", "rgba(102, 153, 0, 1)".equals(noActivLang.get(1).getCssValue("color")) && "rgba(102, 153, 0, 1)".equals(noActivLang.get(1).getCssValue("color")) );

        System.out.println("Test2 ---кінець---");
    }
}
