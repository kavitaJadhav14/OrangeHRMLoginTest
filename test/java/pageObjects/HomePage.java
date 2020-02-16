package pageObjects;

import driver.BaseClass;
import org.junit.Test;
import org.openqa.selenium.By;

public class HomePage extends BaseClass {



    public void loginPanel(String username,String password){

       // driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("opensourcecms");
  // driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("opensourcecms");
        driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys(username);
        driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys(password);
        driver.findElement(By.id("btnLogin")).click();

    }

    public  String errormessage(){
        return driver.findElement(By.id("spanMessage")).getText();
    }
}
