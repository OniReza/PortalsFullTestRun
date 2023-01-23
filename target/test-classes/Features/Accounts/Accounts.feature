Feature: Test Accounts Functionality
  Background:
    Given a valid url

  @USD_us @Deposit_us
  Scenario: Deposit: Verify Card Deposit to USD Wallet via Stripe
    When user clicks on USD wallet
    And user clicks on deposit
    And user expend from dropdown
    And user selects debit or credit card
    And user enters amount to load in USD
    And user clicks agreement
    And summary should appear
    And clicks confirm
    And enter card details in Stripe and clicks on pay
    And user checks confirmation message and press ok
    Then user should redirect to accounts

  @USD_non_us @Deposit_non_us
  Scenario: Deposit: Verify Card Deposit to USD Wallet via Apexx
    When user clicks on USD wallet
    And user clicks on deposit
    And user expend from dropdown
    And user selects debit or credit card
    And user enters amount to load in USD
    And user clicks agreement
    And summary should appear
    And clicks confirm
    And enter card details in Apexx and clicks on pay
    And user checks confirmation message and press ok
    Then user should redirect to accounts

  @USD_common @USD_move @move
  Scenario: Verify USD Wallet to JPY Wallet Move
    When user clicks on USD wallet
    And user clicks on move tab
    And user clicks on select beneficiary dropdown
    And user selects JPY wallet
    And enter amount on sending amount box
    And user clicks confirm
    And user enters secret code
    And user clicks confirm again
    And transfer successfully completed message is shown
    And user clicks on ok
    Then user should redirect to wallet details tab


  @USD_us @us_bank
  Scenario: Deposit: Verify Local(US Bank) Deposit to USD Wallet
    When user clicks on USD wallet
    And user clicks on deposit
    And user expend from dropdown
    And user selects local(US Bank)
    Then user should see details of bank

  @USD_non_us
  Scenario: Deposit: Verify Local(UK Bank) Deposit to USD Wallet
    When user clicks on USD wallet
    And user clicks on deposit
    And user expend from dropdown
    And user selects local(UK Bank)
    Then user should see details of bank

  @USD_non_us
  Scenario: Deposit: Verify International (non UK Bank) Deposit to USD Wallet
    When user clicks on USD wallet
    And user clicks on deposit
    And user expend from dropdown
    And user selects International(non UK Bank)
    Then user should see details of bank

  @USD_common
  Scenario: Deposit: Verify Crypto Deposit to USD Wallet
    When user clicks on USD wallet
    When user clicks on deposit
    And user expend from dropdown
    And user selects crypto deposit
    And user enters sending amount in TBTC
    And user clicks on terms and condition check box
    And user clicks confirm
    Then user should see a summary

  @USD_common
  Scenario:Payments: Verify Transfer to an Existing Member from USD Wallet
    When user clicks on USD wallet
    And user clicks payments tab
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

  @USD_common @pay
  Scenario: Payments: Verify Make a payment to a New Individual from USD Wallet
    When user clicks on USD wallet
    And user clicks payments tab
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

  @USD_common
  Scenario: Payments: Verify Make a payment to Existing Individual from USD Wallet
    When user clicks on USD wallet
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

  @USD_common
  Scenario: Payments: Verify Make a Payment to New Business from USD Wallet
    When user clicks on USD wallet
    And user clicks payments tab
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

  @USD_common
  Scenario: Payments: Verify Make a Payment to Existing Business from USD Wallet
    When user clicks on USD wallet
    And user clicks payments tab
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

  @USD_common
  Scenario: Verify Details Tab Graph of USD Wallet
    When user clicks on USD wallet
    Then user should see a graph

  @USD_common
  Scenario: Verify Transaction Tab of USD Wallet
    When user clicks on USD wallet
    And user click on transaction tab
    And user should see latest pending transactions first(if any) in PENDING TRANSACTIONS
    Then user after scroll down should see latest cleared transaction first in YOUR TRANSACTIONS
  @USD_common
  Scenario: Verify Statement Tab of USD Wallet
    When user clicks on USD wallet
    And user clicks on statements tab
    And if any statement available user clicks on download button
    Then statement should be downloaded

