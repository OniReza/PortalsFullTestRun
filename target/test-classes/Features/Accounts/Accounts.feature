Feature: Test Accounts Functionality
  Background:
    Given a valid url

  @card_deposit_usd_us @usd_all_features_us @all_wallet_features_us @all_us
  Scenario: Deposit: Verify Card Deposit to USD Wallet via Stripe
    When user clicks on USD wallet
    And user clicks on deposit
    And user expend from dropdown
    And user selects debit or credit card
    And user enters amount to deposit "5000"
    And user clicks agreement
    And deposit summary should appear
    And clicks confirm
    And enter card details in Stripe and clicks on pay
    And user checks confirmation message and press ok
    Then user should see post transaction balance is equal to available balance

  @card_deposit_usd_non_us @usd_all_features_non_us @all_non_us @all_wallet_features_non_us
  Scenario: Deposit: Verify Card Deposit to USD Wallet via Apexx
    When user clicks on USD wallet
    And user clicks on deposit
    And user expend from dropdown
    And user selects debit or credit card
    And user enters amount to deposit "5000"
    And user clicks agreement
    And deposit summary should appear
    And clicks confirm
    And enter card details in Apexx and clicks on pay
    And user checks confirmation message and press ok
    Then user should see post transaction balance is equal to available balance

  @usd_move @usd_all_features_us @usd_all_features_non_us @all_wallet_features_us @all_us @all_non_us @all_wallet_features_non_us
  Scenario: Verify USD Wallet to JPY Wallet Move
    When user clicks on USD wallet
    And user clicks on move tab
    And user clicks on select beneficiary dropdown
    And user selects JPY wallet
    And enter amount on sending amount box
    And move summary should appear
    And user clicks confirm
    And user enters secret code
    And user clicks confirm again
    And transfer successfully completed message is shown
    And user clicks on ok
    Then user should redirect to wallet details tab
    Then user should see post transaction balance is equal to available balance


  @usd_us_bank @usd_all_features_us @all_wallet_features_us @all_us
  Scenario: Deposit: Verify Local(US Bank) Deposit to USD Wallet
    When user clicks on USD wallet
    And user clicks on deposit
    And user expend from dropdown
    And user selects local(US Bank)
    Then user should see details of bank

  @usd_uk_bank @usd_all_features_non_us @all_non_us @all_wallet_features_non_us
  Scenario: Deposit: Verify Local(UK Bank) Deposit to USD Wallet
    When user clicks on USD wallet
    And user clicks on deposit
    And user expend from dropdown
    And user selects local(UK Bank)
    Then user should see details of bank

  @usd_intl_bank @usd_all_features_non_us @all_non_us @all_wallet_features_non_us
  Scenario: Deposit: Verify International (non UK Bank) Deposit to USD Wallet
    When user clicks on USD wallet
    And user clicks on deposit
    And user expend from dropdown
    And user selects International(non UK Bank)
    Then user should see details of bank

  @usd_crypto @usd_all_features_us @usd_all_features_non_us @all_wallet_features_us @all_us @all_non_us @all_wallet_features_non_us
  Scenario: Deposit: Verify Crypto Deposit to USD Wallet
    When user clicks on USD wallet
    When user clicks on deposit
    And user expend from dropdown
    And user selects crypto deposit
    And user enters sending amount in TBTC
    And user clicks on terms and condition check box
    And user clicks confirm
    Then user should see a summary

  @usd_m2m @usd_all_features_us @usd_all_features_non_us @all_wallet_features_us @all_us @all_non_us @all_wallet_features_non_us
  Scenario:Payments: Verify Transfer to an Existing Member(m2m) from USD Wallet
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

  @usd_make_payment @usd_all_features_us @usd_all_features_non_us @all_wallet_features_us @all_us @all_non_us @all_wallet_features_non_us
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

  @usd_make_payment @usd_all_features_us @usd_all_features_non_us @all_wallet_features_us @all_us @all_non_us @all_wallet_features_non_us
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

  @usd_make_payment @usd_all_features_us @usd_all_features_non_us @all_wallet_features_us @all_us @all_non_us @all_wallet_features_non_us
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

  @usd_make_payment @usd_all_features_us @usd_all_features_non_us @all_wallet_features_us @all_us @all_non_us @all_wallet_features_non_us
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

  @usd_details @usd_all_features_us @usd_all_features_non_us @all_wallet_features_us @all_us @all_non_us @all_wallet_features_non_us
  Scenario: Verify Details Tab Graph of USD Wallet
    When user clicks on USD wallet
    Then user should see a graph


  @usd_statement @usd_all_features_us @usd_all_features_non_us @all_wallet_features_us @all_us @all_non_us @all_wallet_features_non_us
  Scenario: Verify Statement Tab of USD Wallet
    When user clicks on USD wallet
    And user clicks on statements tab
    And if any statement available user clicks on download button
    Then statement should be downloaded

