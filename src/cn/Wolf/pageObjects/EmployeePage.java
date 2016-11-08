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
	public WebElement username_search;//�û���������
	
	@FindBy(name = "state")
	public WebElement state;//״̬�����б�
	
	@FindBy(className = "btn btn-purple btn-sm")
	public WebElement SearchButton;//������ť
	
	/*****************************************************************/
	@FindBy(linkText = "���Ա��")
	public WebElement addEmployee;//���Ա������
	
	/*****************************************************************/
	@FindBy(linkText = "�༭")
	public WebElement bianji;//�༭����
	
	/*****************************************************************/
	@FindBy(linkText = "�޸�����")
	public WebElement xiugaimima;//�޸���������
	
	/*****************************************************************/
	@FindBy(linkText = "�鿴��")
	public WebElement chakanzu;//�鿴������
	
	/*****************************************************************/
	@FindBy(linkText = "ɾ��")
	public WebElement delete;//ɾ������
	
	
	
	
	
	
}
