package cn.Wolf.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BackStorePage {
	public BackStorePage  (WebDriver driver){
		PageFactory.initElements(driver, this);
	}
//商城信息列表
	@FindBy(xpath = "//*[@id='sidebar']/ul/li[7]/a")
	public WebElement storebutton1;
	
	@FindBy(xpath = "//*[@id='sidebar']/ul/li[7]/ul/li[2]/a")
	public WebElement storebutton2;
	
//修改商城信息
	@FindBy(xpath = "//*[@id='sample-table-1']/tbody/tr[1]/td[6]/div/a/i")
	public WebElement modifybutton1;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div[2]/div[2]/div/form/div[7]/div/button[1]")
	public WebElement modifybutton2;

	@FindBy(id = "form-field-1")
	public WebElement modifyname;

	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div[2]/div[2]/div/form/div[3]/div/textarea")
	public WebElement modifybrief;

	@FindBy(id = "form-input-readonly")
	public WebElement modifyphone;
}
