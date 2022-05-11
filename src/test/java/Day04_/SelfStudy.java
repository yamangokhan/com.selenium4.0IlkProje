package Day04_;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SelfStudy {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();



        driver.get("https://www.trendyol.com/giris?cb=https%3A%2F%2Fwww.trendyol.com%2F");

        driver.manage().deleteAllCookies();
        // WebElement aramaKutusu = driver.findElement(By.className("search-box"));

        //aramaKutusu.sendKeys("Golden Brothers" + Keys.ENTER);

        WebElement emailBox = driver.findElement(By.xpath("//*[@id=\"login-email\"]"));

        WebElement sıfreBox = driver.findElement(By.xpath("//*[@id=\"login-password-input\"]"));

        WebElement button = driver.findElement(By.className("q-primary q-fluid q-button-medium q-button submit"));

        emailBox.sendKeys("yamangokhanyaman@gmail.com");

        sıfreBox.sendKeys("4511332Gy.");

        button.click();

        Thread.sleep(3000);


        driver.quit();

    }
}