#+++++++++++++++++++++++++++++++++++++++++++++++++++++++EUR wallet++++++++++++++++++++++++++++++++++++++++++++++++++++++
  @EURO_us @Deposit_us
  Scenario: Deposit: Verify Card Deposit to Euro Wallet via Stripe
    When user clicks on EURO wallet
    And user clicks on deposit
    And user expend from dropdown
    And user selects debit or credit card
    And user enters amount to load in USD
    And user clicks agreement
    And summary should appear
    And clicks confirm
    And enter card details in Stripe and clicks on pay
    And user checks confirmation message and press ok
    Then user should redirect to accounts

  @EURO_non_us @Deposit_non_us
  Scenario: Deposit: Verify Card Deposit to Euro Wallet via Apexx
    When user clicks on EURO wallet
    And user clicks on deposit
    And user expend from dropdown
    And user selects debit or credit card
    And user enters amount to load in USD
    And user clicks agreement
    And summary should appear
    And clicks confirm
    And enter card details in Apexx and clicks on pay
    And user checks confirmation message and press ok
    Then user should redirect to accounts

  @EURO_common @EURO_move @move
  Scenario: Verify Euro Wallet to CNY Wallet Move
    When user clicks on EURO wallet
    And user clicks on move tab
    And user clicks on select beneficiary dropdown
    And user selects CNY wallet
    And enter amount on sending amount box
    And user clicks confirm
    And user enters secret code
    And user clicks confirm again
    And transfer successfully completed message is shown
    And user clicks on ok
    Then user should redirect to wallet details tab

  @EURO_us @us_bank
  Scenario: Deposit: Verify Local(US Bank) Deposit to Euro Wallet
    When user clicks on EURO wallet
    And user clicks on deposit
    And user expend from dropdown
    And user selects local(US Bank)
    Then user should see details of bank


  @EURO_non_us
  Scenario: Deposit: Verify Local(UK Bank) Deposit to Euro Wallet
    When user clicks on EURO wallet
    And user clicks on deposit
    And user expend from dropdown
    And user selects local(UK Bank)
    Then user should see details of bank

  @EURO_non_us
  Scenario: Deposit: Verify International (non UK Bank) Deposit to Euro Wallet
    When user clicks on EURO wallet
    And user clicks on deposit
    And user expend from dropdown
    And user selects International(non UK Bank)
    Then user should see details of bank


  @EURO_common @Euro_crypto @crypto
  Scenario: Deposit: Verify Crypto Deposit to Euro Wallet
    When user clicks on EURO wallet
    When user clicks on deposit
    And user expend from dropdown
    And user selects crypto deposit
    And user enters sending amount in TBTC
    And user clicks on terms and condition check box
    And user clicks confirm
    Then user should see a summary

  @EURO_common
  Scenario:Payments: Verify Transfer to an Existing Member from Euro Wallet
    When user clicks on EURO wallet
    And user clicks payments tab
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

  @EURO_common
  Scenario: Payments: Verify Make a payment to a New Individual from Euro Wallet
    When user clicks on EURO wallet
    And user clicks payments tab
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

  @EURO_common
  Scenario: Payments: Verify Make a payment to Existing Individual from Euro Wallet
    When user clicks on EURO wallet
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

  @EURO_common
  Scenario: Payments: Verify Make a Payment to New Business from Euro Wallet
    When user clicks on EURO wallet
    And user clicks payments tab
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

  @EURO_common
  Scenario: Payments: Verify Make a Payment to Existing Business from Euro Wallet
    When user clicks on EURO wallet
    And user clicks payments tab
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

  @EURO_common
  Scenario: Verify Details Tab Graph of Euro Wallet
    When user clicks on EURO wallet
    Then user should see a graph

  @EURO_common
  Scenario: Verify Transaction Tab of Euro Wallet
    When user clicks on EURO wallet
    And user click on transaction tab
    And user should see latest pending transactions first(if any) in PENDING TRANSACTIONS
    Then user after scroll down should see latest cleared transaction first in YOUR TRANSACTIONS
  @EURO_common
  Scenario: Verify Statement Tab of Euro Wallet
    When user clicks on EURO wallet
    And user clicks on statements tab
    And if any statement available user clicks on download button
    Then statement should be downloaded

