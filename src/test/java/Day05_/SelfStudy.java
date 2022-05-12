package Day05_;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Locale;

public class SelfStudy {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com/");

        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("city bike" + Keys.ENTER);

        WebElement sonuc = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[1]"));

        System.out.println(" sonuc : " + sonuc.getText().toUpperCase(Locale.ROOT));

        WebElement ayrıButon = driver.findElement(By.className("nav-search-scope nav-sprite"));


        searchBox=driver.findElement(By.id("twotabsearchtextbox"));


        searchBox.clear();

        searchBox.sendKeys("shopping" + Keys.ENTER);

        WebElement gorsel = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/div/div/div/div[1]/span/a/div/img"));

        gorsel.click();

        WebElement satınAl=driver.findElement(By.xpath("//*[@id=\"buy-now-button\"]"));

        satınAl.click();
    }
}
