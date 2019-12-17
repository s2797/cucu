
Feature: Title of your feature
  I want to use this template for my feature file
@smoke @unit
  Scenario:  New User SignUp
    Given User navigates to the URL
    And Enters the username "lalitha" and Enter the password 123
    When User clicks on login
    Then User is taken to Home page
    

 
   @unit
  Scenario: Login Existing User
    Given User enters user name
    And   User enters password
    When User clicks on login button
    Then Home page is dispalyed
 
  