#+++++++++++++++++++++++++++++++++++++++++++GBP wallet feature++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
  @GBP_us @Deposit_us
  Scenario: Deposit: Verify Card Deposit to GBP Wallet via Stripe
    When user clicks on GBP wallet
    And user clicks on deposit
    And user expend from dropdown
    And user selects debit or credit card
    And user enters amount to load in USD
    And user clicks agreement
    And summary should appear
    And clicks confirm
    And enter card details in Stripe and clicks on pay
    And user checks confirmation message and press ok
    Then user should redirect to accounts

  @GBP_non_us @Deposit_non_us
  Scenario: Deposit: Verify Card Deposit to GBP Wallet via Apexx
    When user clicks on GBP wallet
    And user clicks on deposit
    And user expend from dropdown
    And user selects debit or credit card
    And user enters amount to load in USD
    And user clicks agreement
    And summary should appear
    And clicks confirm
    And enter card details in Apexx and clicks on pay
    And user checks confirmation message and press ok
    Then user should redirect to accounts

  @GBP_common @GBP_move @move
  Scenario: Verify GBP Wallet to USD Wallet Move
    When user clicks on GBP wallet
    And user clicks on move tab
    And user clicks on select beneficiary dropdown
    And user selects USD wallet
    And enter amount on sending amount box
    And user clicks confirm
    And user enters secret code
    And user clicks confirm again
    And transfer successfully completed message is shown
    And user clicks on ok
    Then user should redirect to wallet details tab

  @GBP_us @us_bank
  Scenario: Deposit: Verify Local(US Bank) Deposit to GBP Wallet
    When user clicks on GBP wallet
    And user clicks on deposit
    And user expend from dropdown
    And user selects local(US Bank)
    Then user should see details of bank


  @GBP_non_us @TestGBP
  Scenario: Deposit: Verify Local(UK Bank) Deposit to GBP Wallet
    When user clicks on GBP wallet
    And user clicks on deposit
    And user expend from dropdown
    And user selects local(UK Bank)
    Then user should see details of bank

  @GBP_non_us
  Scenario: Deposit: Verify International (non UK Bank) Deposit to GBP Wallet
    When user clicks on GBP wallet
    And user clicks on deposit
    And user expend from dropdown
    And user selects International(non UK Bank)
    Then user should see details of bank

  @GBP_common
  Scenario: Deposit: Verify Crypto Deposit to GBP Wallet
    When user clicks on GBP wallet
    When user clicks on deposit
    And user expend from dropdown
    And user selects crypto deposit
    And user enters sending amount in TBTC
    And user clicks on terms and condition check box
    And user clicks confirm
    Then user should see a summary

  @GBP_common
  Scenario:Payments: Verify Transfer to an Existing Member from GBP Wallet
    When user clicks on GBP wallet
    And user clicks payments tab
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

  @GBP_common
  Scenario: Payments: Verify Make a payment to a New Individual from GBP Wallet
    When user clicks on GBP wallet
    And user clicks payments tab
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

  @GBP_common
  Scenario: Payments: Verify Make a payment to Existing Individual from GBP Wallet
    When user clicks on GBP wallet
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

  @GBP_common
  Scenario: Payments: Verify Make a Payment to New Business from GBP Wallet
    When user clicks on GBP wallet
    And user clicks payments tab
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

  @GBP_common
  Scenario: Payments: Verify Make a Payment to Existing Business from GBP Wallet
    When user clicks on GBP wallet
    And user clicks payments tab
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

  @GBP_common
  Scenario: Verify Details Tab Graph of GBP Wallet
    When user clicks on GBP wallet
    Then user should see a graph

  @GBP_common
  Scenario: Verify Transaction Tab of GBP Wallet
    When user clicks on GBP wallet
    And user click on transaction tab
    And user should see latest pending transactions first(if any) in PENDING TRANSACTIONS
    Then user after scroll down should see latest cleared transaction first in YOUR TRANSACTIONS
  @GBP_common
  Scenario: Verify Statement Tab of GBP Wallet
    When user clicks on GBP wallet
    And user clicks on statements tab
    And if any statement available user clicks on download button
    Then statement should be downloaded

