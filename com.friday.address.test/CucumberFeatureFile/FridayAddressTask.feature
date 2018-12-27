#author: rajeshamoharana@gmail.com
Feature: Friday Address line task validation

@unittest
Scenario Outline: Validate input Address String
	Given User has input address string <InputAddressLine> and get Json output
	
	Examples:
	|InputAddressLine|
	||
	|Winteralle 3|
	|Musterstrasse 45|
	|Blaufeldweg 123B|
	|Auf der Vogelwiese 23 b|
	|Calle 39 No 1540|
	|4, rue de la revolution|
	|200 Broadway A|
	|Calle Aduana, 29|
	|23 b auf der vogelwiese|
	|Calle 39 No 1540 B|
	|Calle 39 No 1540B|
	|29b , Calle Aduana|
	|Calle Aduana|
	
	

	
