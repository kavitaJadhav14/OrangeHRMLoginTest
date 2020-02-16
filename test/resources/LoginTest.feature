Feature:  Test OrangeHRM website login

  Scenario:  check login with valid credentials
  Given  user is on OrangeHRM Webpage and enter valid username and password
   When  user is on result page
    Then  user can see employee information page
    And  user close the browser



    Scenario: check login with invalid credentials
      Given  user is on OrangeHRM Webpage and enter invalid username and password
      When  user couldn't login
      Then  user can see error message
      And  user close the browser