package org.sub;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.runner.BaseClass;

public class Itinerary extends BaseClass
{
	public Itinerary() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="order_id_text") private WebElement txtOrder;
	@FindBy(id="search_hotel_id") private WebElement btnGo;
	@FindBy(xpath="(//input[@type='checkbox'])[2]") private WebElement btnClick;
	@FindBy(xpath="//input[@name='cancelall']") private WebElement btnCancel;
	public WebElement getTxtOrder() {
		return txtOrder;
	}
	public WebElement getBtnGo() {
		return btnGo;
	}
	public WebElement getBtnClick() {
		return btnClick;
	}
	public WebElement getBtnCancel() {
		return btnCancel;
	}
	public void itinePg(String booking) {
		insert(txtOrder, booking);
		click(btnGo);
		click(btnClick);
		click(btnCancel);
		alertOk();
	}

}

