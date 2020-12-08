/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author junyaoli
 */
public class mailUtil {
    public static void sendMail(String recepient) throws Exception{
        System.out.println("Preparing to send email");
        Properties properties = new Properties();
        properties.put("mail.smtp.auth","true");
        properties.put("mail.smtp.host","smtp.gmail.com");
        properties.put("mail.smtp.port","587");
        properties.put("mail.smtp.starttls.enable","true");
//        properties.put("mail.smtp.ssl.enable","true");//465 port
        
        String myAccountEmail ="do.not.replyfromapartment@gmail.com";
        String password = "18846921009";
        
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(myAccountEmail, password);
            }
    });
        
        Message message = prepareMessage( session, myAccountEmail,  recepient);
        Transport.send(message);
        System.out.println("Email send successfully");
    }
    
    private static Message prepareMessage(Session session,String myAccountEmail, String recepient){
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(myAccountEmail,"do-not-reply@appartment.com"));
            message.setRecipient(MimeMessage.RecipientType.TO, new InternetAddress(recepient));
            message.setSubject("Email from tenant");
            message.setText("Hey there, \n look my request!!!");
            return message;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
