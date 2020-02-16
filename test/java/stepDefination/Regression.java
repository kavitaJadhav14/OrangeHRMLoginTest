package stepDefination;

import driver.BaseClass;
import org.junit.Assert;
import org.junit.Test;
import pageObjects.HomePage;
import pageObjects.ResultPage;

public class Regression extends BaseClass {


    HomePage homePage = new HomePage();
    ResultPage resultPage = new ResultPage();

@Test
    public void  searchTest(){
        homePage.loginPanel("opensourcecms","opensourcecms");
        String actualtitle = resultPage.validatepage();
        Assert.assertEquals(    "OrangeHRM",actualtitle );
        resultPage.checkUrl();
    }
}
