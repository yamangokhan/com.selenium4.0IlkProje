package Day02_DriverMethodları;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_manageMethodları {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver" , "src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        System.out.println("max konum : " + driver.manage().window().getPosition());
        System.out.println("max boyut : " + driver.manage().window().getSize());

        driver.manage().window().fullscreen();
        System.out.println("fullscreen konum : " + driver.manage().window().getPosition());
        System.out.println("fullscreen boyut : " + driver.manage().window().getSize());

        driver.close();
    }


}
