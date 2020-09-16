Scenario Outline: Room type based Booking hotel 
Given User is on the Adactin page
	When User should enter "<usernsme>", "<password>"
	And User should enter details "<Location>","<Hotels>", "<RoomType>", "<noofrooms>", "<CheckIn>", "<CheckOut>","<Adults>","<child>"
	And User Click Radio button and click Continue
	And User should enter "<First_name>","<Last_name>","<address>","<Card_no>","<Type>","<month>","<year>","<cvv>"
	Then User Should get generated order no

	
	
	
Examples:
	|usernsme|password|Location   |Hotels        |RoomType    |noofrooms|CheckIn  |CheckOut |Adults|child|First_name|Last_name|address|Card_no   |Type|month|year|cvv|
	|arunuvan|JYN144  |London     |Hotel Creek   |Deluxe      |3      |23/08/2020|24/08/2020|2		 |1  |abi     |sha      |chennai|3563543636536123|VISA|1 |2021|456|
	|arunuvan|JYN144  |London     |Hotel Creek   |Standard    |3      |23/08/2020|24/08/2020|2 		 |1  |abi     |sha      |chennai|3563543636536123|VISA|1 |2021|456|
  |arunuvan|JYN144  |London     |Hotel Creek   |Double      |3      |23/08/2020|24/08/2020|2  	 |1  |abi     |sha      |chennai|3563543636536123|VISA|1 |2021|456|
	|arunuvan|JYN144  |London     |Hotel Creek   |Super Deluxe|3      |23/08/2020|24/08/2020|2  	 |1  |abi     |sha      |chennai|3563543636536123|VISA|1 |2021|456|