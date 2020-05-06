Feature: To verify items in user section and sign up

Scenario: Veirfy User can bid or not 
Given user navigate to the bid url
When user click on user bid link
Then should not see the items in the list to bid and navigate back to home page

Scenario: Veirfy seller is able to navigate to sign up page
Given seller navigate to the bid url
When seller click on seller signup link
Then should show the sign up page 

Scenario: Veirfy seller is able to sign up
Given seller navigate to the sign up page
When seller rovide sellername, username, password, email and  address
Then should be able to sign up and should show the items page for seller to add

Scenario: Seller login using the sign up details
Given seller is at home page and seller cick on seller login link 
When seller add valid username and password 
Then seller should login successfully

Scenario: Veirfy seller add an item
Given seller login and is at add new item page
When seller provide the itemname and click on add
Then item added should get added and be displayed


Scenario: Veirfy user bid for an item
Given user is at home page
When user click on the item name and fill the form
Then should show user has placed a bid for the item

Scenario: Veirfy user bid for an item
Given user is at home page
When user click on the item name and fill the form
Then should show user has placed a bid for the item with different price

Scenario: Lose the bid and verify the winner
Given Login as seller and close the bid
When seller cick on cose bid
Then should show the user has placed maximum bid



