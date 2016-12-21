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
	public WebElement name;//�û���
	
	@FindBy(name="password")
	public WebElement password;//����
	
	@FindBy(xpath=".//*[@id='login-box']/div/div[1]/form/fieldset/div[1]/button")
	public WebElement submit ;//��½
	
	@FindBy(linkText="Ȩ�޹���")
	public WebElement quanxianguanli;//Ȩ�޹���
	
	@FindBy(linkText="Ȩ�����б�")
	public WebElement list;//Ȩ�����б�
	
	@FindBy(xpath=".//*[@id='sample-table-1']/tbody/tr[1]/td[5]/div/a[1]/i")
	public WebElement xiangqing;//Ȩ������
	
	@FindBy(xpath=".//*[@id='sample-table-1']/tbody/tr[6]/td/ul/li[2]/a")
	public WebElement pagination;//Ȩ�����б�ҳ��
	
	@FindBy(linkText="���Ȩ����")
	public WebElement add;//���Ȩ����
	
	@FindBy(xpath=".//*[@id='sample-table-1']/tbody[1]/tr[1]/td[1]/label/input")
	public WebElement control;//������
	
	@FindBy(xpath=".//*[@id='sample-table-1']/tbody[1]/tr[1]/td[2]/input[2]")
	public WebElement way;//����
	
	@FindBy(xpath=".//*[@id='sample-table-1']/thead/tr[1]/th/input")
	public WebElement listname;//Ȩ������
	
	@FindBy(xpath="xpath=.//*[@id='sample-table-1']/tbody[2]/tr/td/input")
	public WebElement button;//�ύ
	
	@FindBy(xpath=".//*[@id='sample-table-1']/tbody/tr[1]/td[5]/div/a[2]/i")
	public WebElement delate;//ɾ��
}