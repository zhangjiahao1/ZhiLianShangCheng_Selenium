package cn.Wolf.utils;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NSDataProvicer {

	@DataProvider(name = "Login")
	public static Object[][] getLoginData() throws IOException{
		ExcelDataProvider excel = new ExcelDataProvider("data/.xlsx", "Sheet1");
		ExcelDataProvider excel1 = new ExcelDataProvider("data/Login.xlsx", "Sheet1");
		return excel1.getTestDataByExcel();
	}
	
	@DataProvider(name = "Register")
	public static Object[][] getRegisterData() throws IOException{
		ExcelDataProvider excel = new ExcelDataProvider("data/Register.xlsx", "Sheet1");
		return excel.getTestDataByExcel();
	}
	
	@DataProvider(name="s2")
	public Object[][] getXsl(){
		FileDataProvider ft = new FileDataProvider("data/testData.xlsx");
		return ft.getTestDataByTxt();
	}
	@DataProvider(name = "Balance")//lzz
	public static Object[][] getBalanceData() throws IOException{
		ExcelDataProvider excel = new ExcelDataProvider("data/Balance.xlsx", "Sheet1");
		return excel.getTestDataByExcel();
	}
//个人信息
	@DataProvider(name="Information")
	public static Object[][] getInformation() throws IOException{
		ExcelDataProvider ft = new ExcelDataProvider("data/Information.xlsx","Sheet1");
		return ft.getTestDataByExcel();
	}
	@Test(dataProvider="Balance")
	public void test1(String s1,String s2,String s3,String s4,String s5,String s6,String  s7){
		System.out.println(s1);
		
	}
//添加地址
	@DataProvider(name="Address")
	public static Object[][] getAddress() throws IOException{
		ExcelDataProvider ft = new ExcelDataProvider("data/Address.xlsx","Sheet1");
		return ft.getTestDataByExcel();
	}
	
//商品管理
	@DataProvider(name="MDSG")
	public static Object[][] getGood() throws IOException{
		ExcelDataProvider ft = new ExcelDataProvider("data/MDSG.xlsx","Sheet1");
		return ft.getTestDataByExcel();
	}
	
//（后台）订单管理->订单列表->订单评论
	@DataProvider(name="ChangeOrder")
	public static Object[][] getChangeOrder() throws IOException{
		ExcelDataProvider co = new ExcelDataProvider("data/ChangeOrder.xlsx","Sheet1");
		return co.getTestDataByExcel();
	} 
	
		@DataProvider(name = "Authority")
		public static Object[][] getauthority() throws IOException{
			ExcelDataProvider excel = new ExcelDataProvider("data/Zuming.xlsx", "Sheet1");
			return excel.getTestDataByExcel();
		}
//结算页面
	@DataProvider(name="MDSG")
	public static Object[][] getBalance() throws IOException{
		ExcelDataProvider ft = new ExcelDataProvider("data/Balance.xlsx","Sheet1");
		return ft.getTestDataByExcel();
	}
		
}