#+++++++++++++++++++++++++++++++++++++++++++++++++++++++EURO wallet++++++++++++++++++++++++++++++++++++++++++++++++++++++
  @card_deposit_euro_us @euro_all_features_us @all_wallet_features_us @all_us
  Scenario: Deposit: Verify Card Deposit to Euro Wallet via Stripe
    When user clicks on EURO wallet
    And user clicks on deposit
    And user expend from dropdown
    And user selects debit or credit card
    And user enters amount to deposit "5000"
    And user clicks agreement
    And deposit summary should appear
    And clicks confirm
    And enter card details in Stripe and clicks on pay
    And user checks confirmation message and press ok
    Then user should see post transaction balance is equal to available balance

  @card_deposit_euro_non_us @euro_all_features_non_us @all_non_us @all_wallet_features_non_us
  Scenario: Deposit: Verify Card Deposit to Euro Wallet via Apexx
    When user clicks on EURO wallet
    And user clicks on deposit
    And user expend from dropdown
    And user selects debit or credit card
    And user enters amount to deposit "5000"
    And user clicks agreement
    And deposit summary should appear
    And clicks confirm
    And enter card details in Apexx and clicks on pay
    And user checks confirmation message and press ok
    Then user should see post transaction balance is equal to available balance


  @euro_move @euro_all_features_us @euro_all_features_non_us @all_wallet_features_us @all_us @all_non_us @all_wallet_features_non_us
  Scenario: Verify Euro Wallet to CNY Wallet Move
    When user clicks on EURO wallet
    And user clicks on move tab
    And user clicks on select beneficiary dropdown
    And user selects CNY wallet
    And enter amount on sending amount box
    And move summary should appear
    And user clicks confirm
    And user enters secret code
    And user clicks confirm again
    And transfer successfully completed message is shown
    And user clicks on ok
    Then user should redirect to wallet details tab

  @euro_us_bank @euro_all_features_us @all_wallet_features_us @all_us
  Scenario: Deposit: Verify Local(US Bank) Deposit to Euro Wallet
    When user clicks on EURO wallet
    And user clicks on deposit
    And user expend from dropdown
    And user selects local(US Bank)
    Then user should see details of bank


  @euro_uk_bank @euro_all_features_non_us @all_non_us @all_wallet_features_non_us
  Scenario: Deposit: Verify Local(UK Bank) Deposit to Euro Wallet
    When user clicks on EURO wallet
    And user clicks on deposit
    And user expend from dropdown
    And user selects local(UK Bank)
    Then user should see details of bank

  @euro_intl_bank @euro_all_features_non_us @all_non_us @all_wallet_features_non_us
  Scenario: Deposit: Verify International (non UK Bank) Deposit to Euro Wallet
    When user clicks on EURO wallet
    And user clicks on deposit
    And user expend from dropdown
    And user selects International(non UK Bank)
    Then user should see details of bank


  @euro_crypto @euro_all_features_us @euro_all_features_non_us @all_wallet_features_us @all_us @all_non_us @all_wallet_features_non_us
  Scenario: Deposit: Verify Crypto Deposit to Euro Wallet
    When user clicks on EURO wallet
    When user clicks on deposit
    And user expend from dropdown
    And user selects crypto deposit
    And user enters sending amount in TBTC
    And user clicks on terms and condition check box
    And user clicks confirm
    Then user should see a summary

  @euro_m2m @euro_all_features_us @euro_all_features_non_us @all_wallet_features_us @all_us @all_non_us @all_wallet_features_non_us
  Scenario:Payments: Verify Transfer to an Existing Member(m2m) from Euro Wallet
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

  @euro_make_payment @euro_all_features_us @euro_all_features_non_us @all_wallet_features_us @all_us @all_non_us @all_wallet_features_non_us
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

  @euro_make_payment @euro_all_features_us @euro_all_features_non_us @all_wallet_features_us @all_us @all_non_us @all_wallet_features_non_us
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

  @euro_make_payment @euro_all_features_us @euro_all_features_non_us @all_wallet_features_us @all_us @all_non_us @all_wallet_features_non_us
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

  @euro_make_payment @euro_all_features_us @euro_all_features_non_us @all_wallet_features_us @all_us @all_non_us @all_wallet_features_non_us
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

  @euro_details @euro_all_features_us @euro_all_features_non_us @all_wallet_features_us @all_us @all_non_us @all_wallet_features_non_us
  Scenario: Verify Details Tab Graph of Euro Wallet
    When user clicks on EURO wallet
    Then user should see a graph

  @euro_statement @euro_all_features_us @euro_all_features_non_us @all_wallet_features_us @all_us @all_non_us @all_wallet_features_non_us
  Scenario: Verify Statement Tab of Euro Wallet
    When user clicks on EURO wallet
    And user clicks on statements tab
    And if any statement available user clicks on download button
    Then statement should be downloaded

