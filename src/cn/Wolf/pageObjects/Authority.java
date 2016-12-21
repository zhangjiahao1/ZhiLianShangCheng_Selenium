package cn.Wolf.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Authority {
	public Authority (WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	@FindBy(className = "form-control")
	public WebElement name;//用户名
	
	@FindBy(name="password")
	public WebElement password;//密码
	
	@FindBy(xpath=".//*[@id='login-box']/div/div[1]/form/fieldset/div[1]/button")
	public WebElement submit ;//登陆
	
	@FindBy(linkText="权限管理")
	public WebElement quanxianguanli;//权限管理
	
	@FindBy(linkText="权限组列表")
	public WebElement list;//权限组列表
	
	@FindBy(xpath=".//*[@id='sample-table-1']/tbody/tr[1]/td[5]/div/a[1]/i")
	public WebElement xiangqing;//权限详情
	
	@FindBy(xpath=".//*[@id='sample-table-1']/tbody/tr[6]/td/ul/li[2]/a")
	public WebElement pagination;//权限组列表页码
	
	@FindBy(linkText="添加权限组")
	public WebElement add;//添加权限组
	
	@FindBy(xpath=".//*[@id='sample-table-1']/tbody[1]/tr[1]/td[1]/label/input")
	public WebElement control;//控制器
	
	@FindBy(xpath=".//*[@id='sample-table-1']/tbody[1]/tr[1]/td[2]/input[2]")
	public WebElement way;//方法
	
	@FindBy(xpath=".//*[@id='sample-table-1']/thead/tr[1]/th/input")
	public WebElement listname;//权限组名
	
	@FindBy(xpath="xpath=.//*[@id='sample-table-1']/tbody[2]/tr/td/input")
	public WebElement button;//提交
	
	@FindBy(xpath=".//*[@id='sample-table-1']/tbody/tr[1]/td[5]/div/a[2]/i")
	public WebElement delate;//删除
}