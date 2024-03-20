Feature: buy items in the store web saucedemo


  Scenario Outline: buy two items in the store
    Given that the user is on the store's page
    When login
      | user   | password   |
      | <user> | <password> |
    And purchase two items
      | firstName   | lastName   | zipCode   |
      | <firstName> | <lastName> | <zipCode> |
    Then you can see the <text>

    Examples:
      | user          | password     | firstName | lastName | zipCode | text                        |
      | standard_user | secret_sauce | Kevin     | Mosquera | 12334   | "Thank you for your order!" |
