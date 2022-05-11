package Day02_DriverMethodları;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_manageMethodları {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        System.out.println("window olculeri : " + driver.manage().window().getSize());
        System.out.println("window konumu : " + driver.manage().window().getPosition());
        Thread.sleep(2000);
        // pencerenin konumu ve buyuklugunu degıstırelim

        driver.manage().window().setPosition(new Point( 1, 1 ));
        driver.manage().window().setSize(new Dimension(1050, 600));

        System.out.println("new window olculeri : " + driver.manage().window().getSize());
        System.out.println("new window konumu : " + driver.manage().window().getPosition());
    }
}
