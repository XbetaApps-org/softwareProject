package com.software.steps;

import static org.junit.Assert.assertEquals;

import com.software.ui.SendFeedBackFrame;
import io.cucumber.java.en.*;

public class FeedBackSteps {
    private SendFeedBackFrame frame;

    @Given("the user is on the send feedback page")
    public void the_user_is_on_the_send_feedback_page() {
        // Initialize and display the SendFeedBackFrame
        frame = new SendFeedBackFrame();
        frame.setVisible(true);
    }

    @Then("the user should see a {string} button on the send feedback page")
    public void the_user_should_see_a_button_on_the_send_feedback_page(String buttonName) {
        // Verify that the correct button is present
        if (buttonName.equals("Send")) {
            assertEquals("Send", frame.sendButton.getText());
        } else if (buttonName.equals("Back")) {
            assertEquals("Back", frame.backButton.getText());
        }
    }

    @Then("the user should see a text area to write feedback on the send feedback page")
    public void the_user_should_see_a_text_area_to_write_feedback_on_the_send_feedback_page() {
        // Check that the text area is present and editable
        assertEquals(true, frame.FeedBackArea.isVisible());
        assertEquals(true, frame.FeedBackArea.isEditable());
    }

    @When("the user writes their feedback in the text area on the send feedback page")
    public void the_user_writes_their_feedback_in_the_text_area_on_the_send_feedback_page() {
        // Simulate writing feedback
        frame.FeedBackArea.setText("This is a test feedback.");
    }

    @When("the user clicks the {string} button on the send feedback page")
    public void the_user_clicks_the_button_on_the_send_feedback_page(String buttonName) {
        // Simulate clicking the specified button
        if (buttonName.equals("Send")) {
            frame.sendButton.doClick(); // This triggers sendButtonActionPerformed
        } else if (buttonName.equals("Back")) {
            frame.backButton.doClick(); // This triggers backButtonActionPerformed
        }
    }

    @Then("they should see a message {string} on the send feedback page")
    public void they_should_see_a_message_on_the_send_feedback_page(String expectedMessage) {
        // Check the displayed message
        assertEquals(expectedMessage, frame.getMessage());
    }

    @Then("the user should be transferred to the user index page from the send feedback page")
    public void the_user_should_be_transferred_to_the_user_index_page_from_the_send_feedback_page() {
        // This method would typically check for a new frame or state change.
        // For the purpose of this example, we'll assume a message indicates the transfer
        assertEquals("you are going back", frame.getMessage());
    }
}
