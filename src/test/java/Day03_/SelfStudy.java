package Day03_;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelfStudy {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.trendyol.com");
        Thread.sleep(2000);

        //WebElement aramaKutusu = driver.findElement(By.className("search-box"));
       // aramaKutusu.sendKeys("Golden Brothers" + Keys.ENTER);
        //Thread.sleep(3000);

        WebElement sonucYazisi = driver.findElement(By.xpath("//*[@id=\"browsing-gw-homepage\"]/div/div/div/article[2]/a/span/img"));

        System.out.println("sonuc yazisi: " + sonucYazisi.getText());

        driver.quit();
        // webelementler obje oldugu icin direk yazdirilamazlar
        // webelemntin sahip oldugu yaziyi string olarak yazdirmak icin
        // getText() method u kullanilir
    }
}
