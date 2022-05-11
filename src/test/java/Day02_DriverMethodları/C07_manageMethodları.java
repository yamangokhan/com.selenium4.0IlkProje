package Day02_DriverMethodları;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C07_manageMethodları {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        /*
        ileride wait konusunu daha genıs olarak ele alacagız.

        Bir sayfa acılırken ilk basta sayfanın ıcerısınde bulunan elementlere gore bir yüklenme süresine ihtiyac vardır.
        Veya bir web elemntinin kullanılbilmesi için zamana ihtiiyac olablir
        implicitlyWait bize sayfaının yuklenmesi ve sayfadaki elementlere ulasım ıcın beklenecek """maxımum süreyi""" belirleme olanagı tanır.
         acılana kadar bekler, buradaki maximum süreye kadar beklemesine gerek yok
         */

        driver.get("https://www.aamazon.com") ;
        driver.close();
    }
}
