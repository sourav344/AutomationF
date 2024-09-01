Feature: Google Search Functionality

  @tagGoogleSingle
  Scenario Outline: Perform Google search with multiple keywords using a DataTable
    Given I am on Google search Page
    When I enter the following "<searchTerm>" in search box as single
    Then search results should appear for the following search terms

    Examples: 
      | searchTerm         |
      | Cucumber Testing   |
      | Selenium WebDriver |
      | Java Programming   |
