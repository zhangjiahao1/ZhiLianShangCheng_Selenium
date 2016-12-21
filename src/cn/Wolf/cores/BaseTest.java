package cn.Wolf.cores;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import cn.Wolf.utils.Log;

public class BaseTest {

	
	public Checker check;//前台检查点
	public Checker check2;//后台检查点
	public WaitUtil wait;//智能等待
	public RobotExp robot;
	private WebDriver driver;
	public String driverType;
	public static WebDriverEngine front;//前台驱动
	public static WebDriverEngine2 back;//后台驱动
	public WebDriverEngine pageObject;
	public static Properties conf = null;
	public final static String DATA_ROOT = "data";
	public final static String CONF_PATH = "conf/config.properties";
	
	/**
	 * 判断driver的类型（火狐、谷歌、IE）
	 * @param driverType
	 * @return
	 */
	private WebDriver newWebDriver(String driverType) {
		WebDriver driver = null;
		if (driverType.equalsIgnoreCase("firefox")) {
			String firefox_path = getCfgProperty("firefox_path");
			System.setProperty("webdriver.firefox.bin", firefox_path);
			driver = new FirefoxDriver();
			Log.info("Using Firefox");
		}else if (driverType.equalsIgnoreCase("ie")) {
			String ie_path = getCfgProperty("chrome_path");
			System.setProperty("webdriver.ie.driver",ie_path);
			DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
			ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
			driver = new InternetExplorerDriver(ieCapabilities);
			Log.info("Using IE");
		}else if (driverType.equalsIgnoreCase("chrome")) {
			String chrome_path = getCfgProperty("chrome_path");
			System.setProperty("webdriver.chrome.driver",chrome_path);
			driver = new ChromeDriver();
			Log.info("Using Chrome");
		}else{
			return null;
	}
		return driver;
}

	public static void loadConfig() throws IOException {
		conf = new Properties();
		InputStream is = new BufferedInputStream(new FileInputStream(CONF_PATH));
		conf.load(is);
	}

	public static String getCfgProperty(String key) {

		if (null == conf) {
			try {
				loadConfig();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		if (null == conf.getProperty(key)) {
			return "";
		}
		return conf.getProperty(key);
	}

	
	/**
	 * 返回日期
	 * @return
	 */
	public String getDate(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd-HHmmss");
		String time = sdf.format(new Date());
		return time;
	}
	
	
	/**
	 * 截屏
	 */
	public void screenShot() {

		String dir_name = getCfgProperty("screen_name");
		
		try {
			File source_file = ((TakesScreenshot) driver)
					.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source_file, new File(dir_name + File.separator
					+ getDate() + ".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	@BeforeTest
	public void doBeforeMethod() throws Exception {
		driverType=getCfgProperty("driverType");
		driver = this.newWebDriver(driverType);
		Log.info(driverType);
		front = new WebDriverEngine(driver);
		back = new WebDriverEngine2(driver);
		check=new Checker(front);
		check2=new Checker(back);
		robot = new RobotExp();
		
	}

	@AfterTest
	public void doAfterMethod() {
		if(this.driver != null){
			this.driver.quit();
		}
		Log.info("Quitted Browser");
	}
	

}
