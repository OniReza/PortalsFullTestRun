Feature: Test Accounts Functionality
  Background:
    Given a valid url

  @tag1
  Scenario: Verify Details Tab Graph of USD Wallet
    When user clicks on account button
    And user clicks on first wallet
    Then user should see a graph

  @tag2
  Scenario: Verify USD Wallet to Euro Wallet Move
    When user clicks on move tab
    And user clicks on select beneficiary dropdown
    And user selects EUR wallet
    And enter amount on sending amount box
    And user clicks confirm
    And user enters secret code
    And user clicks confirm again
    And transfer successfully completed message is shown
    And user clicks on ok
    Then user should redirect to USD wallet details tab

  @tag3
  Scenario: Deposit: Verify Card Deposit to USD Account
    When user clicks on deposit
    And user expend from dropdown
    And user selects debit or credit card
    And user enters amount to load in USD
    And user clicks agreement
    And summary should appear
    And clicks confirm
    And enter card details in payment information
    And user checks confirmation message
    And user clicks ok
    Then user should redirect to accounts

  @tag4
  Scenario: Deposit: Verify Local(US Bank) Deposit to USD Account
    When user clicks on deposit
    And user expend from dropdown
    And user selects local(US Bank)
    Then user should see details of bank
  @tag5
  Scenario: Deposit: Verify Crypto Deposit to USD Account
    When user clicks on deposit
    And user expend from dropdown
    And user selects crypto deposit
    And user enters sending amount in TBTC
    And user clicks on terms and condition check box
    And user clicks confirm
    Then user should see a summary

@tag6
  Scenario:Payments: Verify Transfer to an Existing Member from USD Wallet
    When user clicks payments tab
    And user clicks on transfer to a member pay
    And user selects existing beneficiary
    And user enters sending amount in USD and payment reference
    And user checks summary of transfer amount
    And clicks confirm button
    And enter otp for transfer
    And user clicks confirm button again
    And user checks success message
    And press ok
    Then user should redirect to details

  @tag7
  Scenario: Payments: Verify Make a payment to a New Individual from USD Wallet
    When user clicks payments tab
    And clicks on make payment pay button
    And user clicks on individual
    And user clicks on new
    And user enters other recipient details for new individual
    And user enters bank details
    And user enters amount
    And user selects timing(now)
    And user enter references
    And user clicks on pay for payment
    And check request success message and press ok
    Then if payment is complete user should redirect to payments tab

  @tag8
  Scenario: Payments: Verify Make a payment to Existing Individual from USD Wallet
    And user clicks payments tab
    And clicks on make payment pay button
    And user clicks on individual
    And user clicks on existing
    And user selects existing recipient from recipient details
    And user enters amount
    And user selects timing(now)
    And user enter references
    And user clicks on pay for payment
    And check request success message and press ok
    Then if payment is complete user should redirect to payments tab

  @tag9
  Scenario: Payments: Verify Make a Payment to New Business from USD Wallet
    When user clicks payments tab
    And clicks on make payment pay button
    And user clicks on business
    And user clicks on new
    And user enters other recipient details for new business
    And user enters bank details
    And user enters amount
    And user selects timing(now)
    And user enter references
    And user clicks on pay for payment
    And check request success message and press ok
    Then if payment is complete user should redirect to payments tab

  @tag10
  Scenario: Payments: Verify Make a Payment to Existing Business from USD Wallet
    When user clicks payments tab
    And clicks on make payment pay button
    And user clicks on business
    And user clicks on existing
    And user selects existing recipient from recipient details
    And user enters amount
    And user selects timing(now)
    And user enter references
    And user clicks on pay for payment
    And check request success message and press ok
    Then if payment is complete user should redirect to payments tab

  @tag11
  Scenario: Verify Transaction Tab of USD Wallet
    When user is in transaction tab
    And user should see latest pending transactions first(if any) in PENDING TRANSACTIONS
    Then user after scroll down should see latest cleared transaction first in YOUR TRANSACTIONS
  @tag12
  Scenario: Verify Statement Tab of USD Wallet
    When user is in statements tab
    And if any statement available user clicks on download button
    Then statement should be downloaded

