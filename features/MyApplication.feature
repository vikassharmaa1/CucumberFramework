
Feature: Test facebook smoke scenario


  Scenario: Test login with valid credentials
    Given Open chrome and start application
    When I enter valid username
    And valid password
    And click on submit
    Then user should be able to login successfully

 
 # Scenario Outline: Title of your scenario outline
  #  Given I want to write a step with <name>
    #When I check for the <value> in step
   # Then I verify the <status> in step

   # Examples: 
     # | name  | value | status  |
     # | name1 |     5 | success |
     # | name2 |     7 | Fail    |
