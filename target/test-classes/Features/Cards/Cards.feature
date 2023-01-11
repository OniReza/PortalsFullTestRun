Feature: Test functionality of Card page
  Background:
    Given a valid url

  @common
  Scenario: Verify Load Functionality of Physical Card
    When user clicks on cards on side menu
    And user clicks on physical card
    And user clicks on load tab
    And user enters amount to load
    And user checks overview
    And user clicks confirm button
    And user provides otp and clicks confirm button again
    And user checks success message and press ok button
    Then user should redirect back to physical card page

  @common
  Scenario: Verify Unload Functionality of Physical Card
    When user clicks on cards on side menu
    And user clicks on physical card
    And user clicks on unload tab
    And user enters amount to unload
    And user checks overview
    And user clicks confirm button
    And user provides otp and clicks confirm button again
    And user checks success message and press ok button
    Then user should redirect back to physical card page

    #Topup only for clubswan
  @topup
  Scenario: Verify Topup Functionality of Physical Card
    When user clicks on cards on side menu
    And user clicks on physical card
    And user clicks on topup tab
    And user selects amount to topup
    And clicks on topup button
    And user checks summary
    And user clicks confirm button for topup
    And enter card details in Stripe and clicks on pay
    And user checks confirmation message and clicks ok
    Then user should redirect back to physical card page

  @common
  Scenario: Verify Pin Functionality of Physical Card
    When user clicks on cards on side menu
    And user clicks on physical card
    And user clicks on pin tab
    And user inputs password
    And user clicks on submit
    Then card pin should appear

  @common
  Scenario: Verify Digital Card Functionality of Physical Card
    When user clicks on cards on side menu
    And user clicks on physical card
    And user clicks on digital card tab
    And user inputs otp
    And user clicks on show card details button
    Then card details should appear

  @common
  Scenario: Verify Statement Tab of Physical Card
    When user clicks on cards on side menu
    And user clicks on physical card
    And user clicks on statements Tab
    And user clicks on download button if any statement available
    Then a statement will be downloaded

  @common
  Scenario: Verify Transaction Tab of Physical Card
    When user clicks on cards on side menu
    And user clicks on physical card
    When user clicks on transaction tab
    And latest transactions should appear in  your transactions section
    Then user should be able to export transactions as pdf and csv

  @common
  Scenario: Verify Load Functionality of Virtual Card
    When clicks on virtual card tab from card page
    And user clicks on first virtual card
    And user clicks on load tab
    And user enters amount to load
    And user checks overview
    And user clicks confirm button
    And user provides otp and clicks confirm button again
    And user checks success message and press ok button
    Then user should redirect back to physical card page

  @common
  Scenario: Verify UnLoad Functionality of Virtual Card
    When clicks on virtual card tab from card page
    And user clicks on first virtual card
    When user clicks on unload tab
    And user enters amount to unload
    And user checks overview
    And user clicks confirm button
    And user provides otp and clicks confirm button again
    And user checks success message and press ok button
    Then user should redirect back to physical card page

  @topup
  Scenario: Verify Topup Functionality of Virtual Card
    When clicks on virtual card tab from card page
    And user clicks on first virtual card
    And user clicks on topup tab
    And user selects amount to topup
    And clicks on topup button
    And user checks summary
    And user clicks confirm button for topup
    And enter card details in Stripe and clicks on pay
    And user checks confirmation message and clicks ok
    Then user should redirect back to virtual card page

  @common
  Scenario: Verify Pin Functionality of Virtual Card
    When clicks on virtual card tab from card page
    And user clicks on first virtual card
    And user clicks on pin tab
    And user inputs password
    And user clicks on submit
    Then card pin should appear

  @common
  Scenario: Verify Digital Card Functionality of  Virtual Card
    When clicks on virtual card tab from card page
    And user clicks on first virtual card
    And user clicks on digital card tab
    And user inputs otp
    And user clicks on show card details button
    Then card details should appear

  @common
  Scenario: Verify Transaction Tab of Virtual Card
    When clicks on virtual card tab from card page
    And user clicks on first virtual card
    And user clicks on transaction tab
    And latest transactions should appear in  your transactions section
    Then user should be able to export transactions as pdf and csv

  @common
  Scenario: Verify Statement Tab of Virtual Card
    When clicks on virtual card tab from card page
    And user clicks on first virtual card
    And user clicks on statements Tab
    And user clicks on download button if any statement available
    Then a statement will be downloaded
