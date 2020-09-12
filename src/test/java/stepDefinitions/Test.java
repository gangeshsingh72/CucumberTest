package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;

import java.sql.SQLOutput;

import static stepDefinitions.Hooks.driver;

/*    Regular Expression

Option 1 -->    \"(.*)\"
Option 2 -->    \"([^\"]*)\"
 */

public class Test {

    @Given("^I am a Facebook user$")
    public void i_am_a_Facebook_user()  {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Inside Given Statement No 1 ");
    }

    @When("^I access Facebook login page$")
    public void i_access_Facebook_login_page()  {
        // Write code here that turns the phrase above into concrete actions

        System.out.println("Inside When Statement No 1 ");
        driver.get("https://en-gb.facebook.com");
    }


    @Then("^I  see facebook logo$")
    public void i_see_facebook_logo()  {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Inside Then Statement No 1 ");
    }

    @When("^I access Facebook logo page$")
    public void i_access_Facebook_logo_page()  {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Inside When Statement No 2 ");
    }

    @Then("^I see \"([^\"]*)\" text on the above edit box$")
    public void i_see_text_on_the_above_edit_box(String arg1)  {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Inside Then Statement No 2 ");
    }

    @Then("^I see an edit box to enter email$")
    public void i_see_an_edit_box_to_enter_email()  {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Inside Then Statement No 3 ");
    }

    @Then("^I see Email or phone text on the above edit box$")
    public void i_see_Email_or_phone_text_on_the_above_edit_box()  {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^I see the text Password on the page above edit box$")
    public void i_see_the_text_Password_on_the_page_above_edit_box()  {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^I see Log In button next to email and password edit boxes$")
    public void i_see_Log_In_button_next_to_email_and_password_edit_boxes()  {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^I see a link for Forgotten account$")
    public void i_see_a_link_for_Forgotten_account() {
        // Write code here that turns the phrase above into concrete actions

    }


}
