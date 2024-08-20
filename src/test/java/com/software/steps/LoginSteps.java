package com.software.steps;

import static org.junit.Assert.assertEquals;

import java.awt.event.ActionEvent;

import com.software.ui.LoginFrame;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    private LoginFrame loginFrame;
    private String message;

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        loginFrame = new LoginFrame();
    }

    @And("the user selects login as {string} from a combo box")
    public void the_user_selects_login_as_from_a_combo_box(String role) {
        loginFrame.setUserType(role);
    }

    @When("the user enters username {string} and password {string}")
    public void the_user_enters_username_and_password(String username, String password) {
        loginFrame.setUserNameField(username);
        loginFrame.setPasswordField(password);
    }

    @And("clicks on the login button")
    public void clicks_on_the_login_button() {
        loginFrame.loginButtonActionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, null));
    }

    @Then("the user will see a message {string}")
    public void the_user_will_see_a_message(String expectedMessage) {
        message = loginFrame.getDisplayedMessage();
        assertEquals(expectedMessage, message);
    }
}
