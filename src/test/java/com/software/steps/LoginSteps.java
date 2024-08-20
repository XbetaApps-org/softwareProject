import static org.junit.Assert.assertEquals;

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
        loginFrame.setVisible(true);  // Make sure the frame is visible
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
        // Simulate the user clicking the login button
        loginFrame.getLoginButton().doClick();
    }

    @Then("the user will see a message {string}")
    public void the_user_will_see_a_message(String expectedMessage) {
        // This step may need to wait a moment for the GUI thread to process
        try {
            Thread.sleep(500); // Adjust as necessary for your environment
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        message = loginFrame.getDisplayedMessage();
        assertEquals(expectedMessage, message);
    }
}