#+++++++++++++++++++++++++++++++++++++++++++JPY wallet feature++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
  @JPY_us @Deposit_us
  Scenario: Deposit: Verify Card Deposit to JPY Wallet via Stripe
    When user clicks on JPY wallet
    And user clicks on deposit
    And user expend from dropdown
    And user selects debit or credit card
    And user enters amount to load in USD
    And user clicks agreement
    And summary should appear
    And clicks confirm
    And enter card details in Stripe and clicks on pay
    And user checks confirmation message and press ok
    Then user should redirect to accounts

  @JPY_common @JPY_move @move
  Scenario: Verify JPY Wallet to USD Wallet Move
    When user clicks on JPY wallet
    And user clicks on move tab
    And user clicks on select beneficiary dropdown
    And user selects USD wallet
    And enter amount on sending amount box
    And user clicks confirm
    And user enters secret code
    And user clicks confirm again
    And transfer successfully completed message is shown
    And user clicks on ok
    Then user should redirect to wallet details tab

  @JPY_us @us_bank
  Scenario: Deposit: Verify Local(US Bank) Deposit to JPY Wallet
    When user clicks on JPY wallet
    And user clicks on deposit
    And user expend from dropdown
    And user selects local(US Bank)
    Then user should see details of bank

  @JPY_non_us
  Scenario: Deposit: Verify Local(UK Bank) Deposit to JPY Wallet
    When user clicks on JPY wallet
    And user clicks on deposit
    And user expend from dropdown
    And user selects local(UK Bank)
    Then user should see details of bank

  @JPY_non_us
  Scenario: Deposit: Verify International (non UK Bank) Deposit to JPY Wallet
    When user clicks on JPY wallet
    And user clicks on deposit
    And user expend from dropdown
    And user selects International(non UK Bank)
    Then user should see details of bank

  @JPY_common
  Scenario: Deposit: Verify Crypto Deposit to JPY Wallet
    When user clicks on JPY wallet
    When user clicks on deposit
    And user expend from dropdown
    And user selects crypto deposit
    And user enters sending amount in TBTC
    And user clicks on terms and condition check box
    And user clicks confirm
    Then user should see a summary

  @JPY_common
  Scenario:Payments: Verify Transfer to an Existing Member from JPY Wallet
    When user clicks on JPY wallet
    And user clicks payments tab
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

  @JPY_common
  Scenario: Payments: Verify Make a payment to a New Individual from JPY Wallet
    When user clicks on JPY wallet
    And user clicks payments tab
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

  @JPY_common
  Scenario: Payments: Verify Make a payment to Existing Individual from JPY Wallet
    When user clicks on JPY wallet
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

  @JPY_common
  Scenario: Payments: Verify Make a Payment to New Business from JPY Wallet
    When user clicks on JPY wallet
    And user clicks payments tab
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

  @JPY_common
  Scenario: Payments: Verify Make a Payment to Existing Business from JPY Wallet
    When user clicks on JPY wallet
    And user clicks payments tab
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

  @JPY_common
  Scenario: Verify Details Tab Graph of JPY Wallet
    When user clicks on JPY wallet
    Then user should see a graph

  @JPY_common
  Scenario: Verify Transaction Tab of JPY Wallet
    When user clicks on JPY wallet
    And user click on transaction tab
    And user should see latest pending transactions first(if any) in PENDING TRANSACTIONS
    Then user after scroll down should see latest cleared transaction first in YOUR TRANSACTIONS
  @JPY_common
  Scenario: Verify Statement Tab of JPY Wallet
    When user clicks on JPY wallet
    And user clicks on statements tab
    And if any statement available user clicks on download button
    Then statement should be downloaded

