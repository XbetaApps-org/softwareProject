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
        welcomeFrame = new WelcomeFrame();
        welcomeFrame.setVisible(true);
    }

    @Then("the user should see a {string} button")
    public void the_user_should_see_a_button(String buttonName) {
        boolean isVisible = false;
        switch (buttonName) {
            case "Sign Up":
                isVisible = welcomeFrame.getSignUpButton().isVisible();
                break;
            case "Login":
                isVisible = welcomeFrame.getLoginButton().isVisible();
                break;
        }
        assertTrue(isVisible);
    }

    @When("the user clicks the {string} button")
    public void the_user_clicks_the_button(String buttonName) {
        switch (buttonName) {
            case "Sign Up":
              //  welcomeFrame.getSignUpButton().doClick();
                signUpFrame = new SignUpFrame();
                signUpFrame.setVisible(true);
                break;
            case "Login":
            	
            	
            //	welcomeFrame = new WelcomeFrame();
             //    welcomeFrame.setVisible(true);
                
                 
               //  welcomeFrame.getLoginButton().doClick();
                loginFrame = new LoginFrame();
                loginFrame.setVisible(true);
                break;
        }
    }

    @Then("the user should be on the {string} page")
    public void the_user_should_be_on_the_page(String pageName) {
        boolean isVisible = false;
        switch (pageName) {
            case "sign up":
                isVisible = welcomeFrame.isSignUpButtonClicked();
                break;
            case "login":
                isVisible = welcomeFrame.isLoginButtonClicked();
                break;
        }
        assertTrue(isVisible);
    }
}
