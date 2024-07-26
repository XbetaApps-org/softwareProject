Feature: User SignUp

  Scenario: User signs up with valid details
    Given the user is on the signup page
    When the user enters signup details "testUser", "password123", "password123", "test@example.com"
    And the user submits the signup form
    Then the user should see a confirmation message "Thank you for signing up"

  Scenario: User signs up with non-matching passwords
    Given the user is on the signup page
    When the user enters signup details "testUser", "password123", "password321", "test@example.com"
    And the user submits the signup form
    Then the user should see a confirmation message "Passwords do not match"

  Scenario: User signs up with existing username or email
    Given the user is on the signup page
    When the user enters signup details "existingUser", "password123", "password123", "existing@example.com"
    And the user submits the signup form
    Then the user should see a confirmation message "User already exists"

  Scenario: User signs up with invalid email format
    Given the user is on the signup page
    When the user enters signup details "testUser", "password123", "password123", "invalid-email"
    And the user submits the signup form
    Then the user should see a confirmation message "Invalid email format"
