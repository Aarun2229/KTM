Feature: This is the login feature ofOrgHrm

  Scenario Outline: Login Scenario
    Given Procedure for Login page
    When user enter "<UserName>" and "<Password>"
    And click button

    Examples: 
      | UserName | Password |
      | arun     | 1fg4     |
      | power    | gh4      |
      | vicky    | fgh      |
