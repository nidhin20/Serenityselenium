Feature: Subscribtion Management 

Scenario: An Admin user should be able to add new subscribtion plan to the system. 
	Given user loged in with username : "nidhin@gmail.com" ,password: "test" 
	And clicked Subscribtion tab and clicked add new subscribtion 
	When filled plan id 1 , plan name "30% discount" ,card category "STU" ,default plan "false" , Subscribtion period 30 , Default rate 20 and clicked Add subscribtion 
	Then user should see prompt message "Subscription added successfully" in subscribtion popup 
	
Scenario: An authorized user should be able to add subscription his card 
	Given user loged in with username : "jithinraju95@gmail.com" ,password: "qwerty"
	When Add plan id 20 for card "STU89567402" , payment ref no "PR104"
	Then user shoudl see message "Subscribtion Added to card" when adding subscribtion to user card