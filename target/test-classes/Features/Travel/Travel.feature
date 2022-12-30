Feature: Functionality Test For Travel Feature

  Scenario:Verify Travel Information Page

    Given a valid url
    When user click travel option
    And user select person option
    And user select location
    And user input search keyword
    And user select from and to date
    And user click on search button
    And user click room button for select
    Then user should see the room page



