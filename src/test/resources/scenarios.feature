Feature: User should be able to pass these scenarios

Scenario: Users are able to filter for an item by brand under the Computing > Laptop section

  Given I Navigate to the "/computing/laptops" page
  When User Select the brand value to be "dell"
  Then Validate that the results returned from page matches the brand "Dell"

Scenario: Users are able to sort results under dresses by price in descending order
  Given Navigate to the "/clothing/dresses" page
  When Click on Price sorting until the indicator indicates that the list is sorted by price in descending order
  Then Validate that the results are sorted in descending order of Price

Scenario: Users are able to search for an item
  Given User should navigate to the homepage
  When Search for "iPhone 14"
  Then Validate that the search results returned matches the search criteria