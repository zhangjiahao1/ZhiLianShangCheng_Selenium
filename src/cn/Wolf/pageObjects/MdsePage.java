package cn.Wolf.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MdsePage {
	public  MdsePage (WebDriver driver){
		PageFactory.initElements(driver, this);
	}
        //
	@FindBy(name = "name")
	public WebElement name;//用户名
	
	@FindBy(name = "password")
	public WebElement password;//密码
	
	@FindBy(xpath =" //*[@id='login-box']/div/div[1]/form/fieldset/div[1]/button")
	public WebElement commit;//登录
	
	@FindBy(linkText = "商品管理")
	public WebElement inmanage;//进入商品管理
	
	/*****************************************************************/
	@FindBy(linkText = "商品类别")
	public WebElement inlei;//进入商品类别
	
	
	@FindBy(xpath="//*[@id='sample-table-1']/tbody/tr[1]/td[6]/div/a[1]/i")
	public WebElement click;//点击添加商品
	
	@FindBy(id="form-field-1")
	public WebElement addlei;//添加子类
	
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement tijiao;//提交
	
	@FindBy(xpath="//*[@id='sample-table-1']/tbody/tr[1]/td[6]/div/a[2]/i")
	public WebElement clickxiugai;//点击修改子类
	
	@FindBy(xpath="//*[@id='form-field-1']")
	public WebElement addlei2;//修改子类
	
	@FindBy(id="form-field-1")
	public WebElement xiugailei;//修改子类
	
	
	
	@FindBy(xpath="//*[@id='sample-table-1']/tbody/tr[1]/td[3]/input")
	public WebElement reinput;//重新输入序号
	
	
	/*****************************************************************/
	@FindBy(linkText = "商品品牌")
	public WebElement inBrand;//进入商品品牌
	//添加品牌
	@FindBy(xpath="//*[@id='main-container']/div/div[2]/div[2]/div[1]/h1/a")
	public WebElement Bclick;//点击添加品牌
	
//修改品牌
	@FindBy(xpath="//*[@id='sample-table-1']/tbody/tr[1]/td[7]/div/a[1]/i")
	public WebElement Bxclick;//点击修改品牌
	
	@FindBy(name="order")
	public WebElement xiugaipin;//
//翻页
	@FindBy(className = "next")
	public WebElement fanye;//点击翻页
	
	
	
	/*****************************************************************/
	
	@FindBy(linkText = "商品属性")
	public WebElement inquality;//进入商品属性
	
	@FindBy(xpath="//*[@id='main-container']/div/div[2]/div[2]/div[1]/h1/a")
	public WebElement addquality;
	
	
	@FindBy(name = "attrname")
	public WebElement quaname;//添加属性名
	
	@FindBy(name = "attrvalue")
	public WebElement quavalue;//添加属性
	
	@FindBy(xpath="//*[@id='sample-table-1']/tbody/tr[1]/td[4]/div/a[1]/i")
	public WebElement xiugai;
	
	
}