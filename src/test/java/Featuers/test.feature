Feature: Testing login feature

  Scenario: Login gmail page
    Given user login with valid credentials
    When login with username and password
    And click on submit
    Then user login to home page


  Scenario: Login gmail page with invalid
    Given user login with valid credentials in valid
    When login with username and password
    And click on submit
    Then user login to home page



  Scenario Outline: Login as a authenticated user with valid username and Password
    Given user is on LandingPage
    When 	user navigates to LandingPage Page
    And 	user enters <username> and <Password>
    Then 	success message is populated


    Examples:
      | username	              | Password	    |
      | blog.cucumber@gmail.com | Cucumber@blog |
      | allu.cucumber@gmail.com | Cucumber@blog |
