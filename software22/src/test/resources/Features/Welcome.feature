Feature: Welcome Page

  Scenario: User sees the welcome page
    Given the user is on the welcome page
    Then the user should see a "Sign Up" button
    And the user should see a "Login" button

  Scenario: User navigates to the sign up page
    Given the user is on the welcome page
    Then the user clicks the "Sign Up" button
    And the user should see a "Sign Up" button

  Scenario: User navigates to the login page
    Given the user is on the welcome page
    Then the user clicks the "Login" button
    And the user should see a "Login" button
