package cn.Wolf.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BackMessagePage {
	public BackMessagePage   (WebDriver driver){
		PageFactory.initElements(driver, this);
	}
//消息列表
	@FindBy(xpath = "//*[@id='sidebar']/ul/li[6]/a/b")
	public WebElement messagebutton1;
	
	@FindBy(xpath = "//*[@id='sidebar']/ul/li[6]/ul/li[2]/a")
	public WebElement messagebutton2;
}