#++++++++++++++++++++++++++++++++++++++++++++++++PLCU++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
#  @tagplc12
#  Scenario:  Verify Withdraw Tab of USD Wallet(New personal Account)
#    When user is in withdraw tab
#    And user add personal account
#    And user selects destination bank country and currency
#    And press next button
#    And user input withdraw beneficiary details and press next
#    And input sending amount in usd
#    And summary should appear
#    And click on expedite fee and outbound transfer agreement
#    And expedite fee should add in summary
#    And clicks confirm button
#    And enter otp for transfer
#    And user clicks confirm button again
#    And user checks success message
#    And press ok
#    Then user should redirect to details
#
#  @tagplc13
#  Scenario:  Verify Withdraw Tab of USD Wallet(Existing Personal Account)
#    When user is in withdraw tab
#    And user clicks on select beneficiary dropdown
#    And user selects beneficiary
#    And input sending amount in usd
#    And summary should appear
#    And click on expedite fee and outbound transfer agreement
#    And expedite fee should add in summary
#    And clicks confirm button
#    And enter otp for transfer
#    And user clicks confirm button again
#    And user checks success message
#    And press ok
#    Then user should redirect to details
#
#  @tagplc14
#  Scenario:  Verify Pay Tab of USD Wallet(Pay New Friends or Family)
#    When user is in pay tab
#    And user clicks pay button of friends or family
#    And user clicks on pay someone new
#    And user selects destination bank country and currency
#    And press next button
#    And user input pay(individual) beneficiary details and press next
#    And input sending amount in usd
#    And input payment reference and reason
#    And click on expedite fee and outbound transfer agreement
#    And expedite fee should add in summary
#    And summary should appear
#    And clicks confirm button
#    And enter otp for transfer
#    And user clicks confirm button again
#    And user checks success message
#    And press ok
#    Then user should redirect to details
#
#  @tagplc15
#  Scenario:  Verify Pay Tab of USD Wallet(Existing Friends or Family)
#    When user is in pay tab
#    And user clicks pay button of friends or family
#    And user clicks on select beneficiary dropdown
#    And user selects beneficiary
#    And input sending amount in usd
#    And input payment reference and reason
#    And click on expedite fee and outbound transfer agreement
#    And expedite fee should add in summary
#    And summary should appear
#    And clicks confirm button
#    And enter otp for transfer
#    And user clicks confirm button again
#    And user checks success message
#    And press ok
#    Then user should redirect to details
#
#  @tagplc16
#  Scenario:  Verify Pay Tab of USD Wallet(Pay New Business or Invoice)
#    When user is in pay tab
#    And user clicks pay button a business or invoice
#    And user clicks on pay to new business button
#    And user selects destination bank country and currency
#    And press next button
#    And user input business beneficiary details and press next
#    And input sending amount in usd
#    And input payment reference and reason
#    And click on expedite fee and outbound transfer agreement
#    And expedite fee should add in summary
#    And summary should appear
#    And clicks confirm button
#    And enter otp for transfer
#    And user clicks confirm button again
#    And user checks success message
#    And press ok
#    Then user should redirect to details
#
#  @tagplc17
#  Scenario: Verify Pay tab of USD Wallet(Existing Business or Invoice)
#    When user is in pay tab
#    And user clicks pay button a business or invoice
#    And user clicks on select beneficiary dropdown
#    And user selects beneficiary
#    And input sending amount in usd
#    And input payment reference and reason
#    And click on expedite fee and outbound transfer agreement
#    And expedite fee should add in summary
#    And summary should appear
#    And clicks confirm button
#    And enter otp for transfer
#    And user clicks confirm button again
#    And user checks success message
#    And press ok
#    Then user should redirect to details
#
#  @tagplc18
#  Scenario: Verify Pay Tab of USD Wallet(Existing Member)
#    When user is in pay tab
#    And user clicks pay button of another member
#    And user clicks on select beneficiary dropdown
#    And user selects beneficiary
#    And input sending amount in usd
#    And input payment reference
#    And summary should appear
#    And clicks confirm button
#    And enter otp for transfer
#    And user clicks confirm button again
#    And user checks success message
#    And press ok
#    Then user should redirect to details










