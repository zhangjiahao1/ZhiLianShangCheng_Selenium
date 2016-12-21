package cn.Wolf.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BackCommentListPage {
	public BackCommentListPage (WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	//评论管理
	@FindBy(xpath=".//*[@id='sidebar']/ul/li[4]/a")
	public WebElement managebutton;
	
	//评论列表
	@FindBy(xpath=".//*[@id='sidebar']/ul/li[4]/ul/li/a")
	public WebElement listbutton;
	
	//回复
	@FindBy(xpath=".//*[@id='sample-table-1']/tbody/tr[1]/td[12]/div/a[1]")
	public WebElement replybutton;
	
	//填写
	@FindBy(xpath=".//*[@id='form-input-readonly']")
	public WebElement write;
	
	//重填
	@FindBy(xpath=".//*[@id='main-container']/div/div[2]/div[2]/div[2]/div/form/div[3]/div/button[2]")
	public WebElement refillbutton;
	
	//提交
	@FindBy(xpath=".//*[@id='main-container']/div/div[2]/div[2]/div[2]/div/form/div[3]/div/button[1]")
	public WebElement commitbutton;
	
	//删除
	@FindBy(xpath=".//*[@id='sample-table-1']/tbody/tr[1]/td[12]/div/a[2]")
	public WebElement deletebutton;
	
	//复选框
	@FindBy(xpath=".//*[@id='sample-table-1']/thead/tr/th[1]/label/input")
	public WebElement boxesbutton1;
	
	@FindBy(xpath=".//*[@id='sample-table-1']/thead/tr/th[1]/label/input")
	public WebElement boxesbutton2;
	
	@FindBy(xpath=".//*[@id='sample-table-1']/tbody/tr[2]/td[1]/label/input")
	public WebElement boxbutton1;
	
	@FindBy(xpath=".//*[@id='sample-table-1']/tbody/tr[2]/td[1]/label/input")
	public WebElement boxbutton2;
}
