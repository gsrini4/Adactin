Feature: Login Adactin application

@SmokeTest
Scenario: User login adatin application
    Given User navigate to adactin application
    When User enters username as "SowmiyaSrini"
    And User enters password as "Sowmiya"
    Then User valid the username and password
    And User click login button