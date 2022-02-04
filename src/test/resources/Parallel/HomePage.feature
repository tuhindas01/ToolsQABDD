Feature: Homepage feature

Scenario: Homepage title
Given user is on homepage
When user gets the tile of page
Then the title should be "ToolsQA"
And the homepage logo should present
