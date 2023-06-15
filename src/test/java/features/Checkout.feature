@checkout
  Feature: Checkout
    Background:
      When I input "standard_user" to username field
      And input "secret_sauce" to password field
      When I push the Login button
      Then I am on the Inventory

    Scenario: Success backpack purchase
      When I push Add to cart button of backpack
      Then I push on the basket icon
      And  I push Checkout button
      Then I input "Vladimir" to First Name field
      Then I input "Odessa" to Last Name field
      Then I input "33719" to ZIP/Postal Code field
      And  I push Continue button
      Then I push Finish button on the Checkout: Overview page
      And  I check text "Thank you for your order!"
      And  I check that URL contains "checkout-complete"
