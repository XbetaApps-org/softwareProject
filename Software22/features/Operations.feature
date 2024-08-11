Feature: Product Management

  Scenario Outline: Add a product
  Given the admin is on the product management page
  And the admin selects action type "Add" from the combo box
  When the admin enters product ID "<productId>", name "<productName>", price "<price>"
  And clicks on the submit button
  Then the system shows a message "<message>"

  Examples:
  | productId | productName | price | message                        |
  | 1         | Product A   | 10.00 | Product added successfully     |
  | 2         | Product B   | 20.00 | Product added successfully     |
  | 3         | Product C   | 30.00 | Product added successfully     |
  | 4         | Product A   | 10.00 | Product already exists         |
  | 5         | Product X   | -5.00 | Invalid price format           |  

  
  Scenario Outline: Update a product
    Given the admin is on the product management page
    And the admin selects action type "Update" from the combo box
    When the admin enters product ID "<productId>", new name "<newName>", and new price "<newPrice>"
    And clicks on the submit button
    Then the system shows a message "<message>"

    Examples:
      | productId | newName   | newPrice | message                           |
      | 1         | Updated A | 15.00    | Product updated successfully      |
      | 2         | Updated B | 25.00    | Product updated successfully      |
      | 3         | Updated C | 35.00    | Product updated successfully      |
      | 1         | Updated A | 15.00    | Product with ID 1 already updated |
      | 999       | New Name  | 50.00    | Product with ID 999 does not exist|
  
  Scenario Outline: Delete a product
    Given the admin is on the product management page
    And the admin selects action type "Delete" from the combo box
    When the admin enters product ID "<productId>"
    And clicks on the submit button
    Then the system shows a message "<message>"

    Examples:
      | productId | message                            |
      | 1         | Product deleted successfully       |
      | 2         | Product deleted successfully       |
      | 3         | Product deleted successfully       |
      | 999       | Product with ID 999 does not exist |
      | 1000      | Product with ID 1000 does not exist|
