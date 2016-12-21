package cn.Wolf.utils;

import java.util.List;
import java.util.Map;
import java.util.HashMap;  
import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class TestListener extends TestListenerAdapter {
		private static Logger logger = Logger.getLogger(TestListener.class);
		public static final String CONFIG = "config.properties";
	    
		@Override
		public void onTestFailure(ITestResult tr) {
			super.onTestFailure(tr);
			logger.info(tr.getName() + " Failure");
			//takeScreenShot(tr);
		}

		@Override
		public void onTestSkipped(ITestResult tr) {
			super.onTestSkipped(tr);
			logger.info(tr.getName() + " Skipped");
	        //takeScreenShot(tr);
		}

		@Override
		public void onTestSuccess(ITestResult tr) {
			super.onTestSuccess(tr);
			logger.info(tr.getName() + " Success");
		}

		@Override
		public void onTestStart(ITestResult tr) {
			super.onTestStart(tr);
			logger.info(tr.getName() + " Start");
		}

		@Override
		public void onFinish(ITestContext testContext) {
			super.onFinish(testContext);
			List<ITestResult> listFail=this.getFailedTests();
			List<ITestResult> listPass=this.getPassedTests();
			List<ITestResult> skip =this.getSkippedTests();
			ITestNGMethod[] listAll=this.getAllTestMethods();
			
			for(int i=0;i<listFail.size();i++){
			listFail.get(i).getMethod().getMethodName();
			}
			for(int i=0;i<listPass.size();i++){
			listPass.get(i).getMethod().getMethodName();
			}
			try {
				SendMail.sendmessage("a1257524459@163.com",
									 "abc9544257521",
									 "smtp.163.com",
									 "25",
									 "a1257524459@163.com",
									 "a1257524459@163.com",
									 "自动化测试报告",""
									 //StringUtil.joinlistFail+this.ListToString(listFail)+this.ListToString(skip)
									 );
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


//		/*
//		 * 自动截图，保存图片到本地以及html结果文件中
//		 * 
//		 * @param tr
//		 */
//		private void takeScreenShot(ITestResult tr) {
//			SimpleDateFormat formatter = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
//			String mDateTime = formatter.format(new Date());
//			String fileName = mDateTime + "_" + tr.getName();
//			String filePath = OrangeiOS.driver.getScreenshotAs(fileName);
//			Reporter.setCurrentTestResult(tr);
//			Reporter.log(filePath);
//
//	               //这里实现把图片链接直接输出到结果文件中，通过邮件发送结果则可以直接显示图片
//			Reporter.log("<img src=\"../" + filePath + "\"/>");
			


		
	
