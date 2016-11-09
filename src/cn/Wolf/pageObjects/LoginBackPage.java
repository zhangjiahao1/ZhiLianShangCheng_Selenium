package cn.Wolf.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	
	
}
