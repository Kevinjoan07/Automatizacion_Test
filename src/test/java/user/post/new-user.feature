Feature:New customer requests

  Background:
    * url "https://petstore.swagger.io/v2/user/"


  @Test1
  Scenario: login
    * path  "/login"
    * def query = {"password": "12384", "username" : "Joan"}
    Given request
    And params query
    When method get
    Then status 200


  @Test2
  Scenario: Create new user
    * def var =
      """
      {
    "id": 4,
    "username": "kevin",
    "firstName": "string",
    "lastName": "string",
    "email": "string",
    "password": "string",
    "phone": "string",
    "userStatus": 2
  }
      """

    Given request var
    When method  post
    Then status 200
    And def userName = $var.username