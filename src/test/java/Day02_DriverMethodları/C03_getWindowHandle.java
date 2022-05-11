package Day02_DriverMethodları;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_getWindowHandle {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver" , "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
       // System.out.println(driver.getWindowHandle());
      //  1 . denemede : CDwindow-61BE31324121997033E4CB10B3F70D03
      // 2. denemede : CDwindow-50F4C0397E2955A367FC5A878B557659
      //  .
      // .
      // .
      // .
// benzersiz olarak windows' a ait HashCode nu verir. Bu code ları bilemezsek bir windowdan diger window a gecemeyiz .




    }
}
