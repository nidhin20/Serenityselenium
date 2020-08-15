Feature: Card Management 

Scenario: A logged in user should be able add link card to his account 
	Given user loged in with username : "jithinraju95@gmail.com" ,password: "qwerty" 
	When clicked on Link more cards and added card "STU89567402" 
	Then user should get message "Card added sucessfully" 
	
Scenario: A logged in user should not be able add already linked card to his account 
	Given user loged in with username : "jithinraju95@gmail.com" ,password: "qwerty" 
	When clicked on Link more cards and added card "STU89567402" 
	Then user should get message "Card already mapped to a user" 
	
Scenario: A logged in user should be able to see all linked card to his account 
	Given user loged in with username : "jithinraju95@gmail.com" ,password: "qwerty" 
	When clicked on Link more cards and added card "STU89567402" 
	Then Card "STU89567402" should be the list
	
Scenario: A logged in user should not be able add already linked card to his account 
	Given user loged in with username : "jithinraju95@gmail.com" ,password: "qwerty" 
	When user click on delink card "STU89567402" 
	Then Card "STU89567402" should be removed from list