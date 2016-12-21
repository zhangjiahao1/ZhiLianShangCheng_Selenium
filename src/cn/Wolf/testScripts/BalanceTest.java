package cn.Wolf.testScripts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import cn.Wolf.appModules.LoginModule;

public class BalanceTest {
	@Test
	public void test1() throws InterruptedException {
		WebDriver ff = new FirefoxDriver();
		ff.get("http://localhost:8032/zl_shop/index.php/Login/login");
		ff.manage().window().maximize();
		Thread.sleep(3000);
		ff.findElement(By.name("username")).sendKeys("zhangjiahao1");
		ff.findElement(By.name("password")).sendKeys("123456789");
		ff.findElement(By.className("sub")).click();
		Thread.sleep(3000);
		
		ff.quit();
	}
}