#+++++++++++++++++++++++++++++++++++++++++++CNY wallet feature++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
  @CNY_us @Deposit_us
  Scenario: Deposit: Verify Card Deposit to CNY Wallet via Stripe
    When user clicks on CNY wallet
    And user clicks on deposit
    And user expend from dropdown
    And user selects debit or credit card
    And user enters amount to load in USD
    And user clicks agreement
    And summary should appear
    And clicks confirm
    And enter card details in Stripe and clicks on pay
    And user checks confirmation message and press ok
    Then user should redirect to accounts

  @CNY_common @CNY_move @move
  Scenario: Verify CNY Wallet to USD Wallet Move
    When user clicks on CNY wallet
    And user clicks on move tab
    And user clicks on select beneficiary dropdown
    And user selects USD wallet
    And enter amount on sending amount box
    And user clicks confirm
    And user enters secret code
    And user clicks confirm again
    And transfer successfully completed message is shown
    And user clicks on ok
    Then user should redirect to wallet details tab

  @CNY_us @us_bank
  Scenario: Deposit: Verify Local(US Bank) Deposit to CNY Wallet
    When user clicks on CNY wallet
    And user clicks on deposit
    And user expend from dropdown
    And user selects local(US Bank)
    Then user should see details of bank

  @CNY_non_us
  Scenario: Deposit: Verify Local(UK Bank) Deposit to CNY Wallet
    When user clicks on CNY wallet
    And user clicks on deposit
    And user expend from dropdown
    And user selects local(UK Bank)
    Then user should see details of bank

  @CNY_non_us
  Scenario: Deposit: Verify International (non UK Bank) Deposit to CNY Wallet
    When user clicks on CNY wallet
    And user clicks on deposit
    And user expend from dropdown
    And user selects International(non UK Bank)
    Then user should see details of bank

  @CNY_common
  Scenario: Deposit: Verify Crypto Deposit to CNY Wallet
    When user clicks on CNY wallet
    When user clicks on deposit
    And user expend from dropdown
    And user selects crypto deposit
    And user enters sending amount in TBTC
    And user clicks on terms and condition check box
    And user clicks confirm
    Then user should see a summary

  @CNY_common
  Scenario:Payments: Verify Transfer to an Existing Member from CNY Wallet
    When user clicks on CNY wallet
    And user clicks payments tab
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

  @CNY_common
  Scenario: Payments: Verify Make a payment to a New Individual from CNY Wallet
    When user clicks on CNY wallet
    And user clicks payments tab
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

  @CNY_common
  Scenario: Payments: Verify Make a payment to Existing Individual from CNY Wallet
    When user clicks on CNY wallet
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

  @CNY_common
  Scenario: Payments: Verify Make a Payment to New Business from CNY Wallet
    When user clicks on CNY wallet
    And user clicks payments tab
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

  @CNY_common
  Scenario: Payments: Verify Make a Payment to Existing Business from CNY Wallet
    When user clicks on CNY wallet
    And user clicks payments tab
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

  @CNY_common
  Scenario: Verify Details Tab Graph of CNY Wallet
    When user clicks on CNY wallet
    Then user should see a graph

  @CNY_common
  Scenario: Verify Transaction Tab of CNY Wallet
    When user clicks on CNY wallet
    And user click on transaction tab
    And user should see latest pending transactions first(if any) in PENDING TRANSACTIONS
    Then user after scroll down should see latest cleared transaction first in YOUR TRANSACTIONS
  @CNY_common
  Scenario: Verify Statement Tab of CNY Wallet
    When user clicks on CNY wallet
    And user clicks on statements tab
    And if any statement available user clicks on download button
    Then statement should be downloaded
#+++++++++++++++++++++++++++++++++++++++++++PHP wallet feature++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
  @PHP_non_us
  Scenario: Verify PHP Wallet to Euro Wallet Move
    When user clicks on PHP wallet
    And user clicks on move tab
    And user clicks on select beneficiary dropdown
    And user selects EUR wallet
    And enter amount on sending amount box
    And user clicks confirm
    And user enters secret code
    And user clicks confirm again
    And transfer successfully completed message is shown
    And user clicks on ok
    Then user should redirect to wallet details tab

  @PHP_non_us
  Scenario: Deposit: Verify Crypto Deposit to PHP Wallet
    When user clicks on PHP wallet
    And user clicks on deposit
    And user expend from dropdown
    And user selects crypto deposit
    And user enters sending amount in TBTC
    And user clicks on terms and condition check box
    And user clicks confirm
    Then user should see a summary

  @PHP_common
  Scenario: Verify Details Tab Graph of PHP Wallet
    When user clicks on PHP wallet
    Then user should see a graph

  @PHP_common @Single
  Scenario: Verify Transaction Tab of PHP Wallet
    When user clicks on PHP wallet
    And user click on transaction tab
    And user should see latest pending transactions first(if any) in PENDING TRANSACTIONS
    Then user after scroll down should see latest cleared transaction first in YOUR TRANSACTIONS

  @PHP_common
  Scenario: Verify Statement Tab of PHP Wallet
    When user clicks on CNY wallet
    And user clicks on statements tab
    And if any statement available user clicks on download button
    Then statement should be downloaded


