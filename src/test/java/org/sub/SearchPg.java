package org.sub;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.runner.BaseClass;

public class SearchPg extends BaseClass
{
	public SearchPg() {
		PageFactory.initElements(driver,this);	}
	
	@FindBy(xpath="//*[text()='Booked Itinerary']") private WebElement iternary;

	public WebElement getIternary() 
	{
		return iternary;
	}
	
	public void search()
	{
		click(iternary);
	}
	
	
				/*@FindBy(id="location") private WebElement loc;
				@FindBy(id="hotels") private WebElement hotl;
				@FindBy(id="room_type") private WebElement type;
				@FindBy(id="room_nos") private WebElement nos;
				@FindBy(id="datepick_in") private WebElement in;
				@FindBy(id="datepick_out") private WebElement out;
				@FindBy(id="adult_room") private WebElement adltnos;
				@FindBy(id="Submit") private WebElement submt;
				@FindBy(id="child_room") private WebElement child;
				public WebElement getLoc() {
					
					return loc;
				}
				public WebElement getHotl() {
					return hotl;
				}
				public WebElement getType() {
					return type;
				}
				public WebElement getNos() {
					return nos;
				}
				public WebElement getIn() {
					return in;
				}
				public WebElement getOut() {
					return out;
				}
				public WebElement getAdltnos() {
					return adltnos;
				}
				public WebElement getSubmt() {
					return submt;
				}
				public WebElement getChild() {
					return child;
				}
				public void search(String location, String hotels, String type, String rooms, String in, String out, String adult, String child) {
					dropDown(getLoc(),location );
					dropDown(getHotl(),hotels );
					dropDown(getType(),type );
					dropDown(getNos(),rooms );
					insert(getIn(), in);
					insert(getOut(), out);  
				    dropDown(getAdltnos(),adult );
				    dropDown(getChild(), child);
				    click(getSubmt());
				}*/

}
