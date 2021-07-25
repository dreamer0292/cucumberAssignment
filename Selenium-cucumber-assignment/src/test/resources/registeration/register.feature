Feature: Registering the user on the application

Scenario Outline: Register the user
Given Login Page
When  Click on SignUp Button
And  Firstname is "<Firstname>"
And Lastname is "<LastName>"
And Mail id is "<mail id>"
And Usetname is "<username>"
And enter the "<pwd>"
Then click on register

Examples: 
|Firstname|LastName|mail id|username|pwd|
|rakesh|jhunjhun|abc@y.com|rkesh1|password|