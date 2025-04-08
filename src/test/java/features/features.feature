
Feature: Search and place the order for Products

@smoke
Scenario Outline: Search experience for product search in both home and Offers page
Given User is on GreenCart Landing page
When user searched with Shortname <Name> and extracted actual name of product
Then user searched for same shortname <Name> in offers page to check if product exist
And validate product name in offers page matches with Landing Page

Examples:
|	Name		|
|	Tom 		|
|	Beet		|