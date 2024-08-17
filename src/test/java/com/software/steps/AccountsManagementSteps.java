package com.software.steps;

import static org.junit.Assert.assertEquals;

import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

import com.software.ui.AccountsFrame;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountsManagementSteps {

    private AccountsFrame accountsFrame;
    private JTextField userNameField;
    private JTextField emailField;
    private JPasswordField passwordField;
    private JTextField cityField;
    private JComboBox<String> userTypeComboBox;
    private JComboBox<String> actionTypeComboBox;
    private String message;

    @Given("the admin is on the accounts management page")
    public void the_admin_is_on_the_accounts_management_page() {
        accountsFrame = new AccountsFrame();
        accountsFrame.setVisible(true);
        userNameField = accountsFrame.getUserNameField();
        emailField = accountsFrame.getEmailField();
        passwordField = accountsFrame.getPasswordField();
        cityField = accountsFrame.getCityField();
        userTypeComboBox = accountsFrame.getSelectedUserType();
        actionTypeComboBox = accountsFrame.getSelectedActionType();
    }

    @And("the admin selects user type {string} from the combo box")
    public void the_admin_selects_user_type_from_the_combo_box(String userType) {
        userTypeComboBox.setSelectedItem(userType);
    }

    @And("the admin selects action type {string} from the combo box")
    public void the_admin_selects_action_type_from_the_combo_box(String actionType) {
        actionTypeComboBox.setSelectedItem(actionType);
    }

    // Steps for Adding and Editing User Type
    @When("the admin enters username {string}, email {string}, password {string}, and city {string}")
    public void the_admin_enters_username_email_password_and_city(String username, String email, String password, String city) {
        userNameField.setText(username);
        emailField.setText(email);
        passwordField.setText(password);
        cityField.setText(city);
    }

    // Steps for Deleting User Type
    @When("the admin enters username {string} and email {string}")
    public void the_admin_enters_username_and_email(String username, String email) {
        userNameField.setText(username);
        emailField.setText(email);
    }

    @And("clicks on the submit button")
    public void clicks_on_the_submit_button() {
        accountsFrame.SubmitButtonActionPerformed(null);
    }

    @Then("the system shows a message {string}")
    public void the_system_shows_a_message(String expectedMessage) {
        message = accountsFrame.getMessage();
        assertEquals(expectedMessage, message);
    }
    @Given("clicks on the Back To Home button")
    public void clicks_on_the_back_to_home_button() {
    	accountsFrame.SubmitButton1ActionPerformed(null);
    	message = accountsFrame.getMessage();
    	assertEquals("Welcome To Home", message);
    }
}
