Feature: Test the TagExpo Website

Scenario Outline:: To check the ForBuyer module form validation
Given user able to enter the ForBuyer link
When user enter the company name "<company name>"
And user enter the Brand name "<Brand name>"
And user upload the profile
And user enter the MobileNo "<MobileNo>"
And user enter the address "<address>"
And user enter the Contact person "<Contact person>"
And user enter the Designation "<Designation>"
And user enter the Managing director "<Managing director>"
And user enter the GSTNo "<GSTNo>"
And user enter the EmailId "<EmailId>"
And user enter the Website "<Website>"
And user enter the Associate Details "<AssociateDetails>"
And user able to pick the Bussiness Type
And user able to pick the Product Interested
And user able to pick the Interested in B2B meeting
And user able to pick the Fashion show visit
And user enter the Any other Reqiurement "<Anyothereqiurement>"
And user enter the password "<password>"
And user able to pick the Acknowledge check box
Then user able to click the register button

Examples:

|company name|Brand name|MobileNo|address|Contact person|Designation|Managing director|GSTNo|EmailId|Website|AssociateDetails|Anyothereqiurement|password|
|Infinity Hub|Adidas |6379732890|chennai|sachin|Tester| vasanth|18AABCU9603R1ZM|nojel32855@ratedane.com|https://tagexpo.1clx.in/buyer|BUYER REGISTRATION FORM|Nothing|Dinesh@005|
| 454564544555|564564|gsahasdfhgfg|564654|56465456|564564|5615656| hgdfghjkg| 565 | 56156456 | 54564564 |5645641565|54145414564|
|            |          |        |       |              |           |                 |       |     |       |                  |    |  |
