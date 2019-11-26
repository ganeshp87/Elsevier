Feature: Validate Add to cart function


Scenario: Elsevier Checkout Test

Given user is already on Automation Practice Home Page
When User hoover on Dresses and click summer dresses
Then User lands on the Summer Dresses page
Then User hoover on to the first item and click Add to cart
Then click on Proceed to Checkout
Then Assert the product successfully added to the shopping cart
Then Verify the user in "Order - My Store" page
Then Click Proceed to checkout button
Then Assert user is in SignIn Section
Then Quit the browser



