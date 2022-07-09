Feature: Default


  Scenario: The user is able to download the product information for the home savings
    Given The home savings section is viewed to the user
    When The user taps on download product information option
    Then The document is shown to the user in new browser tab


  Scenario: The user is able to open selected product successfully
    Given The products section is viewed to the user
    When The user taps on to the product option
    Then The selected product’s information is shown to the user in new webpage


  Scenario: The user is able to get informed about the home savings bonus
    Given The home savings bonus section is viewed to the user
    When The user taps on to the inform now option
    Then All the info regarding to home savings bonus will show to the user in new webpage


  Scenario: The user is able to view the comparison of home savings products
    Given The profit tables for home savings section is viewed to the user
    When The user taps on to the compare products option
    Then All the paytables are shown to the user in new webpage


  Scenario: The user is able to submit for WHONWELT news
    Given The email option is shown
    And The user add a valid email
    When The user taps on submit option
    Then The success message is shown