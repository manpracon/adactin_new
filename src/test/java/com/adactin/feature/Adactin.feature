Feature: Booking A Hotel In Adactin Web Application. 

@logIn
Scenario: User Login To The Web Application. 
	Given user Launch The Url Successfully. 
	When user Type The Username In The Username Field. 
	And user Type The Password In The Password Field. 
	Then user Click The Login Button That Navigates To The Search Hotel. 
@searchHotel.
Scenario: User Going To Search The Hotel By Giving Some Details. 
	When user Select The Location Using Dropdown. 
	And user Select The Hotel Using Dropdown. 
	And user Select The Room Type Using Dropdown.
	And user Select The Number Of Rooms Using Dropdown. 
	And user Select The Adult Per Room Using Dropdown. 
	And user Select The Children Per Room Using Dropdown. 
	Then user Click The Search Button That Navigates To The Select Hotel Page. 
@selectHotel	
Scenario: User Going To Select the Hotel. 
	When user Click The Option Of The Selected Hotel. 
	Then user Click The Continue That Will Navigate To The Book Hotel Webpage. 
@bookHotel
Scenario: User Going To Book The Hotel In The Book Hotel Page. 
	When user Type The Firstname In The First Name Field. 
	And user Type The Lastname In The Last Name Field. 
	And user Provide The Correct Address In The Address Field. 
	And user Provide The Credit Card Number In The Credit Card Field. 
	And user Select The Credit Card Type In The Type Field. 
	And user Select The Expiry Date In The Consent Dropdown. 
	And user Type The Confidential Cvv Number In The Consent Field. 
	Then user Click The Book Now Button That Will Navigate To The Hotel Confirmation page. 
@myItinerary
Scenario: User Going To Click On My Itinerary To Check The Booking Confirmation. 
	Then user Click The My itinerary To Navigate To The Bookings. 
@logOut
Scenario: User Going To Logout From The Account From The Security Purpose. 
	Then user Click The Logout Button To Logged Out From The Account. 
