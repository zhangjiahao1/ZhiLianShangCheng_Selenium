package cn.Wolf.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BackCommentListPage {
	public BackCommentListPage (WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	//���۹���
	@FindBy(xpath=".//*[@id='sidebar']/ul/li[4]/a")
	public WebElement managebutton;
	
	//�����б�
	@FindBy(xpath=".//*[@id='sidebar']/ul/li[4]/ul/li/a")
	public WebElement listbutton;
	
	//�ظ�
	@FindBy(xpath=".//*[@id='sample-table-1']/tbody/tr[1]/td[12]/div/a[1]/i")
	public WebElement replybutton;
	
	@FindBy(xpath=".//*[@id='form-input-readonly']")
	public WebElement write;
	
	@FindBy(xpath=".//*[@id='main-container']/div/div[2]/div[2]/div[2]/div/form/div[3]/div/button[2]")
	public WebElement refillbutton;
	
	@FindBy(xpath=".//*[@id='main-container']/div/div[2]/div[2]/div[2]/div/form/div[3]/div/button[1]")
	public WebElement commitbutton;
	
	//ɾ��
	@FindBy(xpath=".//*[@id='sample-table-1']/tbody/tr[3]/td[12]/div/a[2]")
	public WebElement deletebutton;
	
	//ҳ��
	@FindBy(xpath=".//*[@id='sample-table-1']/tbody/tr[6]/td/ul/li[2]/a")
	public WebElement numberbutton1;
	
	@FindBy(xpath=".//*[@id='sample-table-1']/tbody/tr[6]/td/ul/li[1]/a")
	public WebElement numberbutton2;
	
	//��ѡ��
	@FindBy(xpath=".//*[@id='sample-table-1']/thead/tr/th[1]/label/input")
	public WebElement boxesbutton1;
	
	@FindBy(xpath=".//*[@id='sample-table-1']/thead/tr/th[1]/label/input")
	public WebElement boxesbutton2;
	
	@FindBy(xpath=".//*[@id='sample-table-1']/tbody/tr[1]/td[1]/label/input")
	public WebElement boxbutton1;
	
	@FindBy(xpath=".//*[@id='sample-table-1']/tbody/tr[1]/td[1]/label/input")
	public WebElement boxbutton2;
}
