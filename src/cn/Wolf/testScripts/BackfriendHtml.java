package cn.Wolf.testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import cn.Wolf.pageObjects.BackCommentListPage;
/**
 * 
 * @������
 * ��̨��������ģ�����
 *
 */
public class BackfriendHtml {
	@Test
	//�������
	public void test1() throws InterruptedException {
		WebDriver ff = new FirefoxDriver();
		ff.get("http://localhost:8032/zl_shop/admin.php/Login/index.html");
		ff.manage().window().maximize();
		Thread.sleep(1000);
		ff.findElement(By.name("name")).sendKeys("admin");
		ff.findElement(By.name("password")).sendKeys("admin");
		ff.findElement(By.xpath("//*[@id='login-box']/div/div[1]/form/fieldset/div[1]/button")).click();
		Thread.sleep(5000);
		ff.findElement(By.linkText("��������")).click();
		Thread.sleep(1000);
		ff.findElement(By.linkText("�����������")).click();
		Thread.sleep(1000);
		ff.findElement(By.name("linkname")).sendKeys("�ٶ�1231");
		ff.findElement(By.name("linkaddress")).sendKeys("www.baidu.com");
		ff.findElement(By.name("pic")).sendKeys("F:\\ͼ����Ƶ\\ͼƬ\\WallPaper\\50211.jpg");
		Thread.sleep(1000);
		ff.findElement(By.xpath("//*[@id='main-container']/div[1]/div[2]/div[2]/div[2]/div[1]/form/div[6]/div[1]/input[1]")).click();
		Thread.sleep(1000);
		ff.findElement(By.xpath("//*[@id='main-container']/div[1]/div[2]/div[2]/div[2]/div[1]/form/div[8]/div[1]/button[1]")).click();
		Thread.sleep(1000);
		ff.quit();
	}
	@Test
	//���������������������
	public void test2() throws InterruptedException {
		WebDriver ff = new FirefoxDriver();
		ff.get("http://localhost:8032/zl_shop/admin.php/Login/index.html");
		ff.manage().window().maximize();
		ff.findElement(By.name("name")).sendKeys("admin");
		ff.findElement(By.name("password")).sendKeys("admin");
		ff.findElement(By.xpath("//*[@id='login-box']/div/div[1]/form/fieldset/div[1]/button")).click();
		Thread.sleep(5000);
		ff.findElement(By.linkText("��������")).click();
		Thread.sleep(1000);
		ff.findElement(By.linkText("�����������")).click();
		Thread.sleep(1000);
		ff.findElement(By.name("linkname")).sendKeys("");
		ff.findElement(By.name("linkaddress")).sendKeys("www.baidu.com");
		ff.findElement(By.name("pic")).sendKeys("F:\\ͼ����Ƶ\\ͼƬ\\WallPaper\\50211.jpg");
		Thread.sleep(1000);
		ff.findElement(By.xpath("//*[@id='main-container']/div[1]/div[2]/div[2]/div[2]/div[1]/form/div[6]/div[1]/input[1]")).click();
		Thread.sleep(1000);
		ff.findElement(By.xpath("//*[@id='main-container']/div[1]/div[2]/div[2]/div[2]/div[1]/form/div[8]/div[1]/button[1]")).click();
		Thread.sleep(1000);
		ff.quit();
	}
	@Test
	//�������������ӵ�ַ���
	public void test3() throws InterruptedException {
		WebDriver ff = new FirefoxDriver();
		ff.get("http://localhost:8032/zl_shop/admin.php/Login/index.html");
		ff.manage().window().maximize();
		ff.findElement(By.name("name")).sendKeys("admin");
		ff.findElement(By.name("password")).sendKeys("admin");
		ff.findElement(By.xpath("//*[@id='login-box']/div/div[1]/form/fieldset/div[1]/button")).click();
		Thread.sleep(5000);
		ff.findElement(By.linkText("��������")).click();
		Thread.sleep(1000);
		ff.findElement(By.linkText("�����������")).click();
		Thread.sleep(1000);
		ff.findElement(By.name("linkname")).sendKeys("�ٶ�1231");
		ff.findElement(By.name("linkaddress")).sendKeys("");
		ff.findElement(By.name("pic")).sendKeys("F:\\ͼ����Ƶ\\ͼƬ\\WallPaper\\50211.jpg");
		Thread.sleep(1000);
		ff.findElement(By.xpath("//*[@id='main-container']/div[1]/div[2]/div[2]/div[2]/div[1]/form/div[6]/div[1]/input[1]")).click();
		Thread.sleep(1000);
		ff.findElement(By.xpath("//*[@id='main-container']/div[1]/div[2]/div[2]/div[2]/div[1]/form/div[8]/div[1]/button[1]")).click();
		Thread.sleep(1000);
		ff.quit();
	}
	@Test
	//ȫѡ��
	//not finish
	public void test4() throws InterruptedException {
		WebDriver ff = new FirefoxDriver();
		ff.get("http://localhost:8032/zl_shop/admin.php/Login/index.html");
		ff.manage().window().maximize();
		ff.findElement(By.name("name")).sendKeys("admin");
		ff.findElement(By.name("password")).sendKeys("admin");
		ff.findElement(By.xpath("//*[@id='login-box']/div/div[1]/form/fieldset/div[1]/button")).click();
		Thread.sleep(5000);
		ff.findElement(By.linkText("��������")).click();
		Thread.sleep(1000);
		ff.findElement(By.linkText("���������б�")).click();
		Thread.sleep(1000);
		ff.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(10000);
		ff.quit();
	}
	@Test
	//�����༭��������
	public void test5() throws InterruptedException {
		WebDriver ff = new FirefoxDriver();
		ff.get("http://localhost:8032/zl_shop/admin.php/Login/index.html");
		ff.manage().window().maximize();
		ff.findElement(By.name("name")).sendKeys("admin");
		ff.findElement(By.name("password")).sendKeys("admin");
		ff.findElement(By.xpath("//*[@id='login-box']/div/div[1]/form/fieldset/div[1]/button")).click();
		Thread.sleep(5000);
		ff.findElement(By.linkText("��������")).click();
		Thread.sleep(1000);
		ff.findElement(By.linkText("���������б�")).click();
		Thread.sleep(3000);
		ff.findElement(By.xpath("//*[@id='sample-table-1']/tbody/tr[1]/td[8]/div/a[1]")).click();
		Thread.sleep(3000);
		ff.findElement(By.name("linkname")).clear();;
		ff.findElement(By.name("linkname")).sendKeys("baidu");
		ff.findElement(By.name("linkaddress")).clear();;
		ff.findElement(By.name("linkaddress")).sendKeys("www.baidu.com");
		ff.findElement(By.name("pic")).sendKeys("F:\\ͼ����Ƶ\\ͼƬ\\WallPaper\\50211.jpg");
		ff.findElement(By.name("state")).click();
		Thread.sleep(1000);
		ff.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(10000);
		ff.quit();
	}
	@Test
	//���ť
	public void test6() throws InterruptedException {
		WebDriver ff = new FirefoxDriver();
		ff.get("http://localhost:8032/zl_shop/admin.php/Login/index.html");
		ff.manage().window().maximize();
		ff.findElement(By.name("name")).sendKeys("admin");
		ff.findElement(By.name("password")).sendKeys("admin");
		ff.findElement(By.xpath("//*[@id='login-box']/div/div[1]/form/fieldset/div[1]/button")).click();
		Thread.sleep(5000);
		ff.findElement(By.linkText("��������")).click();
		Thread.sleep(1000);
		ff.findElement(By.linkText("���������б�")).click();
		Thread.sleep(3000);
		ff.findElement(By.xpath("//*[@id='sample-table-1']/tbody/tr[1]/td[8]/div/a[1]")).click();
		Thread.sleep(3000);
		ff.findElement(By.name("linkname")).clear();;
		ff.findElement(By.name("linkname")).sendKeys("baidu");
		ff.findElement(By.name("linkaddress")).clear();;
		ff.findElement(By.name("linkaddress")).sendKeys("www.baidu.com");
		ff.findElement(By.name("pic")).sendKeys("F:\\ͼ����Ƶ\\ͼƬ\\WallPaper\\50211.jpg");
		ff.findElement(By.name("state")).click();
		Thread.sleep(1000);
		ff.findElement(By.xpath("//button[@type='reset']")).click();
		Thread.sleep(10000);
		ff.quit();
	}
	@Test
	//ɾ����������
	public void test7() throws InterruptedException {
		WebDriver ff = new FirefoxDriver();
		ff.get("http://localhost:8032/zl_shop/admin.php/Login/index.html");
		ff.manage().window().maximize();
		ff.findElement(By.name("name")).sendKeys("admin");
		ff.findElement(By.name("password")).sendKeys("admin");
		ff.findElement(By.xpath("//*[@id='login-box']/div/div[1]/form/fieldset/div[1]/button")).click();
		Thread.sleep(5000);
		ff.findElement(By.linkText("��������")).click();
		Thread.sleep(1000);
		ff.findElement(By.linkText("���������б�")).click();
		Thread.sleep(3000);
		ff.findElement(By.xpath("//*[@id='sample-table-1']/tbody/tr[1]/td[8]/div/a[2]")).click();
		
		Thread.sleep(10000);
		ff.quit();
	}
	
}
