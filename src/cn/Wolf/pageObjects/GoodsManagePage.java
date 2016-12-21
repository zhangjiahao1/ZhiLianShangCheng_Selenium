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
public class GoodsManagePage {
	public GoodsManagePage (WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id='sidebar']/ul/li[2]/a")
	public WebElement leftButton;//左侧的商品管理按钮
	
	@FindBy(xpath = "//*[@id='sidebar']/ul/li[2]/ul/li[1]/a")
	public WebElement sonButton;//商品管理下的商品管理子按钮
	
	@FindBy(name = "name")
	public WebElement searchBox;//搜索框
	
	@FindBy(name = "minPrice")
	public WebElement min;//最低价格
	
	@FindBy(name = "maxPrice")
	public WebElement max;//最高价格
	
	@FindBy(id = "type_id")
	public WebElement searchKinds;//下拉列表
	
	@FindBy(name = "state")
	public WebElement state;//出售中
	
	@FindBy(name = "isbest")
	public WebElement isbest;//推荐商品
	
	@FindBy(name = "ishot")
	public WebElement ishot;//热销商品
	
	@FindBy(className = "btn btn-purple btn-sm")
	public WebElement searchButton;//搜索按钮
	
	@FindBy(xpath = "//*[@id='sample-table-1']/tbody/tr[1]/td[8]/div/a[1]/i")
	public WebElement chakan;//查看按钮
	
	@FindBy(xpath = "//i[contains(.,'修改')]")
	public WebElement xiugai;//修改按钮
	
	@FindBy(xpath = "//i[contains(.,'图库')]")
	public WebElement tuku;//图库按钮
	
	
	
	
	
	
	
	
	
	
}
