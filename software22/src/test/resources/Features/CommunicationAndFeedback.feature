Feature: Communication and Feedback

  Scenario: Send a message to a store owner
    Given I am a user
    When I send a message "Need more details about the product" to the store owner "John's Sweets"
    Then the store owner should receive the message

  Scenario: Send a message to a supplier
    Given I am a user
    When I send a message "Can you provide the latest price list?" to the supplier "Best Ingredients Co."
    Then the supplier should receive the message

  Scenario: Provide feedback on a purchased product
    Given I have purchased the product "Chocolate Cake"
    When I provide feedback "Delicious and fresh!"
    Then the feedback list for "Chocolate Cake" should contain my feedback

  Scenario: Provide feedback on a shared recipe
    Given I have tried the recipe "Vanilla Cookies"
    When I provide feedback "Simple and tasty!"
    Then the feedback list for "Vanilla Cookies" should contain my feedback
