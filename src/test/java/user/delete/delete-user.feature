Feature:New customer requests


  @Test
  Scenario: delete  new user
    * call read("../put/update-user-information.feature@Test")
    Given url "https://petstore.swagger.io/v2/user/"  + userName
    When method delete
    Then status 200
