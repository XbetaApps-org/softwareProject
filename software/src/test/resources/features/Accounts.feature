Feature: Accounts Management

  Scenario Outline: Add userType
    Given the admin is on the accounts management page
    And the admin selects user type "<userType>" from the combo box
    And the admin selects action type "Add" from the combo box
    When the admin enters username "<username>", email "<email>", password "<password>", and city "<city>"
    And clicks on the submit button
    Then the system shows a message "<message>"

    Examples:
      | userType     | username | email              | password | city     | message                     |
      | User         | user1    | user1@example.com  | pass123  | City1    | User added successfully     |
      | Store owner  | owner1   | owner1@example.com | pass123  | City2    | Store owner added successfully     |
      | Supplier     | supplier1| supplier1@example.com | pass123 | City3    | Supplier added successfully     |
      | User         | user1    | user1@example.com  | pass123  | City1    | User already exists         |
      | Store owner  | owner1   | owner1@example.com | pass123  | City2    | Store owner already exists         |
      | Supplier     | supplier1| supplier1@example.com | pass123 | City3    | Supplier already exists         |
      | User         | user2    | invalid-email      | pass123  | City1    | Invalid email format        |

  Scenario Outline: Edit userType
    Given the admin is on the accounts management page
    And the admin selects user type "<userType>" from the combo box
    And the admin selects action type "Edit" from the combo box
    When the admin enters username "<username>", email "<email>", password "<password>", and city "<city>"
    And clicks on the submit button
    Then the system shows a message "<message>"

    Examples:
      | userType     | username  | email              | password | city     | message                     |
      | User         | user1     | user1@example.com  | newpass  | NewCity1 | User edited successfully    |
      | Store owner  | owner1    | owner1@example.com | newpass  | NewCity2 | Store owner edited successfully    |
      | Supplier     | supplier1 | supplier1@example.com | newpass | NewCity3 | Supplier edited successfully    |
      | User         | nonuser   | nonuser@example.com| pass123  | City1    | User that you want to edit is not exist |
      | Store owner  | nonowner  | nonowner@example.com| pass123 | City2    | Store owner that you want to edit is not exist |
      | Supplier     | nonsupplier| nonsupplier@example.com| pass123| City3 | Supplier that you want to edit is not exist |

  Scenario Outline: Delete usertype
    Given the admin is on the accounts management page
    And the admin selects user type "<userType>" from the combo box
    And the admin selects action type "Delete" from the combo box
    When the admin enters username "<username>" and email "<email>"
    And clicks on the submit button
    Then the system shows a message "<message>"

    Examples:
      | userType     | username  | email              | message                     |
      | User         | user1     | user1@example.com  | User deleted successfully   |
      | Store owner  | owner1    | owner1@example.com | Store owner deleted successfully   |
      | Supplier     | supplier1 | supplier1@example.com | Supplier deleted successfully |
      | User         | nonuser   | nonuser@example.com| User that you want to delete is not exist |
      | Store owner  | nonowner  | nonowner@example.com| Store owner that you want to delete is not exist |
      | Supplier     | nonsupplier| nonsupplier@example.com| Supplier that you want to delete is not exist |
      Scenario: GoBack
      Given the admin is on the accounts management page
      And clicks on the Back To Home button
      Then the system shows a message "Welcome To Home"
