Feature: As a user, I want to create, update and delete a list

  @test
  Scenario: Verify user is able to create, update and delete a list
    Given User logins to ticktick page
    When User creates a new list
    And User updates the list
    And User deletes the list
    Then List should not be listed