#+++++++++++++++++++++++++++++++++++++++++++GBP wallet feature++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
  @card_deposit_gbp_us @gbp_all_features_us @all_wallet_features_us @all_us
  Scenario: Deposit: Verify Card Deposit to GBP Wallet via Stripe
    When user clicks on GBP wallet
    And user clicks on deposit
    And user expend from dropdown
    And user selects debit or credit card
    And user enters amount to deposit "5000"
    And user clicks agreement
    And deposit summary should appear
    And clicks confirm
    And enter card details in Stripe and clicks on pay
    And user checks confirmation message and press ok
    Then user should see post transaction balance is equal to available balance

  @card_deposit_gbp_non_us @gbp_all_features_non_us @all_non_us @all_wallet_features_non_us
  Scenario: Deposit: Verify Card Deposit to GBP Wallet via Apexx
    When user clicks on GBP wallet
    And user clicks on deposit
    And user expend from dropdown
    And user selects debit or credit card
    And user enters amount to deposit "5000"
    And user clicks agreement
    And deposit summary should appear
    And clicks confirm
    And enter card details in Apexx and clicks on pay
    And user checks confirmation message and press ok
    Then user should see post transaction balance is equal to available balance


  @gbp_move @gbp_all_features_us @gbp_all_features_non_us @all_wallet_features_us @all_us @all_non_us @all_wallet_features_non_us
  Scenario: Verify GBP Wallet to USD Wallet Move
    When user clicks on GBP wallet
    And user clicks on move tab
    And user clicks on select beneficiary dropdown
    And user selects USD wallet
    And enter amount on sending amount box
    And move summary should appear
    And user clicks confirm
    And user enters secret code
    And user clicks confirm again
    And transfer successfully completed message is shown
    And user clicks on ok
    Then user should redirect to wallet details tab

  @gbp_us_bank @gbp_all_features_us @all_wallet_features_us @all_us
  Scenario: Deposit: Verify Local(US Bank) Deposit to GBP Wallet
    When user clicks on GBP wallet
    And user clicks on deposit
    And user expend from dropdown
    And user selects local(US Bank)
    Then user should see details of bank

  @gbp_uk_bank @gbp_all_features_non_us @all_non_us @all_wallet_features_non_us
  Scenario: Deposit: Verify Local(UK Bank) Deposit to GBP Wallet
    When user clicks on GBP wallet
    And user clicks on deposit
    And user expend from dropdown
    And user selects local(UK Bank)
    Then user should see details of bank

  @gbp_intl_bank @gbp_all_features_non_us @all_non_us @all_wallet_features_non_us
  Scenario: Deposit: Verify International (non UK Bank) Deposit to GBP Wallet
    When user clicks on GBP wallet
    And user clicks on deposit
    And user expend from dropdown
    And user selects International(non UK Bank)
    Then user should see details of bank

  @gbp_crypto @gbp_all_features_us @gbp_all_features_non_us @all_wallet_features_us @all_us @all_non_us @all_wallet_features_non_us
  Scenario: Deposit: Verify Crypto Deposit to GBP Wallet
    When user clicks on GBP wallet
    When user clicks on deposit
    And user expend from dropdown
    And user selects crypto deposit
    And user enters sending amount in TBTC
    And user clicks on terms and condition check box
    And user clicks confirm
    Then user should see a summary

  @gbp_m2m @gbp_all_features_us @gbp_all_features_non_us @all_wallet_features_us @all_us @all_non_us @all_wallet_features_non_us
  Scenario:Payments: Verify Transfer to an Existing Member(m2m) from GBP Wallet
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

  @gbp_make_payment @gbp_all_features_us @gbp_all_features_non_us @all_wallet_features_us @all_us @all_non_us @all_wallet_features_non_us
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

  @gbp_make_payment @gbp_all_features_us @gbp_all_features_non_us @all_wallet_features_us @all_us @all_non_us @all_wallet_features_non_us
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

  @gbp_make_payment @gbp_all_features_us @gbp_all_features_non_us @all_wallet_features_us @all_us @all_non_us @all_wallet_features_non_us
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

  @gbp_make_payment @gbp_all_features_us @gbp_all_features_non_us @all_wallet_features_us @all_us @all_non_us @all_wallet_features_non_us
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

  @gbp_details @gbp_all_features_us @gbp_all_features_non_us @all_wallet_features_us @all_us @all_non_us @all_wallet_features_non_us
  Scenario: Verify Details Tab Graph of GBP Wallet
    When user clicks on GBP wallet
    Then user should see a graph


  @gbp_statement @gbp_all_features_us @gbp_all_features_non_us @all_wallet_features_us @all_us @all_non_us @all_wallet_features_non_us
  Scenario: Verify Statement Tab of GBP Wallet
    When user clicks on GBP wallet
    And user clicks on statements tab
    And if any statement available user clicks on download button
    Then statement should be downloaded

