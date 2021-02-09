Feature: verify the adactin login deatils
 Scenario Outline: verify the adactin loginwith valid credentiles
  Given user is on adactin page
  When user enter the valid "<username>"and"<password>" and click login 
  And user enter valid "<location>","<hotels>","<roomType>","<numberofRooms>","<adultsperRoom>","<childrenperRoom>"
  And user click the select hotels
  And user clcik the search buttons
  And user enter the valid "<firstName>","<lastName>","<billingAddress>","<creditcardNo>","<creditcardtype>","<selectmonth>","<selectyear>","<CVVNumber>"
  Then user click Book Now
  
  Examples:
|username|password|location|hotels|roomType|numberofRooms|adultsperRoom|childrenperRoom|firstName|lastName|billingAddress|creditcardNo|creditcardtype|selectmonth|selectyear|CVVNumber|
|username|password|location|hotels|roomType|numberofRooms|adultsperRoom|childrenperRoom|firstName|lastName|billingAddress|creditcardNo|creditcardtype|selectmonth|selectyear|CVVNumber|
