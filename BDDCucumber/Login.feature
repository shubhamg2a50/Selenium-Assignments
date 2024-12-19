Feature: Instagram Signup/Register Page

  Scenario: Verify Instagram sign-up functionality with valid details
    Given I navigate to the Instagram sign-up page
    When I enter valid registration details
    Then I should see a confirmation or redirection indicating successful registration

  Scenario: Verify error message for invalid email
    Given I navigate to the Instagram sign-up page
    When I enter an invalid email address
    Then I should see an error message for email validation
