package Day02_DriverMethodları;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c02_getPageSources {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize(); // driver i tam sayfa yapar

        driver.get("https://www.amazon.com");
        driver.getPageSource(); // sayfanın kaynak kodlarına bakabiliriz

        String sayfaKaynakKodları = driver.getPageSource();
        String arananKelime = "Spend less";

        if (sayfaKaynakKodları.contains(arananKelime)) {
            System.out.println("Sayfa Kaynak Kodu PASSED  : ) ");
        } else {
            System.out.println("Kaynak kodlarında " + arananKelime + " yok, test FAİLED :( ");
        }
         driver.close();
    }
}
