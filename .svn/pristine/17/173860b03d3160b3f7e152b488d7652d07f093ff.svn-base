package cn.Wolf.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeePage {
	public EmployeePage (WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className = "username_search")
	public WebElement username_search;//用户名搜索框
	
	@FindBy(name = "state")
	public WebElement state;//状态下拉列表
	
	@FindBy(className = "btn btn-purple btn-sm")
	public WebElement SearchButton;//搜索按钮
	
	/*****************************************************************/
	@FindBy(linkText = "添加员工")
	public WebElement addEmployee;//添加员工链接
	
	/*****************************************************************/
	@FindBy(linkText = "编辑")
	public WebElement bianji;//编辑链接
	
	/*****************************************************************/
	@FindBy(linkText = "修改密码")
	public WebElement xiugaimima;//修改密码链接
	
	/*****************************************************************/
	@FindBy(linkText = "查看组")
	public WebElement chakanzu;//查看组链接
	
	/*****************************************************************/
	@FindBy(linkText = "删除")
	public WebElement delete;//删除链接
	
	
	
	
	
	
}
