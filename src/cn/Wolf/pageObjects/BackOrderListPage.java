package cn.Wolf.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BackOrderListPage {
	public BackOrderListPage (WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	//订单管理
	@FindBy(xpath=".//*[@id='sidebar']/ul/li[3]/a")
	public WebElement managebutton;
	
	//订单列表
	@FindBy(xpath=".//*[@id='sidebar']/ul/li[3]/ul/li/a")
	public WebElement listbutton;
	
	//修改
	@FindBy(xpath=".//*[@id='sample-table-1']/tbody/tr[1]/td[11]/div/a[1]")
	public WebElement changebutton;
	
	@FindBy(id="form-field-1")
	public WebElement name;
	
	@FindBy(id="address")
	public WebElement address;
	
	@FindBy(xpath=".//*[@id='code']")
	public WebElement zipcode;
	
	@FindBy(id="mobile")
	public WebElement tel;
	
	@FindBy(id="form-field-2")
	public WebElement price;
	
	//提交
	@FindBy(xpath=".//*[@id='sub']")
	public WebElement commitbutton;
	
	//详情
	@FindBy(xpath=".//*[@id='sample-table-1']/tbody/tr[1]/td[11]/div/a[2]/i")
	public WebElement detailbutton;
	
	@FindBy(xpath=".//*[@id='main-container']/div/div[3]/div[2]/div[1]/h1/a")
	public WebElement backbutton;
	
	
	//删除
	@FindBy(xpath=".//*[@id='sample-table-1']/tbody/tr[1]/td[11]/div/a[3]")
	public WebElement deletebutton;
	
	//页码1
	@FindBy(xpath=".//*[@id='sample-table-1']/tbody/tr[2]/td/ul/li[2]/a")
	public WebElement numberbutton1;
	
	//页码2
	@FindBy(xpath=".//*[@id='sample-table-1']/tbody/tr[2]/td/ul/li[2]/a")
	public WebElement numberbutton2;
}
