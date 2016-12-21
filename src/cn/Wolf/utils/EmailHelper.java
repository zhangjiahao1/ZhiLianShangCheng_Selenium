package cn.Wolf.utils;

import java.util.ArrayList;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Address;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class EmailHelper {
    
    private String host;
    private String username;
    private String password;
    private String from;
    
    private String to;
    private String subject;
    private String htmlContent;
    private String attachedFileName;
    
    public EmailHelper(String host, String username, String password, String from) throws AddressException, MessagingException{
        this.host = host;
        this.username = username;
        this.password = password;
        this.from = from;
    }
    
    public void send() throws Exception{
        
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.host", host);
        
        final String username1 = username;
        final String password1 = password;
        
        Session session = Session.getInstance(props, 
                new javax.mail.Authenticator(){
             protected PasswordAuthentication getPasswordAuthentication() {
                   return new PasswordAuthentication(username1, password1);
           }
        });        
        
        Message message = new MimeMessage(session);
        
        
        message.setFrom(new InternetAddress(from));        
		//收件人to LIST
		ArrayList<Address> toList=new ArrayList<Address>();
		//收件人字符串通过,号分隔收件人
		String[] toArray=to.split(",");
		for (int i = 0; i < toArray.length; i++)
		{
			String str = toArray[i];
			toList.add(new InternetAddress(str));
		}
		//将收件人列表转换为收件人数组
		Address[] addresses=new Address[toList.size()];
		addresses=toList.toArray(addresses);
		//设置to收件人地址
		message.setRecipients(MimeMessage.RecipientType.TO,addresses);
        
        message.setSubject(subject);

        
        Multipart multipart = new MimeMultipart();
        
        if (htmlContent != null){
            System.out.println(" has html ");

            BodyPart htmlPart = new MimeBodyPart();
            htmlPart.setContent(htmlContent, "text/html");
            multipart.addBodyPart(htmlPart);
        }
        
        if (attachedFileName != null){
            System.out.println(" has attached file ");

            BodyPart attchmentPart = new MimeBodyPart();
            DataSource source = new FileDataSource(attachedFileName);
            attchmentPart.setDataHandler(new DataHandler(source));
            attchmentPart.setFileName(attachedFileName);
            multipart.addBodyPart(attchmentPart);
        }
        
        message.setContent(multipart);
        Transport.send(message);

        System.out.println(" Sent ");
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setHtmlContent(String htmlContent) {
        this.htmlContent = htmlContent;
    }
    
    public void setAttachedFileName(String attachedFileName) {
        this.attachedFileName = attachedFileName;
    }
}
