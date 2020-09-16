package org.page;

import org.sub.BookPg;
import org.sub.Itinerary;
import org.sub.LoginPg;
import org.sub.OrderPg;
import org.sub.SearchPg;
import org.sub.SelctPg;

import com.runner.BaseClass;

public class PageObject  extends BaseClass
{
	private static PageObject pageObject;
	private static Itinerary itineraryPg;
	//private BookPg bookPg;
	private LoginPg loginPg;
	//private OrderPg orderPg;
	private SearchPg searchPg;
	private SelctPg selctPg;
	
	private PageObject() {}
	
	public static  PageObject getInstance() {
		return (pageObject==null)?pageObject=new PageObject():pageObject;
		}
	
	
	public LoginPg getLoginPg() {
		
		return (loginPg==null)?loginPg=new LoginPg():loginPg;
		
	}

	public SearchPg getSearchPg() {
		
		return (searchPg==null)?searchPg=new SearchPg():searchPg;
	}
	public SelctPg getSelctPg() {
		
		return (selctPg==null)?selctPg=new SelctPg():selctPg;
	}
/*	public BookPg getBookPg() {
		
		return (bookPg==null)?bookPg=new BookPg():bookPg;
	}
	public OrderPg getOrderPg() {
		
		return (orderPg==null)?orderPg=new OrderPg():orderPg;
	}*/
public Itinerary getItineraryPg() {
		
		return (itineraryPg==null)?itineraryPg=new Itinerary():itineraryPg;
	}
	

}
