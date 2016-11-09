package cn.Wolf.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BackOrderListPage {
	public BackOrderListPage (WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	//¶©µ¥¹ÜÀí
	@FindBy(xpath=".//*[@id='sidebar']/ul/li[3]/a")
	public WebElement managebutton;
	
	//¶©µ¥ÁÐ±í
	@FindBy(xpath=".//*[@id='sidebar']/ul/li[3]/ul/li/a")
	public WebElement listbutton;
	
	//ÐÞ¸Ä
	@FindBy(xpath=".//*[@id='sample-table-1']/tbody/tr[1]/td[11]/div/a[1]/i")
	public WebElement changebutton;
	
	@FindBy(id="form-field-1")
	public WebElement name;
	
	@FindBy(id="address")
	public WebElement address;
	
	@FindBy(xpath=".//*[@id='main-container']/div/div[2]/div[2]/div[2]/div/form/div[9]/div/button[2]")
	public WebElement refillbutton;
	
	@FindBy(xpath=".//*[@id='code']")
	public WebElement zipcode;
	
	@FindBy(id="mobile")
	public WebElement tel;
	
	@FindBy(id="form-field-2")
	public WebElement price;
	
	@FindBy(xpath=".//*[@id='sub']")
	public WebElement commitbutton;
	
	//ÏêÇé
	@FindBy(xpath=".//*[@id='sample-table-1']/tbody/tr[1]/td[11]/div/a[2]")
	public WebElement detailbutton;
	
	
	//É¾³ý
	@FindBy(xpath=".//*[@id='sample-table-1']/tbody/tr[1]/td[11]/div/a[3]/i")
	public WebElement deletebutton;
	
	//Ò³Âë1
	@FindBy(xpath="xpath=.//*[@id='sample-table-1']/tbody/tr[2]/td/ul/li[2]/a")
	public WebElement numberbutton1;
	
	//Ò³Âë2
	@FindBy(xpath=".//*[@id='sample-table-1']/tbody/tr[2]/td/ul/li[10]/a")
	public WebElement numberbutton2;
}
