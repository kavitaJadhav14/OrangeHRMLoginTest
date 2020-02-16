package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseClass {

   public static WebDriver driver;

  // @Before
    public  void  setupDriver(){

        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.get("https://s2.demo.opensourcecms.com/orangehrm/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

    }
     public  void  tear_down(){
        driver.quit();
     }
}
