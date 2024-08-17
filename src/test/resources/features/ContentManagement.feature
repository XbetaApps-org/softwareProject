Feature: Content Management

  Scenario: Add a new recipe
    Given I have an empty list of recipes
    When I add a recipe with title "Chocolate Cake", ingredients "Flour, Sugar, Cocoa", and instructions "Mix and bake"
    Then the recipe list should contain 1 recipe

  Scenario: Update an existing recipe
    Given I have a list with a recipe titled "Chocolate Cake"
    When I update the recipe title to "Vanilla Cake"
    Then the recipe list should contain a recipe titled "Vanilla Cake"

  Scenario: Delete a recipe
    Given I have a list with a recipe titled "Chocolate Cake"
    When I delete the recipe with title "Chocolate Cake"
    Then the recipe list should be empty
