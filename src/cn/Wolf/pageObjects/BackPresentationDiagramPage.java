package cn.Wolf.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BackPresentationDiagramPage {
	public BackPresentationDiagramPage   (WebDriver driver){
		PageFactory.initElements(driver, this);
	}
//չʾͼ�б�
	@FindBy(xpath = "//*[@id='sidebar']/ul/li[7]/a")
	public WebElement pdbutton1;
	@FindBy(xpath = "//*[@id='sidebar']/ul/li[7]/ul/li[1]/a")
	public WebElement pdbutton2;
//����Ϊ�����
	@FindBy(xpath = "//*[@id='sample-table-1']/tbody/tr[1]/td[9]/div/p[2]/a/i")
	public WebElement newbutton;	
		
//����Ϊ�ѷ���
	@FindBy(xpath = "//*[@id='sample-table-1']/tbody/tr[1]/td[9]/div/p[3]/a/i")
	public WebElement releasedbutton;
		
//����Ϊ�ѹ���
	@FindBy(xpath = "//*[@id='sample-table-1']/tbody/tr[1]/td[9]/div/p[4]/a/i")
	public WebElement expiredbutton;
	
//���չʾͼ
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div[2]/div[1]/h1/a")
	public WebElement addpdbutton1;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div[2]/div[2]/div/form/div[4]/div/button[1]")
	public WebElement addpdbutton2;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div[2]/div[2]/div/form/div[1]/div/input")
	public WebElement pdtitle;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div[2]/div[2]/div/form/div[2]/div/input")
	public WebElement pdlink;
	
	@FindBy(xpath = "//*[@id='main-container']/div/div[2]/div[2]/div[2]/div/form/div[3]/div/input")
	public WebElement pdpicture;
}
