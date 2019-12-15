package ru.org.autotest;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    private static WebDriver driver;

    @BeforeClass
    public static void setup(){
        //System.setProperty("webdriver.chrome.driver", "c:\\WebDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://yandex.ru/");
    }

    @Test
    public void userLogin(){

    }

    @AfterClass
    public static void tearDown() {

    }
}
