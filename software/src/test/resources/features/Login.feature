Feature: Login Feature

  Scenario Outline: Valid Login
    Given the user is on the login page
    And the user selects login as "<role>" from a combo box
    When the user enters username "<username>" and password "<password>"
    And clicks on the login button
    Then the user will see a message "<message>"

  Examples:
    | role         | username | password | message                      |
    | admin        | admin    | admin    | Login successful as admin    |
    | user         | user1    | pass123  | Login successful as user     |
    | store owner  | owner1   | pass123  | Login successful as store owner |
    | supplier     | supplier1| pass123  | Login successful as supplier |

  Scenario Outline: Invalid Login
    Given the user is on the login page
    And the user selects login as "<role>" from a combo box
    When the user enters username "<username>" and password "<password>"
    And clicks on the login button
    Then the user will see a message "<message>"

  Examples:
    | role         | username | password | message                      |
    | admin        | admin    | wrongpass| Invalid admin username or password |
    | user         | user1    | wrongpass| Invalid username or password |
    | store owner  | owner1   | wrongpass| Invalid username or password |
    | supplier     | supplier1| wrongpass| Invalid username or password |
