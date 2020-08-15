Feature: Login Management 

Scenario:
Test case 9 - A new user should be able to sign in to the system with a valid email id and password. 
	Given user is in home page 
	And user in sigup page 
	When filled emailid: "nidhin.paul@live.com" , password: "testpass" ,name: "Nidhin" ,phonenumber: "89338933" , Date "1989-10-01"  and submit 
	Then User get response for Signup message "Invalid Email/User already exist" 
	
Scenario: A valid user should be able to login to the system 
	Given user is in home page 
	When login with username : "jithinraju95@gmail.com" ,password: "qwerty" 
	Then user should be redirected to "http://localhost:4200/" 
	
Scenario: A valid user should not be able to login to the system 
	Given user is in home page 
	When login with username : "jithinraju95@gmail.com" ,password: "qwertyaa" 
	Then user prompts with error message "The username and password were not recognised" 
	
Scenario:
A valid Admin user should be able to login to the system and redirected to dashboard page 
	Given user is in home page 
	When login with username : "nidhin@gmail.com" ,password: "test" 
	Then user should be redirected to "http://localhost:4200/dashboard"