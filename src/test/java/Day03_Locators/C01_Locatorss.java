package Day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Locatorss  {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Amazona gidip Nutella aratalım.

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com/");
        //findElement (By.... locator) ---> istedgimiz webElementini bize dondurur.
        // biz de web elementını kullanmak için bir objeye assaign edeeriz.
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));

        //WebElement aramaKutusu = driver.findElement(By.className("nav-search-field ")); // bu locater calısmadı

        //Locator alırken gozumuzden kacan detaylar olabilir.
        // Aldıgımız bir locator calısmazsa alternatıf locator'lar denemeliyiz.

        // herhangi bir webelementine istedgimiz yazıyı yollamak istersek;

        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
    }
}
