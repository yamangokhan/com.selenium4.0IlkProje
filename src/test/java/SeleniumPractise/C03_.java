package SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_ {
    // ...Exercise3...
// go to url : https://www.techlistic.com/p/selenium-practice-form.html
//fill the firstname
//fill the firstname
//check the gender
//check the experience
//fill the date
//choose your profession -> Automation Tester
//choose your tool -> Selenium Webdriver
//choose your continent -> Antartica
//choose your command  -> Browser Commands
//click submit button

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

        driver.manage().deleteAllCookies();

        driver.findElement(By.id("cookieChoiceDismiss")).click();

        driver.findElement(By.name("firstname")).sendKeys("gokhan");

        driver.findElement(By.name("lastname")).sendKeys("yaman");

        driver.findElement(By.id("sex-0")).click();

        driver.findElement(By.id("exp-3")).click();

        driver.findElement(By.id("datepicker")).sendKeys("16.05.2022");

        driver.findElement(By.xpath("//input[@id='profession-1']")).click();

        driver.findElement(By.id("tool-2")).click();

        driver.findElement(By.xpath("//option[.='Antartica']")).click();

        driver.findElement(By.xpath("//option[.='Browser Commands']")).click();

        driver.findElement(By.xpath("//button[@id='submit']")).click();









    }
}
