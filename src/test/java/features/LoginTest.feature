Feature: Login

  @login-1
  Scenario: Success login
    Given I am on the page Login
    When I input "standard_user" to username field
    And input "secret_sauce" to password field
    When I push the Login button
    Then I am on the Inventory

    """
  @login-2
  Scenario: Login with invalid data
    Given I am on the page Login
    When I input "standard_user" to username field
    And input "ghdsdgsg" to password field
    When I push the Login button
    Then error with text "Username and password do not match any user in this service" is displayed

  @login-3
  Scenario: Login with locked out user
    Given I am on the page Login
    When I input "locked_out_user" to username field
    And input "secret_sauce" to password field
    When I push the Login button
    Then error with text "Sorry, this user has been locked out." is displayed
    """

  @login-4
  Scenario Outline: Login with invalid user
    Given I am on the page Login
    When I input "<username>" to username field
    And input "<password>" to password field
    When I push the Login button
    Then error with text "<errorMessageText>" is displayed
    Examples:
      |username       |password     |errorMessageText                                             |
      |standard_user  |ghdsdgsg     |Username and password do not match any user in this service  |
      |locked_out_user|secret_sauce |Sorry, this user has been locked out.                        |

    """
  @login-5
  Scenario: Login with empty username
    Given I am on the page Login
    When I input "" to username field
    And input "<password>" to password field
    When I push the Login button
    Then error with text "Username is required" is displayed

  @login-6
  Scenario: Login with empty password
    Given I am on the page Login
    When I input "<username>" to username field
    And input "" to password field
    When I push the Login button
    Then error with text "Password is required" is displayed
  """
  @login-7
  Scenario Outline: Login with empty fields
    Given I am on the page Login
    When I input "<username>" to username field
    And input "<password>" to password field
    When I push the Login button
    Then error with text "<errorMessageText>" is displayed
    Examples:
      |username  |password  |errorMessageText     |
      |          |sdfdsfds  |Username is required |
      |csgdcgd   |          |Password is required |