#+++++++++++++++++++++++++++++++++++++++++++JPY wallet feature++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
  @card_deposit_jpy_us @jpy_all_features_us @all_wallet_features_us @all_us
  Scenario: Deposit: Verify Card Deposit to JPY Wallet via Stripe
    When user clicks on JPY wallet
    And user clicks on deposit
    And user expend from dropdown
    And user selects debit or credit card
    And user enters amount to deposit "30000"
    And user clicks agreement
    And deposit summary should appear
    And clicks confirm
    And enter card details in Stripe and clicks on pay
    And user checks confirmation message and press ok
    Then user should see post transaction balance is equal to available balance

  @jpy_move @jpy_all_features_us @jpy_all_features_non_us @all_wallet_features_us @all_us @all_non_us @all_wallet_features_non_us
  Scenario: Verify JPY Wallet to USD Wallet Move
    When user clicks on JPY wallet
    And user clicks on move tab
    And user clicks on select beneficiary dropdown
    And user selects USD wallet
    And enter amount on sending amount box
    And move summary should appear
    And user clicks confirm
    And user enters secret code
    And user clicks confirm again
    And transfer successfully completed message is shown
    And user clicks on ok
    Then user should redirect to wallet details tab

  @jpy_us_bank @jpy_all_features_us @all_wallet_features_us @all_us
  Scenario: Deposit: Verify Local(US Bank) Deposit to JPY Wallet
    When user clicks on JPY wallet
    And user clicks on deposit
    And user expend from dropdown
    And user selects local(US Bank)
    Then user should see details of bank

  @jpy_uk_bank @jpy_all_features_non_us @all_non_us @all_wallet_features_non_us @all_non_us @all_wallet_features_non_us
  Scenario: Deposit: Verify Local(UK Bank) Deposit to JPY Wallet
    When user clicks on JPY wallet
    And user clicks on deposit
    And user expend from dropdown
    And user selects local(UK Bank)
    Then user should see details of bank

  @jpy_intl_bank @jpy_all_features_non_us @all_non_us @all_wallet_features_non_us
  Scenario: Deposit: Verify International (non UK Bank) Deposit to JPY Wallet
    When user clicks on JPY wallet
    And user clicks on deposit
    And user expend from dropdown
    And user selects International(non UK Bank)
    Then user should see details of bank

  @jpy_crypto @jpy_all_features_us @jpy_all_features_non_us @all_wallet_features_us @all_us @all_non_us @all_wallet_features_non_us
  Scenario: Deposit: Verify Crypto Deposit to JPY Wallet
    When user clicks on JPY wallet
    When user clicks on deposit
    And user expend from dropdown
    And user selects crypto deposit
    And user enters sending amount in TBTC
    And user clicks on terms and condition check box
    And user clicks confirm
    Then user should see a summary

  @jpy_m2m @jpy_all_features_us @jpy_all_features_non_us @all_wallet_features_us @all_us @all_non_us @all_wallet_features_non_us
  Scenario:Payments: Verify Transfer to an Existing Member(m2m) from JPY Wallet
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

  @jpy_make_payment @jpy_all_features_us @jpy_all_features_non_us @all_wallet_features_us @all_us @all_non_us @all_wallet_features_non_us
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

  @jpy_make_payment @jpy_all_features_us @jpy_all_features_non_us @all_wallet_features_us @all_us @all_non_us @all_wallet_features_non_us
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

  @jpy_make_payment @jpy_all_features_us @jpy_all_features_non_us @all_wallet_features_us @all_us @all_non_us @all_wallet_features_non_us
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

  @jpy_make_payment @jpy_all_features_us @jpy_all_features_non_us @all_wallet_features_us @all_us @all_non_us @all_wallet_features_non_us
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

  @jpy_details @jpy_all_features_us @jpy_all_features_non_us @all_wallet_features_us @all_us @all_non_us @all_wallet_features_non_us
  Scenario: Verify Details Tab Graph of JPY Wallet
    When user clicks on JPY wallet
    Then user should see a graph

  @jpy_statement @jpy_all_features_us @jpy_all_features_non_us @all_wallet_features_us @all_us @all_non_us @all_wallet_features_non_us
  Scenario: Verify Statement Tab of JPY Wallet
    When user clicks on JPY wallet
    And user clicks on statements tab
    And if any statement available user clicks on download button
    Then statement should be downloaded

