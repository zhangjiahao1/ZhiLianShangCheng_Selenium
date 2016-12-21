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
	 * 退出
	 */
	public void exit(){
		this.driver = driver;
		driver.quit();
	}
	
	/**
	 * 鼠标悬浮
	 * @param locator
	 * @throws InterruptedException
	 */
	public void mouseoverElement(String locator) throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(finder.findElement(locator)).perform();
	}
		
		
	/**
	 * 选择窗口
	 * @param i
	 */
	public void switchWidow(int i){
	    List<String> windows = new ArrayList<String>();
	    for (String handle : driver.getWindowHandles()) {
	    
	    	windows.add(handle);
	    }
	    driver.switchTo().window(windows.get(i));
	}
	
	
	/**
	 * 右键
	 * @param locator
	 * @throws InterruptedException
	 */
	public void rightClickMouse(String locator) throws InterruptedException {
		Actions action = new Actions(driver);
		action.contextClick(finder.findElement(locator)).perform();
		}
   
	
	/**
	 * 上传文件
	 * @param locator
	 * @param path
	 */
	public void send(String locator, String path){
		WebElement element = finder.findElement(locator);
		element.sendKeys(path);
	}
	
	
	/**
	 * 得到本类的驱动
	 * @return
	 */
	public WebDriver getDriver(){
		return this.driver;
	}
	
	
	/**
	 * 得到窗口的Titles
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
	 * 将窗口放大
	 * @param driver
	 */
	public WebDriverEngine(WebDriver driver) {
		this.driver = driver;
		driver.manage().window().maximize();
		finder = new ElementFinder(driver);
	}
	

	/**
	 * 进入Frame页面
	 * @param frameID
	 */
	public void enterFrame(String frameID) {
		this.pause(3000);
		driver.switchTo().frame(frameID);
		Log.info("Entered iframe " + frameID);
	}
	
	
	/**
	 * 离开Frame页面
	 */
	public void leaveFrame() {
		driver.switchTo().defaultContent();
		Log.info("Left the iframe");
	}
	
	
	/**
	 * 打开一个页面
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
	 * 得到Title
	 * @return
	 */
	public String getTitle() {
		return driver.getTitle();
	}
	
	
	/**
	 * 暂停
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
	 * 验证源码中是否有该有的文字
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
	 * 清空&键入文字
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
	 * 键入文字
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
	 * 判断是否已经被选中
	 * @param locator
	 * @return
	 */
	public boolean isChecked(String locator) {
		WebElement element = finder.findElement(locator);
		return element.isSelected();
	}

	
	/**
	 * 点击操作
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
	 * 按住左键
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
	 * 得到文本信息
	 * @param locator
	 * @return
	 */
	public String getText(String locator) {

		return finder.findElement(locator).getText().trim();
	}
	
	
	/**
	 * 
	 * @param locator
	 * @return
	 */
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
	
	
	/**
	 * 得到属性值
	 * @param locator
	 * @return
	 */
	public String getValue(String locator) {

		return finder.findElement(locator).getAttribute("value");
	}
	
	
	/**
	 * 得到URL
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
	 * 前进
	 */
	public void goForward() {

		driver.navigate().forward();
	}

	
	/**
	 * 接受Alert
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
	 * 通过Value值来选择
	 * @param locator
	 * @param value
	 */
	public void selectByValue(String locator, String value) {
		getSelect(locator).selectByValue(value);
		this.pause(5000);
	}

	
	/**
	 * 通过Text值来选择
	 * @param locator
	 * @param value
	 */
	public void selectByVisibleText(String locator, String value) {
		getSelect(locator).selectByVisibleText(value);
	}

	
	/**
	 * 通过Index值来选择
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
	 * 接受Alert框
	 */
	public void alertAccept() {

		getAlert().accept();
	}

	public String getHtmlSource() {

		return driver.getPageSource();
	}

	
	/**
	 * run JS
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
