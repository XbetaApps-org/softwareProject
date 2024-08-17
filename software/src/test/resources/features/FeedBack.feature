Feature: Send Feedback

  Scenario: User sees the send feedback page components
    Given the user is on the send feedback page
    Then the user should see a "Send" button on the send feedback page
    And the user should see a "Back" button on the send feedback page
    And the user should see a text area to write feedback on the send feedback page

  Scenario: User writes and sends feedback
    Given the user is on the send feedback page
    When the user writes their feedback in the text area on the send feedback page
    And the user clicks the "Send" button on the send feedback page
    Then they should see a message "your feedback is sent successfully" on the send feedback page

  Scenario: User navigates back to the user index page
    Given the user is on the send feedback page
    When the user clicks the "Back" button on the send feedback page
    Then the user should be transferred to the user index page from the send feedback page
