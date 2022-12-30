Feature: Test Signup Functionality for US Members
  Background:
    Given A valid url for desired portal

@starterlite
  Scenario: Test Signup Functionality for Starter Lite plan for US Members
    When user inputs email
    And Clicks Continue
    And user inputs personal details
    And Clicks Continue
    And Subscription page will appear
    And user selects Starter Lite plan
    And user selects payment method card
    And enter card details in payment information
    And checks payment confirmation message
    Then user press OK

  @starter
  Scenario: Test Signup Functionality for Starter plan for US Members
    When user selects Starter plan
    And user checks card design
    And Clicks Continue again
    And user selects payment method card
    And enter card details in payment information
    And checks payment confirmation message
    Then user press OK

@premier
  Scenario: Test Signup Functionality for Premier plan for US Members
    When user selects Premier plan
    And user checks card design
    And Clicks Continue again
    And user selects payment method card
    And enter card details in payment information
    And checks payment confirmation message
    Then user press OK

@vip
  Scenario: Test Signup Functionality for VIP plan for US Members
    When user selects VIP plan
    And user checks card design
    And Clicks Continue again
    And user selects payment method card
    And enter card details in payment information
    And checks payment confirmation message
    Then user press OK

@chairman
  Scenario: Test Signup Functionality for Chairman plan for US Members
    When user selects Chairman plan
    And user checks card design
    And Clicks Continue again
    And user selects payment method card
    And enter card details in payment information
    And checks payment confirmation message
    Then user press OK





