package org.sub;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.runner.BaseClass;

public class LoginPg extends BaseClass
{
	public LoginPg() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username") private WebElement txtuser;
	@FindBy(id="password") private WebElement txtpas;
	@FindBy(id="login") private WebElement bthlogin;
	public WebElement getTxtuser() {
		return txtuser;
	}
	public WebElement getTxtpas() {
		return txtpas;
	}
	public WebElement getBthlogin() {
		return bthlogin;
	}
	public void login(String user, String pass) {
		insert(getTxtuser(), user);	
		insert(getTxtpas(), pass);
		click(getBthlogin());
	}
	

}
