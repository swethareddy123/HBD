Feature: Hotel Booking Page Functionality

Scenario: Firstname is blank
Given User is on Hotelbooking page
When firstname is blank
Then Display alertbox 'Please enter first name'

Scenario: Lastname is blank
Given User is on Hotelbooking page
When lastname is blank
Then Display alertbox 'Please enter last name'

Scenario: email is blank
Given User is on Hotelbooking page
When email is blank
Then Display alertbox 'Please enter email'

Scenario: email is invalid
Given User is on Hotelbooking page
When email is invalid
Then Display alertbox 'Please enter valid email id'

Scenario: mobile number is blank
Given User is on Hotelbooking page
When mobile number is blank
Then Display alertbox 'Please enter mobile number'

Scenario: mobile number is invalid
Given User is on Hotelbooking page
When mobile number is invalid
Then Display alertbox 'Please enter valid mobile number'