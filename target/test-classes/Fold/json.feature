Feature: Verifying facebook details

  Scenario Outline: Verifying facebook valid login details
    Given User is on the facebook page
    When User enters "<userName>" , "<password>"
    Then User should click the login button

    Examples: 
      | userName | password |
      | hello    | java     |
      
@Reg
  Scenario Outline: Verifying facebook valid login details
    Given User is on the facebook page
    When User enters "<userName>" , "<password>"
    Then User should click the login button

    Examples: 
      | userName | password |
      | hello    | java     |
