Feature: Number of Rooms availability functionalites

  Scenario Outline: verify options under Rooms
    Given User is on the Adactin page
    When User should enter "<usernsme>", "<password>"
    And User should enter details "<Location>","<Hotels>", "<RoomType>", "<noofrooms>", "<CheckIn>", "<CheckOut>","<Adults>","<child>"
    And User Click Radio button and click Continue
    And User should enter "<First_name>","<Last_name>","<address>","<Card_no>","<Type>","<month>","<year>","<cvv>"
    Then User Should get generated order no

    Examples: 
      | usernsme | password | Location | Hotels      | RoomType | noofrooms | CheckIn    | CheckOut   | Adults | child | First_name | Last_name | address | Card_no          | Type | month | year | cvv |
      | arunuvan | JYN144   | London   | Hotel Creek | Double   |         1 | 23/08/2020 | 24/08/2020 |      2 |     0 | abi        | sha       | chennai | 3563543636536123 | VISA |     1 | 2021 | 456 |
      | arunuvan | JYN144   | London   | Hotel Creek | Double   |         2 | 23/08/2020 | 24/08/2020 |      2 |     0 | abi        | sha       | chennai | 3563543636536123 | VISA |     1 | 2021 | 456 |
      | arunuvan | JYN144   | London   | Hotel Creek | Double   |         3 | 23/08/2020 | 24/08/2020 |      2 |     0 | abi        | sha       | chennai | 3563543636536123 | VISA |     1 | 2021 | 456 |
      | arunuvan | JYN144   | London   | Hotel Creek | Double   |         4 | 23/08/2020 | 24/08/2020 |      2 |     0 | abi        | sha       | chennai | 3563543636536123 | VISA |     1 | 2021 | 456 |
      | arunuvan | JYN144   | London   | Hotel Creek | Double   |         5 | 23/08/2020 | 24/08/2020 |      2 |     0 | abi        | sha       | chennai | 3563543636536123 | VISA |     1 | 2021 | 456 |
      | arunuvan | JYN144   | London   | Hotel Creek | Double   |         6 | 23/08/2020 | 24/08/2020 |      2 |     0 | abi        | sha       | chennai | 3563543636536123 | VISA |     1 | 2021 | 456 |
      | arunuvan | JYN144   | London   | Hotel Creek | Double   |         7 | 23/08/2020 | 24/08/2020 |      2 |     0 | abi        | sha       | chennai | 3563543636536123 | VISA |     1 | 2021 | 456 |
      | arunuvan | JYN144   | London   | Hotel Creek | Double   |         8 | 23/08/2020 | 24/08/2020 |      2 |     0 | abi        | sha       | chennai | 3563543636536123 | VISA |     1 | 2021 | 456 |
      | arunuvan | JYN144   | London   | Hotel Creek | Double   |         8 | 23/08/2020 | 24/08/2020 |      2 |     0 | abi        | sha       | chennai | 3563543636536123 | VISA |     1 | 2021 | 456 |
      | arunuvan | JYN144   | London   | Hotel Creek | Double   |         9 | 23/08/2020 | 24/08/2020 |      2 |     0 | abi        | sha       | chennai | 3563543636536123 | VISA |     1 | 2021 | 456 |
      | arunuvan | JYN144   | London   | Hotel Creek | Double   |        10 | 23/08/2020 | 24/08/2020 |      2 |     0 | abi        | sha       | chennai | 3563543636536123 | VISA |     1 | 2021 | 456 |
