import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class LoginTest {

    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 10);
        driver.get("https://google.com/");
        //driver.findElement(By.className("hOoLGe")).click();
        //driver.findElement(By.id("K83")).click();
        driver.findElement(By.name("q")).sendKeys("E3 2019");
        //driver.findElement(By.name("text")).sendKeys("Е3 2019");
        driver.findElement(By.name("btnK")).click();
        String homepage = "E3 2019 - Поиск в Google";
    }

    @Test

    @After
    public void stop(){
        driver.quit();
    }
}
