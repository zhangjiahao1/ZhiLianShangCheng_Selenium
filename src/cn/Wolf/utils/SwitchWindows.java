package cn.Wolf.utils;

import java.util.Set;
import org.openqa.selenium.WebDriver;

public class SwitchWindows {
	
	public static boolean switchToWindow(String windowTitle,WebDriver dr){  
	    boolean flag = false;  
	    try { 
//		    	将页面上所有的windowshandle放在入set集合当中
	        String currentHandle = dr.getWindowHandle();  
	        Set<String> handles = dr.getWindowHandles();  
	        for (String s : handles) {  
	            if (s.equals(currentHandle))  
	                continue;  
	            else {  
	            	dr.switchTo().window(s);
//		                和当前的窗口进行比较如果相同就切换到windowhandle
//		                判断title是否和handles当前的窗口相同
	                if (dr.getTitle().contains(windowTitle)) {  
	                    flag = true;  
	                    System.out.println("Switch to window: "  
	                            + windowTitle + " successfully!");  
	                    break;  
	                } else  
	                    continue;  
	            }  
	        }  
	    } catch (Exception e) {  
	        System.out.printf("Window: " + windowTitle  
	                + " cound not found!", e.fillInStackTrace());  
	        flag = false;  
	    }  
	    return flag;  
	}
	
}
