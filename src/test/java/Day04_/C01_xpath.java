package Day04_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_xpath {
    public static void main(String[] args) throws InterruptedException {
        /*1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        2- Add Element butonuna basin
        3- Delete butonu’nun gorunur oldugunu test edin
        4- Delete tusuna basin
        5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        */
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");


        // BU methodu bulmayı ogren ---> By.xpath("//button[@onclick='addElement()']") ===> xPath bulma,
        // basındaki 2 // karakteri ve @ karakterini silersen de "css.Selector" oluyor.===> css.Selector Bulma.
        driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();

        WebElement deleteButton = driver.findElement(By.xpath("//button[@class='added-manually']"));

        if (deleteButton.isDisplayed()){
            System.out.println(" delete butonu testi PASSED :) ");

        }else {
            System.out.println("delete butonu testi FAİLED :( ");

            deleteButton.click();
        }

        WebElement add_RemoveYazisi = driver.findElement(By.xpath("//h3"));

        if (add_RemoveYazisi.isDisplayed()){
            System.out.println(" add/Remove Elementi Yazi testi PASSED :) ");

        }else {
            System.out.println(" add/Remove Elementi Yazi testi FAİLED :( ");
        }

        driver.close();
    }


}