Feature: Ebay Buy It Now Functionality 

Description: User should able to add items by clicking Buy It Now
		
Background: 				
Given Open Ebay Homepage 

Scenario: Ebay Buy It Now Functionality 
Given Search for Mens Shoes
When Select the first shoes
And Select color
And Select size
And Select amount 
Then Add to buy it now