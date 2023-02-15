Feature: Test Log Out Functionality
  Background:
    Given a valid url
  @logout @others @all_us @all_non_us
  Scenario: Verify Logout Functionality
    When user clicks on logout button