Feature: Google Search Functionality
@tagGoogle_Multi
  Scenario: Perform Google search with multiple keywords using a DataTable
    Given I am on Google search Page
    When I enter the following search terms in search box
      | searchTerm       |
      | Cucumber Testing |
      | Selenium WebDriver|
      | Java Programming |
     Then search results should appear for the following search terms