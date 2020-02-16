package stepDefination;

import cucumber.api.java.en.*;
import org.junit.Assert;
import pageObjects.HomePage;
import pageObjects.ResultPage;

public class LoginInvalidTest {

    HomePage homePage = new HomePage();
    ResultPage resultPage = new ResultPage();


    @Given("^user is on OrangeHRM Webpage and enter invalid username and password$")
    public void user_is_on_OrangeHRM_Webpage_and_enter_invalid_username_and_password() throws Throwable {
        homePage.loginPanel(" 12opersourcecms","12opersourcecms");
    }

    @When("^user couldn't login$")
    public void user_couldn_t_login() throws Throwable {
        resultPage.validatepage();
    }

    @Then("^user can see error message$")
    public void user_can_see_error_message() throws Throwable {
    String errormessage=    homePage.errormessage();
        Assert.assertEquals("Invalid credentials",errormessage);
    }
    @Then("^user close the browser$")
    public  void user_close_the_browser(){
       // ResultPage.driver.quit();
    }

}
