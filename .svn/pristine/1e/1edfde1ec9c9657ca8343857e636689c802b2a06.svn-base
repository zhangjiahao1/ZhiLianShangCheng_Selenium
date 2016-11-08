package cn.Wolf.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoodsManagePage {
	public GoodsManagePage (WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "添加商品")
	public WebElement addGoods;//添加商品链接
	
	@FindBy(name = "name")
	public WebElement goodsName;//商品名
	
	@FindBy(name = "minPrice")
	public WebElement minPrice;//价格大于
	
	@FindBy(name = "maxPrice")
	public WebElement maxPrice;//价格小于
	
	@FindBy(name = "type_id")
	public WebElement kindsList;//种类选择下拉框
	
	@FindBy(name = "state")
	public WebElement state;//出售中
	
	@FindBy(name = "isbest")
	public WebElement isbest;//推荐商品
	
	@FindBy(name = "ishot")
	public WebElement ishot;//热销商品
	
	@FindBy(className = "btn btn-purple btn-sm")
	public WebElement SearchButton;//搜索按钮
	
	/*****************************************************************/
	@FindBy(linkText = "查看")
	public WebElement chakan;//查看链接
	
	/*****************************************************************/
	@FindBy(linkText = "修改")
	public WebElement xiugai;//修改链接
	
	/*****************************************************************/
	@FindBy(linkText = "图库")
	public WebElement tuku;//图库链接
	
	/*****************************************************************/
	@FindBy(linkText = "删除")
	public WebElement delete;//删除链接
	
}
