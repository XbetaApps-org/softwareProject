Feature: Exploration and Purchase

  Scenario: Browse and search for dessert recipes
    Given I have a list of dessert recipes
    When I search for recipes containing "Chocolate"
    Then I should see recipes with "Chocolate" in the title

  Scenario: Filter recipes based on dietary needs or food allergies
    Given I have a list of dessert recipes with dietary information
    When I filter recipes for "Gluten-Free"
    Then I should see only "Gluten-Free" recipes

  Scenario: Purchase a dessert directly from a store owner
    Given I am viewing a dessert "Chocolate Cake"
    When I purchase the dessert from the store owner "John's Sweets"
    Then I should receive a confirmation of the purchase
