Feature: Insurance

Scenario Outline: Verify Search functionality with valid Insurer
    Given Chrome is opened and  Apollo247 app is opened
    When  User click on the Insurance page
    When User navigate on the Insurance page
    Then User enters in Search Insurer from sheetname "<SheetName>" and rownumber <RowNumber>
    Then It display the list of Insurer available
    
    Examples:
    | SheetName | RowNumber |
    | Sheet1    |         0 |
    | Sheet1    |         1 |
    
Scenario Outline: Verify Search functionality with invalid Insurer
 Given Chrome is opened and  Apollo247 app is opened
    When User click on the Insurance page
    And User navigate on the Insurance page
    Then User enters in Search Insurer from sheetname "<SheetName>" and rownumber <RowNumber>
    Then It shows No result found
    
    Examples:
    | SheetName | RowNumber |
    | Sheet2    |         0 |
    | Sheet2    |         1 |
    