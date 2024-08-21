Feature: To test the logout functionality of orangehrm

  Scenario Outline: To test the logout functionality
    Given user navigate to orange hrm application
    When User enter valid <username> and <password> and click on login
    Then User should be navigated to the home page
    And User click on the admin module
    And User click on the logout button
    Then User should be able to logout of the application

    Examples: 
      | username | password |
      | Admin    | admin123 |
      |Admin|admin234|
