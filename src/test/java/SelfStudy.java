import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelfStudy {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        System.out.println("suan ki guncel url : "  + driver.getCurrentUrl());
        System.out.println("suan ki baslık : " + driver.getTitle());
        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.navigate().to("https://www.trendyol.com/");
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);

       driver.navigate().forward();
       Thread.sleep(3000);

        driver.navigate().refresh();
        Thread.sleep(3000);

        driver.quit();
    }
}
