Feature: User should be able to use filter

Scenario: Users are able to filter for an item by brand under the Computing > Laptop section

  Given I Navigate to the `/computing/laptops` page
  When User Select the brand value to be Dell
  Then Validate that the results returned from page 1 matches the selected brand