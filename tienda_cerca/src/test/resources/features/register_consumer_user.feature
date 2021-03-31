#Author: josejulian_ramos@hotmail.com
Feature: Consumer user registration in TiendaCerca.co
  As a Certification Analyst for TiendaCerca.co
  I want to test the consumer user registration functionality
  to validate its correct operation

  Background: Navigate to the TiendaCerca.co page
    Given that the analyst is on the home page of TiendaCerca

  Scenario: Successful registration of a consumer user
    When he fills out the registration data
      | city   | userType   | countryCode | firstName | lastName | email          | address        |
      | Bogotá | Consumidor | CO +57      | Juan      | Perez    | juan@gmail.com | Cra. 13 #96-67 |
    Then he should see the successful registration message

  Scenario: Consumer user registration with invalid first name
    When he fills out the registration data with an invalid data
      | city   | userType   | countryCode | firstName | lastName | email          | address        |
      | Bogotá | Consumidor | CO +57      | Juan123   | Perez    | juan@gmail.com | Cra. 13 #96-67 |
    Then he should see the invalid first name message

  Scenario: Consumer user registration with invalid last name
    When he fills out the registration data with an invalid data
      | city   | userType   | countryCode | firstName | lastName | email          | address        |
      | Bogotá | Consumidor | CO +57      | Juan      | Perez123 | juan@gmail.com | Cra. 13 #96-67 |
    Then he should see the invalid last name message

  Scenario: Consumer user registration with invalid email
    When he fills out the registration data with an invalid data
      | city   | userType   | countryCode | firstName | lastName | email         | address        |
      | Bogotá | Consumidor | CO +57      | Juan      | Perez    | juangmail.com | Cra. 13 #96-67 |
    Then he should see the invalid email message


  Scenario: Consumer user registration with a cell phone number greater than ten digits
    When he fills out the registration data with a cell phone number greater than ten digits
      | city   | userType   | countryCode | firstName | lastName | email          | address        |
      | Bogotá | Consumidor | CO +57      | Juan      | Perez    | juan@gmail.com | Cra. 13 #96-67 |
    Then he should see the invalid cell phone number alert

  Scenario: Consumer user registration with a cell phone number less than eight digits
    When he fills out the registration data with a cell phone number less than eight digits
      | city   | userType   | countryCode | firstName | lastName | email          | address        |
      | Bogotá | Consumidor | CO +57      | Juan      | Perez    | juan@gmail.com | Cra. 13 #96-67 |
    Then he should see the invalid cell phone number message