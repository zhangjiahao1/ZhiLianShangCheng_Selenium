package cn.Wolf.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BackMallPage {
	public BackMallPage  (WebDriver driver){
		PageFactory.initElements(driver, this);
	}
//商城信息
	//商城设置
	@FindBy(xpath = "//*[@id='sidebar']/ul/li[7]/a")
	public WebElement storebutton1;
	//商城信息
	@FindBy(xpath = "//*[@id='sidebar']/ul/li[7]/ul/li[2]/a")
	public WebElement storebutton2;
//	修改商城信息
	//修改
	@FindBy(xpath = "//*[@id='sample-table-1']/tbody/tr[1]/td[6]/div/a/i")
	public WebElement modifybutton1;
	//提交
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div[2]/div[2]/div/form/div[7]/div/button[1]")
	public WebElement modifybutton2;
    //商城名
	@FindBy(id = "form-field-1")
	public WebElement modifyname;
    //商城简介
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div[2]/div[2]/div/form/div[3]/div/textarea")
	public WebElement modifybrief;
    //联系电话
	@FindBy(id = "form-input-readonly")
	public WebElement modifyphone;
}
