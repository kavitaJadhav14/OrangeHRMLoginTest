package stepDefination;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import driver.BaseClass;
import org.openqa.selenium.WebDriver;

public class Hooks {

 WebDriver driver;
  BaseClass baseClass = new BaseClass();


  @Before
   public  void  setup(){

    baseClass.setupDriver();
   }

   @After
   public void teardown(){
  baseClass.tear_down();
   }
}
