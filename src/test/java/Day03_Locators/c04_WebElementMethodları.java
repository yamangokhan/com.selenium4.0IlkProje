package Day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class c04_WebElementMethodları {
    /*
    1- amazon.com a gidip arama kutusunu locate edin.
    2- Arama kutusunun tag name inin input oldugunu test edin.
    3- arama kutusunun name attribute nın degerinin ... oldugunu test edin.
    */

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");

        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));

        String expectedSearchBox = "";
        String expectedTagName = "input";
        String actualTagName = searchBox.getTagName();

        if (actualTagName.equals(expectedTagName)){
            System.out.println("Tag name testi PASSED ");
        } else {
            System.out.println("Taga Name testi FAİLED ");
        }

        String expectedNameDeger = "field-keywords";
        String actualNameDeger = searchBox.getAttribute("name");
        if (expectedNameDeger.equals(actualNameDeger)){
            System.out.println("name deger testi PASSED ");
        } else {
            System.out.println(" Name deger  testi FAİLED ");
        }
    /*
    <input type="text" id="twotabsearchtextbox" value="" name="field-keywords" autocomplete="off" placeholder="" class="nav-input nav-progressive-attribute" dir="auto" tabindex="0" aria-label="Search">
     webElementIsmi.getTagName() = daha once locate ettgımız bir webelementının tagname'nı dondurur.
     weElementIsmı.getAttribute() = daha once locate ettıgımız bir webelementın istediğim Attribute nun degerini dondurur.
     */

        System.out.println("konum : " + searchBox.getLocation());

        System.out.println( "yukseklık :" +  searchBox.getSize().height);
    }
}
