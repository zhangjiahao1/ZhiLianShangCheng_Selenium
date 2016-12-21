package cn.Wolf.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * 
 * @author 张佳浩
 *
 */
public class EmployeePage {
	public EmployeePage (WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id='sidebar']/ul/li[1]/ul/li[1]/a")
	public WebElement sonButton;//员工列表按钮
	
	@FindBy(xpath = "//*[@id='sidebar']/ul/li[1]/a") 
	public WebElement leftButton;//用户管理按钮
	
	@FindBy(className = "username_search")
	public WebElement username_search;//用户名输入框
	
	@FindBy(name = "state")
	public WebElement state;//状态下拉列表
	
	@FindBy(xpath = "//button[contains(.,'Search')]")
	public WebElement SearchButton;//搜索按钮
	
	
	/*****************************************************************/
	@FindBy(linkText = "添加员工")
	public WebElement addEmployee;//添加员工
	
	/*****************************************************************/
	@FindBy(linkText = "编辑")
	public WebElement bianji;//编辑按钮
	
	/*****************************************************************/
	@FindBy(linkText = "修改密码")
	public WebElement xiugaimima;//修改密码
	
	/*****************************************************************/
	@FindBy(linkText = "查看组")
	public WebElement chakanzu;//查看组
	
	/*****************************************************************/
	@FindBy(linkText = "删除")
	public WebElement delete;//删除
	
	
	
	
	
	
}
