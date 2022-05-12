package Day04_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_sscSelector {


    public static void main(String[] args) {
/*
1 ) Bir class oluşturun : Locators_css
2 ) Main method oluşturun ve aşağıdaki görevi tamamlayın.
    a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
    b. Locate email textbox
    c. Locate password textbox ve
    d. Locate signin button
    e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
        i. Username : testtechproed@gmail.com
        ii. Password : Test1234!
 */
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        driver.get("http://a.testaddressbook.com/sign_in");

        WebElement emailTexBox = driver.findElement(By.cssSelector("#session_email"));
        WebElement passwordTexbox = driver.findElement(By.cssSelector("#session_password"));
        WebElement siginButton = driver.findElement(By.cssSelector("input[type='submit']"));

        emailTexBox.sendKeys("testtechproed@gmail.com");
        passwordTexbox.sendKeys("Test1234!");
        siginButton.click();

        driver.close();
    }
}