#++++++++++++++++++++++++++++++++++++++++++++++++PLCU++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
  @plcu
  Scenario:  Verify Withdraw Tab of USD Wallet(New personal Account)
    When user is in withdraw tab
    And user add personal account
    And user selects destination bank country and currency
    And press next button
    And user input withdraw beneficiary details and press next
    And input sending amount in usd
    And summary should appear
    And click on expedite fee and outbound transfer agreement
    And expedite fee should add in summary
    And clicks confirm button
    And enter otp for transfer
    And user clicks confirm button again
    And user checks success message
    And press ok
    Then user should redirect to details

  @plcu
  Scenario:  Verify Withdraw Tab of USD Wallet(Existing Personal Account)
    When user is in withdraw tab
    And user clicks on select beneficiary dropdown
    And user selects beneficiary
    And input sending amount in usd
    And summary should appear
    And click on expedite fee and outbound transfer agreement
    And expedite fee should add in summary
    And clicks confirm button
    And enter otp for transfer
    And user clicks confirm button again
    And user checks success message
    And press ok
    Then user should redirect to details

  @plcu
  Scenario:  Verify Pay Tab of USD Wallet(Pay New Friends or Family)
    When user is in pay tab
    And user clicks pay button of friends or family
    And user clicks on pay someone new
    And user selects destination bank country and currency
    And press next button
    And user input pay(individual) beneficiary details and press next
    And input sending amount in usd
    And input payment reference and reason
    And click on expedite fee and outbound transfer agreement
    And expedite fee should add in summary
    And summary should appear
    And clicks confirm button
    And enter otp for transfer
    And user clicks confirm button again
    And user checks success message
    And press ok
    Then user should redirect to details

  @plcu
  Scenario:  Verify Pay Tab of USD Wallet(Existing Friends or Family)
    When user is in pay tab
    And user clicks pay button of friends or family
    And user clicks on select beneficiary dropdown
    And user selects beneficiary
    And input sending amount in usd
    And input payment reference and reason
    And click on expedite fee and outbound transfer agreement
    And expedite fee should add in summary
    And summary should appear
    And clicks confirm button
    And enter otp for transfer
    And user clicks confirm button again
    And user checks success message
    And press ok
    Then user should redirect to details

  @plcu
  Scenario:  Verify Pay Tab of USD Wallet(Pay New Business or Invoice)
    When user is in pay tab
    And user clicks pay button a business or invoice
    And user clicks on pay to new business button
    And user selects destination bank country and currency
    And press next button
    And user input business beneficiary details and press next
    And input sending amount in usd
    And input payment reference and reason
    And click on expedite fee and outbound transfer agreement
    And expedite fee should add in summary
    And summary should appear
    And clicks confirm button
    And enter otp for transfer
    And user clicks confirm button again
    And user checks success message
    And press ok
    Then user should redirect to details

  @plcu
  Scenario: Verify Pay tab of USD Wallet(Existing Business or Invoice)
    When user is in pay tab
    And user clicks pay button a business or invoice
    And user clicks on select beneficiary dropdown
    And user selects beneficiary
    And input sending amount in usd
    And input payment reference and reason
    And click on expedite fee and outbound transfer agreement
    And expedite fee should add in summary
    And summary should appear
    And clicks confirm button
    And enter otp for transfer
    And user clicks confirm button again
    And user checks success message
    And press ok
    Then user should redirect to details

  @plcu
  Scenario: Verify Pay Tab of USD Wallet(Existing Member)
    When user is in pay tab
    And user clicks pay button of another member
    And user clicks on select beneficiary dropdown
    And user selects beneficiary
    And input sending amount in usd
    And input payment reference
    And summary should appear
    And clicks confirm button
    And enter otp for transfer
    And user clicks confirm button again
    And user checks success message
    And press ok
    Then user should redirect to details










