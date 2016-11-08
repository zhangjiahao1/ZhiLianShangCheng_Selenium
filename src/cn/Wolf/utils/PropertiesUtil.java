package cn.Wolf.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {
	//引入配置文件
	public static String getStrings(String id, String path){
		Properties prop = new Properties();
		FileInputStream in=null;
		try {
		in=new FileInputStream(path);
			prop.load(in);
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop.getProperty(id);
	}
}
