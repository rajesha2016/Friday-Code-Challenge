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
	|Calle 39 No 1540 C|
	|Calle 39 No 1540B|
	|4, rue de la revolution|
	|200 Broadway Av|
	|Calle Aduana, 29|
	|Calle Aduana, 29 A|
	|23 b auf der vogelwiese|
	|29b , Calle Aduana|
	|Calle Aduana|
	
	

	
