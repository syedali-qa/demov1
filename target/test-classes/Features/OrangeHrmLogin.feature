Feature: To test the login functionality of orange hrm

  Scenario Outline: To test the login function of orange hrm
    Given User navigate to the orange hrm application on chrome
    When User enter the valid <id> and <pwd>
    Then User click on login should be navigated to the home page
    And User close the chrome browser

    Examples: 
      | id    | pwd      |
      | Admin | admin123 |
