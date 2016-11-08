package cn.Wolf.cores;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cn.Wolf.utils.Log;

public class WebDriverEngine {

	WebDriver driver = null;
	ElementFinder finder = null;

	
	/**
	 * 返回driver,方便其他类调用
	 * @return
	 */
	public WebDriver getDriver(){
		return this.driver;
	}
	
	
	/**
	 * 根据句柄切换windows窗口
	 * @return
	 */
	public String[] getAllWindowTitles() {
		// TODO Auto-generated method stub
	    String current = driver.getWindowHandle();

	    List<String> attributes = new ArrayList<String>();
	    for (String handle : driver.getWindowHandles()) {
	      driver.switchTo().window(handle);
	      attributes.add(driver.getTitle());
	    }

	    driver.switchTo().window(current);

	    return attributes.toArray(new String[attributes.size()]);
	}
	
	
	/**
	 * 构造方法。将浏览器的窗口最大化
	 * @param driver
	 */
	public WebDriverEngine(WebDriver driver) {
		this.driver = driver;
		driver.manage().window().maximize();
		finder = new ElementFinder(driver);
	}
	

	/**
	 * 进入Frame
	 * @param frameID
	 */
	public void enterFrame(String frameID) {
		this.pause(3000);
		driver.switchTo().frame(frameID);
		Log.info("Entered iframe " + frameID);
	}
	
	
	/**
	 * 离开Frame
	 */
	public void leaveFrame() {
		driver.switchTo().defaultContent();
		Log.info("Left the iframe");
	}
	
	
	/**
	 * 打开一个网址
	 * @param url
	 */
	public void open(String url) {

		try {
			driver.get(url);
			pause(3000);
		} catch (Exception e) {
			e.printStackTrace();

		}
		Log.info("Opened url " + url);
	}
	
	
	/**
	 * 得到标题（Title）
	 * @return
	 */
	public String getTitle() {
		return driver.getTitle();
	}
	
	
	/**
	 * 暂停等待
	 * @param time
	 */
	private void pause(int time) {
		if (time <= 0) {
			return;
		}
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	
	/**
	 * 得到页面的某些内容（常常和Assert一起用）
	 * @param pattern
	 * @return
	 */
	public boolean isTextPresent(String pattern) {

		String text = driver.getPageSource();
		text = text.trim();
		if (text.contains(pattern)) {
			return true;
		}
		return false;
	}

	
	/**
	 * 清除输入框的内容并输入值
	 * @param locator
	 * @param value
	 */
	public void typeAndClear(String locator, String value) {
		WebElement element = finder.findElement(locator);
		if (element != null) {
			element.clear();
			element.sendKeys(value);

		}
	}

	
	/**
	 * 在输入框中输入值
	 * @param locator
	 * @param value
	 */
	public void type(String locator, String value) {
		WebElement element = finder.findElement(locator);
		if (element != null) {
			element.sendKeys(value);
		}
	}

	
	/**
	 * 判断节点是否已经被选中，如果选中，返回True，否则返回False
	 * @param locator
	 * @return
	 */
	public boolean isChecked(String locator) {
		WebElement element = finder.findElement(locator);
		return element.isSelected();
	}

	
	/**
	 * 点击并暂停2秒
	 * @param locator
	 */
	public void click(String locator) {

		WebElement element = finder.findElement(locator);
		if (element != null) {
			element.click();
			this.pause(3000);
		}
	}

	
	/**
	 * 
	 * @param locator
	 */
	public void clickLonger(String locator) {

		WebElement element = finder.findElement(locator);
		if (element != null) {
			runJs("window.scrollTo(0," + element.getLocation().x + ")");
			element.click();
			this.pause(3000);
		}
	}

	
	/**
	 * 双击
	 * @param locator
	 * @throws InterruptedException
	 */
	public void doubleClick(String locator) throws InterruptedException {
		WebElement element = finder.findElement(locator);
		Actions builder = new Actions(driver);
		builder.doubleClick(element).build().perform();
	}

	
	/**
	 * 
	 * @param locator
	 */
	public void isDisplayed(String locator) {
		
		WebElement element = finder.findElement(locator);
		if (element != null) {
			System.out.println(element.isDisplayed());
		}
	}

	
	/**
	 * 
	 * @param locator
	 * @return
	 */
	public String getText(String locator) {

		return finder.findElement(locator).getText().trim();
	}

	public boolean isElementPresent(String locator) {

		WebElement element = null;
		try {
			element = finder.findElement(locator);
		} catch (Exception e) {

			Log.info(e.getMessage());
		}
		if (element != null) {
			return true;
		}
		{
			return false;
		}
	}

	public String getValue(String locator) {

		return finder.findElement(locator).getAttribute("value");
	}
	
	
	/**
	 * 获得URL
	 * @return
	 */
	public String getUrl() {
		return driver.getCurrentUrl();
	}

	
	/**
	 * 后退
	 */
	public void goBack() {
		driver.navigate().back();
	}
	
	
	/**
	 **前进
	 */
	public void goForward() {

		driver.navigate().forward();
	}

	
	/**
	 * 进入提醒框
	 * @return
	 */
	public Alert getAlert() {
		Alert alert = driver.switchTo().alert();
		return alert;
	}

	
	/**
	 * 得到下拉列表
	 * @param locator
	 * @return
	 */
	public Select getSelect(String locator) {
		Select inputSelect = new Select(finder.findElement(locator));
		return inputSelect;
	}

	
	/**
	 * 通过Value选择
	 * @param locator
	 * @param value
	 */
	public void selectByValue(String locator, String value) {
		getSelect(locator).selectByValue(value);
		this.pause(5000);
	}

	
	/**
	 * 通过VisibleText选择
	 * @param locator
	 * @param value
	 */
	public void selectByVisibleText(String locator, String value) {
		getSelect(locator).selectByVisibleText(value);
	}

	
	/**
	 * 通过Index选择
	 * @param locator
	 * @param index
	 */
	public void selectByIndex(String locator, int index) {
		getSelect(locator).selectByIndex(index);
	}

	
	/**
	 * 
	 * @return
	 */
	public String getAlertTest() {

		return getAlert().getText();
	}

	
	/**
	 * 接受提醒框
	 */
	public void alertAccept() {

		getAlert().accept();
	}

	public String getHtmlSource() {

		return driver.getPageSource();
	}

	
	/**
	 * 执行JS语句
	 * @param js
	 */
	public void runJs(String js) {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript(js);
	}

	
	/**
	 * 按下Enter键
	 */
	public void keyDown() {
		Actions action = new Actions(driver);
		action.keyDown(Keys.ENTER);
	}


}
