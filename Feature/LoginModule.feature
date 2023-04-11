#Author: your.email@your.domain.com
#Module: Login
#Last Modified Date: 26th March 2023
Feature: Login Functionality

  Scenario: Test Case to verify Login functionality with valid username and password
    Given Browser should be with login page
    When User should logs in using valid Username and Password and Click on Login button
    Then Home Page should get open and verify page title and Close browser