#+++++++++++++++++++++++++++++++++++++++++++CNY wallet feature++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
  @card_deposit_cny_us @cny_all_features_us @all_wallet_features_us @all_us
  Scenario: Deposit: Verify Card Deposit to CNY Wallet via Stripe
    When user clicks on CNY wallet
    And user clicks on deposit
    And user expend from dropdown
    And user selects debit or credit card
    And user enters amount to deposit "30000"
    And user clicks agreement
    And deposit summary should appear
    And clicks confirm
    And enter card details in Stripe and clicks on pay
    And user checks confirmation message and press ok
    Then user should see post transaction balance is equal to available balance

  @cny_move @cny_all_features_us @cny_all_features_non_us @all_wallet_features_us @all_us @all_non_us @all_wallet_features_non_us
  Scenario: Verify CNY Wallet to USD Wallet Move
    When user clicks on CNY wallet
    And user clicks on move tab
    And user clicks on select beneficiary dropdown
    And user selects USD wallet
    And enter amount on sending amount box
    And move summary should appear
    And user clicks confirm
    And user enters secret code
    And user clicks confirm again
    And transfer successfully completed message is shown
    And user clicks on ok
    Then user should redirect to wallet details tab

  @cny_us_bank @cny_all_features_us @all_wallet_features_us @all_us
  Scenario: Deposit: Verify Local(US Bank) Deposit to CNY Wallet
    When user clicks on CNY wallet
    And user clicks on deposit
    And user expend from dropdown
    And user selects local(US Bank)
    Then user should see details of bank

  @cny_uk_bank @cny_all_features_non_us @all_non_us @all_wallet_features_non_us
  Scenario: Deposit: Verify Local(UK Bank) Deposit to CNY Wallet
    When user clicks on CNY wallet
    And user clicks on deposit
    And user expend from dropdown
    And user selects local(UK Bank)
    Then user should see details of bank

  @cny_intl_bank @cny_all_features_non_us @all_non_us @all_wallet_features_non_us
  Scenario: Deposit: Verify International (non UK Bank) Deposit to CNY Wallet
    When user clicks on CNY wallet
    And user clicks on deposit
    And user expend from dropdown
    And user selects International(non UK Bank)
    Then user should see details of bank

  @cny_crypto @cny_all_features_us @cny_all_features_non_us @all_wallet_features_us @all_us @all_non_us @all_wallet_features_non_us
  Scenario: Deposit: Verify Crypto Deposit to CNY Wallet
    When user clicks on CNY wallet
    When user clicks on deposit
    And user expend from dropdown
    And user selects crypto deposit
    And user enters sending amount in TBTC
    And user clicks on terms and condition check box
    And user clicks confirm
    Then user should see a summary

  @cny_m2m @cny_all_features_us @cny_all_features_non_us @all_wallet_features_us @all_us @all_non_us @all_wallet_features_non_us
  Scenario:Payments: Verify Transfer to an Existing Member(m2m) from CNY Wallet
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

  @cny_make_payment @cny_all_features_us @cny_all_features_non_us @all_wallet_features_us @all_us @all_non_us @all_wallet_features_non_us
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

  @cny_make_payment @cny_all_features_us @cny_all_features_non_us @all_wallet_features_us @all_us @all_non_us @all_wallet_features_non_us
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

  @cny_make_payment @cny_all_features_us @cny_all_features_non_us @all_wallet_features_us @all_us @all_non_us @all_wallet_features_non_us
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

  @cny_make_payment @cny_all_features_us @cny_all_features_non_us @all_wallet_features_us @all_us @all_non_us @all_wallet_features_non_us
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

  @cny_details @cny_all_features_us @cny_all_features_non_us @all_wallet_features_us @all_us @all_non_us @all_wallet_features_non_us
  Scenario: Verify Details Tab Graph of CNY Wallet
    When user clicks on CNY wallet
    Then user should see a graph

  @cny_statement @cny_all_features_us @cny_all_features_non_us @all_wallet_features_us @all_us @all_non_us @all_wallet_features_non_us
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
