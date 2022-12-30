Feature: Test functionality of Additional information

   Scenario:Verify Additional information Page
    Given a valid url with credential
    When user select annual transaction volume
    And user Answer from Annual Transaction Volume dropdown

    And user selects Approximate Net worth dropdown
    And user Answer from Approximate Net worth dropdown

    And user selects Employment Type  dropdown
    And user Answer from Employment Type dropdown

    And user selects Account Usage dropdown
    And user Answer from Account Usage dropdown
    And Lastly user hit the Continue button
    Then user should see the Home page
