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
/**
 * 
 * @author 张佳浩
 *
 */
public class WebDriverEngine2 {

	WebDriver driver = null;
	ElementFinder finder = null;
	
	
	/**
	 * �����������ñ����driver
	 * @return
	 */
	public WebDriver getDriver(){
		return this.driver;
	}
	
	/**
	 * ���ݾ���л�windows����
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
	 * ���췽������������Ĵ������
	 * @param driver
	 */
	public WebDriverEngine2(WebDriver driver) {
		this.driver = driver;
		driver.manage().window().maximize();
		finder = new ElementFinder(driver);
	}
	

	/**
	 * ����Frame
	 * @param frameID
	 */
	public void enterFrame(String frameID) {
		this.pause(3000);
		driver.switchTo().frame(frameID);
		Log.info("Entered iframe " + frameID);
	}
	
	
	/**
	 * �뿪Frame
	 */
	public void leaveFrame() {
		driver.switchTo().defaultContent();
		Log.info("Left the iframe");
	}
	
	
	/**
	 * ��һ����ַ
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
	 * �õ����⣨Title��
	 * @return
	 */
	public String getTitle() {
		return driver.getTitle();
	}
	
	
	/**
	 * ��ͣ�ȴ�
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
	 * �õ�ҳ���ĳЩ���ݣ�������Assertһ���ã�
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
	 * ������������ݲ�����ֵ
	 * @param locator
	 * @param value
	 */
	public void typeAndClear(WebElement Keyword, String value) {
		WebElement element = Keyword;
		if (element != null) {
			element.clear();
			element.sendKeys(value);

		}
	}

	
	/**
	 * �������������ֵ
	 * @param locator
	 * @param value
	 */
	public void type(WebElement Keyword, String value) {
		WebElement element = Keyword;
		if (element != null) {
			element.sendKeys(value);
		}
	}

	
	/**
	 * �жϽڵ��Ƿ��Ѿ���ѡ�У����ѡ�У�����True�����򷵻�False
	 * @param locator
	 * @return
	 */
	public boolean isChecked(WebElement Keyword) {
		WebElement element = Keyword;
		return element.isSelected();
	}

	
	/**
	 * �������ͣ2��
	 * @param locator
	 */
	public void click(WebElement Keyword) {

		WebElement element = Keyword;
		if (element != null) {
			element.click();
			this.pause(3000);
		}
	}

	
	/**
	 * 
	 * @param locator
	 */
	public void clickLonger(WebElement Keyword) {

		WebElement element = Keyword;
		if (element != null) {
			runJs("window.scrollTo(0," + element.getLocation().x + ")");
			element.click();
			this.pause(3000);
		}
	}

	
	/**
	 * ˫��
	 * @param locator
	 * @throws InterruptedException
	 */
	public void doubleClick(WebElement Keyword) throws InterruptedException {
		WebElement element = Keyword;
		Actions builder = new Actions(driver);
		builder.doubleClick(element).build().perform();
	}

	
	/**
	 * 
	 * @param locator
	 */
	public void isDisplayed(WebElement Keyword) {
		
		WebElement element = Keyword;
		if (element != null) {
			System.out.println(element.isDisplayed());
		}
	}

	
	/**
	 * 
	 * @param locator
	 * @return
	 */
	public String getText(WebElement Keyword) {

		return Keyword.getText().trim();
	}

	public boolean isElementPresent(WebElement Keyword) {

		WebElement element = null;
		try {
			element = Keyword;
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

	public String getValue(WebElement Keyword) {

		return Keyword.getAttribute("value");
	}
	
	
	/**
	 * ���URL
	 * @return
	 */
	public String getUrl() {
		return driver.getCurrentUrl();
	}

	
	/**
	 * ����
	 */
	public void goBack() {
		driver.navigate().back();
	}
	
	
	/**
	 **ǰ��
	 */
	public void goForward() {

		driver.navigate().forward();
	}

	
	/**
	 * �������ѿ�
	 * @return
	 */
	public Alert getAlert() {
		Alert alert = driver.switchTo().alert();
		return alert;
	}

	
	/**
	 * �õ������б�
	 * @param locator
	 * @return
	 */
	public Select getSelect(WebElement Keyword) {
		Select inputSelect = new Select(Keyword);
		return inputSelect;
	}

	
	/**
	 * ͨ��Valueѡ��
	 * @param locator
	 * @param value
	 */
	public void selectByValue(WebElement Keyword, String value) {
		getSelect(Keyword).selectByValue(value);
		this.pause(5000);
	}

	
	/**
	 * ͨ��VisibleTextѡ��
	 * @param locator
	 * @param value
	 */
	public void selectByVisibleText(WebElement Keyword, String value) {
		getSelect(Keyword).selectByVisibleText(value);
	}

	
	/**
	 * ͨ��Indexѡ��
	 * @param locator
	 * @param index
	 */
	public void selectByIndex(WebElement Keyword, int index) {
		getSelect(Keyword).selectByIndex(index);
	}

	
	/**
	 * 
	 * @return
	 */
	public String getAlertTest() {

		return getAlert().getText();
	}

	
	/**
	 * �������ѿ�
	 */
	public void alertAccept() {

		getAlert().accept();
	}

	public String getHtmlSource() {

		return driver.getPageSource();
	}

	
	/**
	 * ִ��JS���
	 * @param js
	 */
	public void runJs(String js) {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript(js);
	}

	
	/**
	 * ����**��
	 */
	public void keyDown() {
		Actions action = new Actions(driver);
		action.keyDown(Keys.ENTER);
	}
	
	//�������
			public void mouseoverElement(String locator) throws InterruptedException {
				Actions action = new Actions(driver);
				action.moveToElement(finder.findElement(locator)).perform();
			}
			//ѡ�񴰿�
			public void switchWidow(int i){
			    List<String> windows = new ArrayList<String>();
			    for (String handle : driver.getWindowHandles()) {
			    
			    	windows.add(handle);
			    }
			    driver.switchTo().window(windows.get(i));
			}
			//�Ҽ�
			public void rightClickMouse(String locator) throws InterruptedException {
				Actions action = new Actions(driver);
				action.contextClick(finder.findElement(locator)).perform();
				}



}
