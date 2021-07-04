@Hotelfunctionality
Feature: verifing the adactin webpage

  Scenario Outline: Verify the login with valid credentials
    Given User is in Adactin page
    When User enters "<username>" and "<password>"
    And User clicks login button
    Then User verify sucess message

    Examples: 
      | username     | password   |
      | chrisgreen10 | ipl2021csk |

  Scenario Outline: Verify the search hotel page
    When User Select "<Location>"and"<Hotels>"and"<Room Type>"and"<Number of Rooms>"and"<Adults per Room>"and"<Children per Room>"
    And User click search button

    Examples: 
      | Location | Hotels      | Room Type | Number of Rooms | Adults per Room | Children per Room |
      | Sydney   | Hotel Creek | Standard  | 1 - One         | 1 - One         | 1 - One           |

  Scenario: Verify the Select Hotel Page
    When User select the hotel
    And User click the continue button

  Scenario Outline: Verify the search hotel page
    When User enter "<First Name>"and"<Last Name>"and"<Billing Address>"and"<Credit Card No>"and"<Credit Card Type>"and"<Select month>"and"<Select year>"and"<CVV Number>"
    And User click booknow button

    Examples: 
      | First Name | Last Name | Billing Address | Credit Card No   | Credit Card Type | Select month | Select year | CVV Number |
      | chris      | green10   | Chennai         | 1234567890123456 | VISA             | January      |        2022 |        123 |

  Scenario: Verify booking confirmation page
    When User is in bokoking confirmation page
    Then User clicks logout button
