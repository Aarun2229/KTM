package org.sub;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.runner.BaseClass;

public class OrderPg extends BaseClass
{
	public OrderPg() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="order_no") private WebElement ordrId;
	public WebElement getOrdrId() {
		return ordrId;
	}
	public void order() {
		getVal(getOrdrId());

	}

}
