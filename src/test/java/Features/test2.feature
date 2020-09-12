Feature: Facebook login  test 2
  @sanity
  Scenario: Verifying Facebook logo
    Given I am a Facebook user
    When I access Facebook login page
    Then I  see facebook logo

  @Sanity  @RegressionTest
  Scenario: Verifying Email or Phone label
    Given I am a Facebook user
    When I access Facebook logo page
    Then I see Email or phone text on the above edit box

  @sanity
  Scenario: Verify editbox
    Given I am a Facebook user
    When I access Facebook logo page
    Then I see an edit box to enter email

  @RegressionTest
  Scenario: Verify Password edit box
    Given I am a Facebook user
    When I access Facebook logo page
    Then I see the text Password on the page above edit box

  @End2End
  Scenario: Verify Log-in button
    Given I am a Facebook user
    When I access Facebook logo page
    Then I see Log In button next to email and password edit boxes

  Scenario: Verify forgotten account
    Given I am a Facebook user
    When I access Facebook logo page
    Then I see a link for Forgotten account
