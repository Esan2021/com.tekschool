Feature: Real Estate page Features

@Real
Scenario: Open real estate sereche form
Given user is on real estate website
When user select city from dropdown field
And user select section from dropdown field
And user select property type from dropdown field
When user enter the price field
And user enter square metre field
And user select the bedrooms type field
Then user cleck on find button