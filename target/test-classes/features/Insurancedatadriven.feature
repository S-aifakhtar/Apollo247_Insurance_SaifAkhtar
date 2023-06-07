Feature: Insurance

  Scenario Outline: Verify Search functionality with valid Insurer
    Given Chrome is opened and  Apollo247 app is opened
    When  User click on the Insurance page
    When User navigate on the Insurance page
    Then User enters in Search Insurer "<SearchKeyword>"
    Then It display the list of Insurer available

    Examples: 
      | SearchKeyword                           |
      | icici lombard General insurance company |

  Scenario Outline: Verify Search functionality with invalid Insurer
    Given Chrome is opened and  Apollo247 app is opened
    When User click on the Insurance page
    And User navigate on the Insurance page
    Then User enters in Search Insurer "<SearchKeyword>"
    Then It shows No result found

    Examples: 
      | SearchKeyword |
      | wrong data1   |
      | wrong data    |
