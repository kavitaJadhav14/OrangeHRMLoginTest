package pageObjects;

import driver.BaseClass;

public class ResultPage extends BaseClass {

    public String validatepage(){

        return driver.getTitle();

    }
    public  void  checkUrl(){
        driver.get("https://s2.demo.opensourcecms.com/orangehrm/index.php");
    }
}
