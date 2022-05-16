package SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_ {

    // ...Exercise4...
// Navigate to  https://testpages.herokuapp.com/styled/index.html
// Click on  Calculate under Micro Apps
//    Type any number in the first input
//    Type any number in the second input
// Click on Calculate
// Get the result
// Print the result
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testpages.herokuapp.com/styled/index.html");
        driver.findElement(By.id("calculatetest")).click();
        driver.findElement(By.id("number1")).sendKeys("20");
        driver.findElement(By.id("number2")).sendKeys("30");
        driver.findElement(By.id("calculate")).click();

        System.out.println(driver.findElement(By.id("answer")).getText());





    }
}
