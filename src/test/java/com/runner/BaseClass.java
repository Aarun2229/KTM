package com.runner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.Select;
public class BaseClass 
{
	public static WebDriver driver;
	public static WebDriver launchBrowser() {
		if(driver==null) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\cucumber\\newdriver\\chromedriver.exe");
		
		 driver= new ChromeDriver();
		 }
		return driver;
	}
	public static void url(String url) {
		driver.get(url);
	}
	public static  void waits() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	public static void max() {
		driver.manage().window().maximize();
	}
	public  static void insert(WebElement e,String s) {
		e.sendKeys(s);
	}
	public  static void click(WebElement e) {
		e.click();
	}
	public  static void dropDown(WebElement e, String i) {
		Select s= new Select(e);
		s.selectByValue(i);
	}
	public  static void getVal(WebElement e) {
		String string = e.getAttribute("value");
		System.out.println(string);
     
	}
	public static void alertOk() 
	{
	Alert alert = driver.switchTo().alert();
	alert.accept();
	}
	public static void quitDriver() {
		driver.quit();
	}
}
