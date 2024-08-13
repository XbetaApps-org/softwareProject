Feature: Monitor Sales and Profits

Scenario: Calculate total sales and profits for the day
  Given the following sales records exist:
    | ProductId | Quantity | Price per unit |
    | 001       | 10       | 2.00           |
    | 002       | 5        | 3.50           |
  When I request to view the total sales and profits
  Then the total sales should be $37.50
  And the total profit should be $15.00 (assuming a profit margin)


  Scenario: Monitor profit margins by product
    Given the following sales records exist:
      | ProductId | Quantity | Price per unit | Cost per unit |
      | 001       | 10       | 2.00           | 1.00          |
      | 002       | 5        | 3.50           | 2.00          |
    When I request to view the profit margin for each product
    Then the profit for ProductId 001 should be $10.00
    And the profit for ProductId 002 should be $7.50
