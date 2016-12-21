package cn.Wolf.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BackAnnouncementPage {
	public BackAnnouncementPage  (WebDriver driver){
		PageFactory.initElements(driver, this);
	}
//公告列表
	//新闻管理
	@FindBy(xpath = "//*[@id='sidebar']/ul/li[6]/a/b")
	public WebElement button1;
	//公告列表
	@FindBy(xpath = "//*[@id='sidebar']/ul/li[6]/ul/li[1]/a")
	public WebElement button2;

//发布新闻
	//新闻标题
	@FindBy(id = "form-field-1")
	public WebElement addtitle;
	//新闻内容
	@FindBy(xpath="//*[@id='main-container']/div/div[2]/div[2]/div[2]/div/form/div[5]/div/textarea")
	public WebElement addtextarea;
	//发布新闻
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div[2]/div[1]/h1/a")
	public WebElement addbutton1;
	//新闻类型
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div[2]/div[2]/div/form/div[3]/div/input[1]")
	public WebElement addbutton2;	
	//提交
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div[2]/div[2]/div/form/div[6]/div/button[1]")
	public WebElement addbutton3;
//修改新闻
	//修改
	@FindBy(xpath = "//*[@id='sample-table-1']/tbody/tr[1]/td[9]/div/a[1]/i")
	public WebElement changebutton1;
	//新闻类型
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div[2]/div[2]/div/form/div[3]/input[1]")
	public WebElement changebutton2;
	//新闻状态״̬
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div[2]/div[2]/div/form/div[5]/input[1]")
	public WebElement changebutton3;
	//提交
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div[2]/div[2]/div/form/div[6]/div/button[1]")
	public WebElement changebutton4;
	//新闻标题
	@FindBy(id = "form-field-1")
	public WebElement changetitle;
	//新闻内容
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div[2]/div[2]/div/form/div[4]/textarea")
	public WebElement changetextarea;
	//重填
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div[2]/div[2]/div/form/div[6]/div/button[2]")
	public WebElement rewritebutton;
//删除新闻
	//删除
	@FindBy(xpath = "//*[@id='sample-table-1']/tbody/tr[1]/td[9]/div/a[2]/i")
	public WebElement deletebutton;
//复选框
	@FindBy(xpath = "//*[@id='sample-table-1']/thead/tr/th[1]/label/input")
	public WebElement checkboxbutton;
//页码
	@FindBy(xpath = "//*[@id='sample-table-1']/tbody/tr[4]/td/ul/li[3]/a")
	public WebElement nextbutton;
	
	
}
