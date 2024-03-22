Feature:New customer requests



  @Test
  Scenario: Search the new user updated
    * call read("../post/new-user.feature@Test2")
    Given url "https://petstore.swagger.io/v2/user/"  + userName
    When method get
    Then status 200