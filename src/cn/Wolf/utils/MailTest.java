package cn.Wolf.utils;

import org.testng.annotations.Test;

public class MailTest {

@Test
public void one(){
        
        String host = "smtp.163.com";

        final String username = "a1257524459@163.com"; 
        final String password = "abc9544257521"; 

        String from = "a1257524459@163.com"; 

        String to = "a1257524459@163.com";
        try {
            EmailHelper emailHelper = new EmailHelper(host, username, password, from);
            emailHelper.setTo(to);
            emailHelper.setSubject("subject ttt test");
            emailHelper.setHtmlContent("<h1> please open the file~ </h1>");
            emailHelper.setAttachedFileName("D:\\java\\java\\DianShang\\test-output.zip");
            
            emailHelper.send();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

