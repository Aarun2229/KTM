package org.sub;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.runner.BaseClass;

public class SelctPg extends BaseClass
{
	public SelctPg() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="radiobutton_0") private WebElement rado;
	@FindBy(id="continue") private WebElement cont;
	public WebElement getRado() {
		return rado;
	}
	public WebElement getCont() {
		return cont;
	}
	public void select() {
		click(getRado());
		click(getCont());

	}

}
