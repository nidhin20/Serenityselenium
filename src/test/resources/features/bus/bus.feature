Feature: Bus Management

Scenario: Test case 12 - An authorized admin user should be able to create bus type
	Given  user loged in with username : "nidhin@gmail.com" ,password: "test"
	When Create new bus type bus type name "Tata motors" , seating capacity: 40 , standing capacity: 40
	Then Bus type creation response message "Bus Type Created successfully" 
	
Scenario: Test case 13 -  An authorized admin user should be able to create bus service provider
	Given user loged in with username : "nidhin@gmail.com" ,password: "test"
	When create bus service, bus service name "Bus eiran 10"
	Then Bus service creation response message "Bus Service Provider Added successfully"

Scenario: Test case 1 - A user uses a valid card with balance less than -1
	Given  user loged in with username : "nidhin@gmail.com" ,password: "test"
	And user boards in bus with service id 1 from stop id 1 with card "GEN45628001"
	When user tap the card to board
	Then Bus board or alight response message "Insufficient Balance" 
	
Scenario: Test case 2 - A user uses a valid card with balance equal to -1
	Given user loged in with username : "nidhin@gmail.com" ,password: "test"
	And user boards in bus with service id 1 from stop id 1 with card "GEN45628903"
	When user tap the card to board
	Then Bus board or alight response message "Insufficient Balance"

Scenario: Test case 3 - A user uses a valid card with balance greater than -1
	Given user loged in with username : "nidhin@gmail.com" ,password: "test"
	And user boards in bus with service id 1 from stop id 1 with card "GEN13123123"
	When user tap the card to board
	Then Bus board or alight response message "Not Peak Time - Checked in"

Scenario: Test case 4 - A user uses a valid card with balance greater than -1 taps to alight
	Given user loged in with username : "nidhin@gmail.com" ,password: "test"
	And user boards in bus with service id 1 from stop id 1 with card "GEN13123123"
	When user tap the card to alight
	Then Bus board or alight response message "Checked out"


Scenario: Test case 5 - A user uses a valid card with balance less than -1 , but has a subscription
	Given user loged in with username : "nidhin@gmail.com" ,password: "test"
	And user boards in bus with service id 1 from stop id 3 with card "GEN12345678"
	When user tap the card to board
	Then Bus board or alight response message "Not Peak Time - Checked in"

Scenario: A user uses a valid card with balance less than -1 , but has a subscription tap to alight
	Given user loged in with username : "nidhin@gmail.com" ,password: "test"
	And user boards in bus with service id 1 from stop id 3 with card "GEN12345678"
	When user tap the card to alight
	Then Bus board or alight response message "Checked out" 
	