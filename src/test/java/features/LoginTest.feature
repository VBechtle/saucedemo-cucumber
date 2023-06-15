@login
Feature: Login

  #Background:
   # Given I open the page Login

  @login-1
  Scenario: Success login
    When I input "standard_user" to username field
    And input "secret_sauce" to password field
    When I push the Login button
    Then I am on the Inventory


  @login-2
  Scenario Outline: Login with invalid user
    When I input "<username>" to username field
    And input "<password>" to password field
    When I push the Login button
    Then error with text "<errorMessageText>" is displayed
    Examples:
      |username       |password     |errorMessageText                                             |
      |standard_user  |ghdsdgsg     |Username and password do not match any user in this service  |
      |locked_out_user|secret_sauce |Sorry, this user has been locked out.                        |


  @login-3
  Scenario Outline: Login with empty fields
    When I input "<username>" to username field
    And input "<password>" to password field
    When I push the Login button
    Then error with text "<errorMessageText>" is displayed
    Examples:
      |username  |password  |errorMessageText     |
      |          |sdfdsfds  |Username is required |
      |csgdcgd   |          |Password is required |

    @login-4
    Scenario: Success logout
      When I input "standard_user" to username field
      And input "secret_sauce" to password field
      When I push the Login button
      Then I am on the Inventory
      And I click on burger menu
      When I follow the Logout link
      Then I am on the page Login


