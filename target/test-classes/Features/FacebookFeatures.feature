Feature: Login

  Scenario Outline: FB Login Successfully
    Given OPEN BROWSER
    When FB LOGIN USER AS <User> AND <Pass>
    Then FB LOGIN BUTTON CLICK
    Then BROWSER CLOSE

    Examples: 
      | User                   | Pass        |
      | sonigourav80@yahoo.com | teracopy123 |
      | abc@yahoo.com          |       12345 |
