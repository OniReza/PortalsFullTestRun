Feature: Functionality Test For Shopping Feature

  Background:
    Given a valid url

  Scenario: Verify Shopping New Request
    When user click on shopping button
    And user input description
    And user input brand name
    And user input style
    And user input color
    And user input weblink
    And user hit the create request button
    And user selects request and request status from search box
    Then user should see the shopping request status
