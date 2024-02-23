Feature: To validate the login functionality of facebook application

  Scenario: To validate login with valid user name and invalid password
    Given To launch the chrome browser and maximise the window
    When To launch the url of facebook application
    And To pass valid username in email filed
    And To pass invalid password in password filed
    And To click login button
    And To check whether navigate to homepage or not
    Then To close the browser
