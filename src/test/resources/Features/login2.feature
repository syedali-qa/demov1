Feature: To test the login functionality

@smoketest 
  Scenario: Check login is successfull with valid credentials
    Given user is on the login page
    When User enters valid id and pwd
    And Clicks on login button
    Then User is navigated to the home page

  #Scenario Outline: Check login is successfull with invalid credentials
    #Given user is on the login page
    #When User enters valid <id> and <pwd>
    #And Clicks on login button
    #Then User is navigated to the home page
#
    #Examples: 
      #| id    | pwd      |
      #| Admin | admin123 |
