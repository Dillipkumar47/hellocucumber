Feature: Check internet connectivity

  Scenario: Launch Google Homepage and Verify Internet is connected.
    Given User launches google homepage on chrome browser
    When User searches for Animal Pictures
    Then User is presented with Multiple photos of Animals
