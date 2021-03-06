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
public class LoginBackPage {
	public LoginBackPage (WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	@FindBy(name = "name")
	public WebElement username;
	
	@FindBy(name = "password")
	public WebElement password;
	
	@FindBy(xpath = "//*[@id='login-box']/div/div[1]/form/fieldset/div[1]/button")
	public WebElement button;
	
	@FindBy(xpath = "//*[@id='sidebar']/ul/li[2]/a")
	public WebElement GoodsManage;
	
	@FindBy(xpath = "//*[@id='sidebar']/ul/li[2]/ul/li[1]/a")
	public WebElement GoodsManage1;
	
	@FindBy(name = "type_id")
	public WebElement list;
	
	@FindBy(linkText = "添加商品")
	public WebElement Goods;
	
}
