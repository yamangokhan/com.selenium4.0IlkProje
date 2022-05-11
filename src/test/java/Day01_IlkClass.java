import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Day01_IlkClass {
    ChromeDriver driver = null;

    public static void main(String[] args) {
        //en ilkel haliyle bir otomosyon yapmak için Class ımıza otomsayon ıcın gerekli olan ve driverin yerini göstermemiz gerekir.
        // bunun ıcın Java kutuphanesinden System.setProperty () methodunu kullanırız.
        // ilki kullanacagımız driver ,
        // İkincisi ise bu driverin fiziki yolu,
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.trendyol.com/");

        driver.get("https://www.amazon.com");


        driver.close();
    }
}
