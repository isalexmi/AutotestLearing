import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public class LoginBookingCom {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.manage().window().maximize();
        driver.navigate().to("https://www.booking.com/");
        driver.findElement(By.id("current_account")).click();
        driver.findElement(By.id("username")).sendKeys("mandibula.vitek@gmail.com");
        driver.findElement(By.cssSelector("form button[type='submit']")).click();
        driver.findElement(By.id("password")).sendKeys("5tgbNHY^");
        driver.findElement(By.cssSelector("form button[type='submit']")).click();
        driver.findElement(By.id("profile-menu-trigger--content")).getText();
        Assert.assertEquals("Витек Мандибула", driver.findElement(By.id("profile-menu-trigger--content")).getText());
        driver.findElement(By.id("profile-menu-trigger--content")).click();
        //driver.findElement(By.cssSelector("form button[type='submit']")).click();
        //driver.quit();

    }
}
