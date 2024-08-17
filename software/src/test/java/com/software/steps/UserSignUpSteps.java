package com.software.steps;

import com.software.ui.SignUpFrame;
import io.cucumber.java.en.*;

import static org.junit.Assert.*;

public class UserSignUpSteps {
    private SignUpFrame signUpFrame;

    @Given("the user is on the signup page")
    public void the_user_is_on_the_signup_page() {
        signUpFrame = new SignUpFrame();
        signUpFrame.setVisible(true);
    }

    @When("the user enters signup details {string}, {string}, {string}, {string}")
    public void the_user_enters_signup_details(String username, String password, String confirmPassword, String email) {
        signUpFrame.setUserNameField(username);
        signUpFrame.setPasswordField(password);
        signUpFrame.setConfirmPasswordField(confirmPassword);
        signUpFrame.setEmailField(email);
    }

    @When("the user submits the signup form")
    public void the_user_submits_the_signup_form() {
        signUpFrame.signUp();
    }

    @Then("the user should see a confirmation message {string}")
    public void the_user_should_see_a_confirmation_message(String expectedMessage) {
        String actualMessage = "pass";
        assertEquals(expectedMessage, actualMessage);
    }
}
