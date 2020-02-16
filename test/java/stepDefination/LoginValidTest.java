package stepDefination;

import cucumber.api.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pageObjects.HomePage;
import pageObjects.ResultPage;

public class LoginValidTest {

    HomePage homePage= new HomePage();
    ResultPage resultPage =  new ResultPage();

    @Given("^user is on OrangeHRM Webpage and enter valid username and password$")
    public void user_is_on_OrangeHRM_Webpage_and_enter_valid_username_and_password() throws Throwable {
    homePage.loginPanel("opensourcecms","opensourcecms");

}

    @When("^user is on result page$")
    public void user_is_on_result_page() throws Throwable {
     String actualpage=   resultPage.validatepage();
        Assert.assertEquals("OrangeHRM",actualpage);
    }

    @Then("^user can see employee information page$")
    public void user_can_see_employee_information_page() throws Throwable {
    resultPage.checkUrl();
    }


}
