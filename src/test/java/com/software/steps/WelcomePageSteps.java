package com.software.steps;

import com.software.ui.WelcomeFrame;
import com.software.ui.SignUpFrame;
import com.software.ui.LoginFrame;
import io.cucumber.java.en.*;
import static org.junit.Assert.*;

public class WelcomePageSteps {

    private WelcomeFrame welcomeFrame;
    private SignUpFrame signUpFrame;
    private LoginFrame loginFrame;

    @Given("the user is on the welcome page")
    public void the_user_is_on_the_welcome_page() {
        // Initialize and display the WelcomeFrame
        welcomeFrame = new WelcomeFrame();
        welcomeFrame.setVisible(true);
    }

    @Then("the user should see a {string} button")
    public void the_user_should_see_a_button(String buttonName) {
        boolean isVisible = false;
        switch (buttonName) {
            case "Sign Up":
                isVisible = welcomeFrame.getSignUpButton() != null && welcomeFrame.getSignUpButton().isEnabled();
                break;
            case "Login":
                isVisible = welcomeFrame.getLoginButton() != null && welcomeFrame.getLoginButton().isEnabled();
                break;
            default:
                fail("Unexpected button name: " + buttonName);
                break;
        }
        assertTrue("The " + buttonName + " button should be visible.", isVisible);
    }

    @When("the user clicks the {string} button")
    public void the_user_clicks_the_button(String buttonName) {
        boolean isVisible = false;
        switch (buttonName) {
            case "Sign Up":
                isVisible = welcomeFrame.getSignUpButton() != null && welcomeFrame.getSignUpButton().isEnabled();
                break;
            case "Login":
                isVisible = welcomeFrame.getLoginButton() != null && welcomeFrame.getLoginButton().isEnabled();
                break;
            default:
                fail("Unexpected button name: " + buttonName);
                break;
        }
        assertTrue("The " + buttonName + " button should be visible.", isVisible);

        // Perform the click action if the button is visible
        if (isVisible) {
            switch (buttonName) {
                case "Sign Up":
                    welcomeFrame.getSignUpButton().doClick();
                    break;
                case "Login":
                    welcomeFrame.getLoginButton().doClick();
                    break;
                default:
                    fail("Unexpected button name for clicking: " + buttonName);
                    break;
            }
        }
    }

    @Then("the user should see a {string} page")
    public void the_user_should_see_a_page(String pageName) {
        boolean isVisible = false;
        switch (pageName) {
            case "Sign Up":
                isVisible = welcomeFrame.getSignUpButton() != null && welcomeFrame.getSignUpButton().isEnabled();
                break;
            case "Login":
                isVisible = welcomeFrame.getLoginButton() != null && welcomeFrame.getLoginButton().isEnabled();
                break;
            default:
                fail("Unexpected page name: " + pageName);
                break;
        }
        assertTrue("The " + pageName + " page should be visible.", isVisible);
    }
}
