
Feature: Title of your feature
  

Scenario: SignUp
  Given User navigates to the URL
  
  Scenario Outline:  New User SignUp
  
  And Enters the username "<username>" and Enter the password <passwd>
 

      Examples: 
      | username  | passwd   | 
      | name1     |     554  | 
      | name2     |     778  |
Scenario: SignUp
  When  User clicks on login
  Then  User is taken to Home page
  