package cn.Wolf.utils;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class NSDataProvicer {

	@DataProvider(name = "Login")
	public static Object[][] getLoginData() throws IOException{
		ExcelDataProvider excel = new ExcelDataProvider("data/login.xlsx", "Sheet1");
		return excel.getTestDataByExcel();
	}
	
	@DataProvider(name="s1")
	public static Object[][] getTxt(){
		FileDataProvider ft = new FileDataProvider("data/testData.txt");
		return ft.getTestDataByTxt();
	}
	
	@DataProvider(name="s2")
	public Object[][] getXsl(){
		FileDataProvider ft = new FileDataProvider("data/testData.xlsx");
		return ft.getTestDataByTxt();
	}
	
}
