package Day02_DriverMethodları;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_ilkTest {
    public static void main(String[] args) {
/*  1- https://www.amazon.com url'ine gidin
    2- Basligin Amazon kelimesi icerdigini test edin
    3- Url'in "https://www.amazon.com" a esit oldugunu test edin
    4- sayfayi kapatin
 */
        System.setProperty("webdriver.chrome.driver" , "src/resources/drivers/chromedriver.exe");

        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize(); // driver i tam sayfa yapar

//1- https://www.amazon.com url'ine gidin
        driver.get("https://www.amazon.com");


// 2- Basligin Amazon kelimesi icerdigini test edin
        String actualTitle = driver.getTitle();
        String arananKelime = "Amazon";
        if (actualTitle.contains(arananKelime)){
            System.out.println("title testi PASSED :) ");
        } else {
            System.out.println("title " + arananKelime + " yi içermiyor, titlr Test FAİLED :( ");
        }

//     3- Url'in "https://www.amazon.com" a esit oldugunu test edin
        String actualURL=driver.getCurrentUrl();
        String expectedURL = "https://www.amazon.com/";
        if (actualURL.equals(expectedURL)){
            System.out.println("URL testi PASSED :) ");
        } else {
            System.out.println("URL testinde " + expectedURL +  " " + actualURL + " den farklı, Test FAİLED :( ");
        }

//     4- sayfayi kapatin
        driver.close();

    }
}
