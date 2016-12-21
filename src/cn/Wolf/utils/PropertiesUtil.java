package cn.Wolf.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

public class PropertiesUtil {
	//���������ļ�
	public static String getStrings(String id, String path) throws UnsupportedEncodingException{
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
		String s1 = prop.getProperty(id);
		String s2 = new String(s1.getBytes("ISO8859-1"),"UTF-8");
		return s2;
	}
}
