Feature:New customer requests

  @Test
  Scenario: user update name and email
    * call read("../post/new-user.feature@Test2")
    * def var =
   """
        {
    "id": 1,
    "username": "joan",
    "firstName": "string",
    "lastName": "string",
    "email": "kjmosquera@example.com",
    "password": "string",
    "phone": "string",
    "userStatus": 2
  }
      """
    Given url "https://petstore.swagger.io/v2/user/"  + userName
    Given request var
    When method  put
    Then status 200
    And def userName = $var.username
