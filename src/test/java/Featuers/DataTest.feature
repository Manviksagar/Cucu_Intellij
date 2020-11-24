Feature: Testing login feature

  Scenario: Login as a authenticated user with valid username and Password
    Given user is with valid credentials
    And user navigates to google Page
    When user Checks with username and Password
      | username	              | Password |
      | blog.cucumber@gmail.com | Cucumber@blog |
      | allu.cucumber@gmail.com | Cucumber@blog |
    Then 	success message is dis

  Scenario: Login as a authenticated user with valid username and Password
    Given user is with valid credentials
    And user navigates to google Page
    When user goto url
    |url |
    |google.com |

    Then 	success message is dis



