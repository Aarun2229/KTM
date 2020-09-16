package org.sub;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.runner.BaseClass;

public class BookPg extends BaseClass
{
	public BookPg() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="first_name") private WebElement fn;
	@FindBy(id="last_name") private WebElement ln;
	@FindBy(id="address") private WebElement add;
	@FindBy(id="cc_num") private WebElement ccNum;
	@FindBy(id="cc_type") private WebElement ccType;
	@FindBy(id="cc_exp_month") private WebElement mont;
	@FindBy(id="cc_exp_year") private WebElement year;
	@FindBy(id="cc_cvv") private WebElement cvv;
	@FindBy(id="book_now") private WebElement book;
	public WebElement getFn() {
		return fn;
	}
	public WebElement getLn() {
		return ln;
	}
	public WebElement getAdd() {
		return add;
	}
	public WebElement getCcNum() {
		return ccNum;
	}
	public WebElement getCcType() {
		return ccType;
	}
	public WebElement getMont() {
		return mont;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getBook() {
		return book;
	}
	public void book(String fn, String ln, String add, String no, String type, String month, String year, String cvv) {
	insert(getFn(), fn);
	insert(getLn(), ln);
	insert(getAdd(), add);
	insert(getCcNum(), no);
	dropDown(getCcType(), type);
	dropDown(getMont(), month);
	dropDown(getYear(), year);
	insert(getCvv(), cvv); 
	click(getBook());
	}

}
