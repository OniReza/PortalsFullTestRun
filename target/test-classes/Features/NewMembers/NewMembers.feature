Feature: Test New Accounts Functionality
  Background:
    Given a valid url
    @tag1
  Scenario: Verify Topup popup
    When topup popup appears
    And user inputs topup amount
    And user click on checkbox
    And click proceed button
    And enter card details in payment information
    And user checks sucess message and press Ok
    Then user should see the Home page

    @tag2
  Scenario: Verify virtual card creation
    When user clicks on cards on side menu
    And user clicks on virtual cards tab
    And user clicks on create virtual card button
    And user selects first card
    And user selects debit card for topup for activation
    And user enters sending amount and click checkBox
    And user click on continue button
    And user checks summary and press confirm
    And enter card details in payment information
    And user enter otp and click activate button
    And user checks sucess message and press Ok
    Then user should redirect back to virtual card page


