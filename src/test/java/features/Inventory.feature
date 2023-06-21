Feature: Inventory page

  Background:
    When I input "standard_user" to username field
    And input "secret_sauce" to password field
    When I push the Login button
    Then I am on the Inventory

    @inventory-1
  Scenario: 6 inventory items are displayed
      Then inventory item quantity is 6

  @inventory-2
  Scenario: Sorting by name A-Z
    When I choose sorting option by name A-Z
    Then all items name are sorted alphabetically

  @inventory-3
  Scenario: Sorting by name Z-A
    When I choose sorting option by name Z-A
    Then all items name are sorted in reverse alphabetically order

  @inventory-4
  Scenario: Sorting bi price low to high
    When I choose sorting option by price low to high
    Then all items are sorted by price ascending

  @inventory-5
  Scenario: Sorting bi price high to low
    When I choose sorting option by price high to low
    Then all items are sorted by price descending

