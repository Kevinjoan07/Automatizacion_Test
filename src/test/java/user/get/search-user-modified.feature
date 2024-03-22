Feature:New customer requests


  @Test
  Scenario: Search the new user
    * call read("../put/update-user-information.feature@Test")
    Given url "https://petstore.swagger.io/v2/user/"  + userName
    When method get
    Then status 200