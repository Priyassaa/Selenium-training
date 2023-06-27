Feature: To validate the account creation of Facebook application
Background: Given User has to open the browser and maximize the window
Scenario: To create new account in Facebook application 
When User has to open the facebook application Url 
When User has to click the Create new account button


Scenario Outline: To create new account in Facebook application
When User has to fill the <firstname1> field
And User has to fill the <surname1> field
And User has to fill the <emailormobilenumber> field
And User has to fill the <password> field
Then To close the browser

Examples:
|firstname1|surname1|emailormobilenumber|password| 
| priyasri | sumo   | oops@gmail.com    | gfgfgf |       
