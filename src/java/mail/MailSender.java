/*
 *
 *PENDIENTES
 *Cambiar correo electronico de envio
 */
package mail;

import java.io.Serializable;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Niyaz-laptop
 */
public class MailSender implements Serializable{
    
    public  void sendMail(String destinatario,String asunto,String msjcorreo) throws AddressException, MessagingException{
    
        Properties props=System.getProperties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        
        
                props.put("mail.smtp.auth", "true");
                props.put("mail.smtp.port", "465");
                props.put("mail.smtp.auth", "true");
                props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
                props.put("mail.smtp.socketFactory.port", "465");
                props.put("mail.smtp.socketFactory.fallback", "false");
                
                Session mailSession=Session.getDefaultInstance(props, null);
                mailSession.setDebug(true);
                
                Message mailMessage=new MimeMessage(mailSession);
                
                mailMessage.setFrom(new InternetAddress(remitente));
                mailMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(destinatario));
                mailMessage.setContent(msjcorreo,"text/html");
                mailMessage.setSubject(asunto);
                
                Transport transport=mailSession.getTransport("smtp");
                transport.connect("smtp.gmail.com", usuario, clave);
                transport.sendMessage(mailMessage, mailMessage.getAllRecipients());   
                
                
    }
    private String remitente="temsis476@gmail.com";     //PENDIENTE  cambio de correo electronico oficial
    private String usuario="temsis476";
    private String clave="Temsis476sistem";
    
            
    
}
