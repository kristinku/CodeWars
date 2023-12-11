package weihnachstwichteln;

import java.util.Arrays;

import java.util.Collections;
import java.util.List;
import java.util.Properties;
import jakarta.mail.Message;
import jakarta.mail.Multipart;

import jakarta.mail.Authenticator;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeBodyPart;
import jakarta.mail.internet.MimeMessage;
import jakarta.mail.internet.MimeMultipart;

public class WeihnachstwichtelnMitMail {
	public static void main(String[] args) {
		List<String> wichtelpartner = Arrays.asList("Tim", "Gabi", "Klößchen", "Karl");
		WeihnachstwichtelnMitMail.wichtel(wichtelpartner);
	}
	
	public static void wichtel(List<String> wichtelpartner) {
		Collections.shuffle(wichtelpartner); // Durcheinanderbringen der Liste
		for(int i = 0; i < wichtelpartner.size(); i++) { // Gehen wir mit einer Schleife über unsere Wichtelpartner
			String partner = wichtelpartner.size() == i+1 ? wichtelpartner.get(0) : wichtelpartner.get(i+1); //If Funktion um den nächsten Partner zu finden. Wenn letzter Partner dann erster Partner
			WeihnachstwichtelnMitMail.sendMail(wichtelpartner.get(i), partner); // Funktionsaufruf um E-Mail zu versenden
		}	
	}
	
	private static void sendMail(String empfaenger, String partner) { 
		System.out.println(empfaenger + " hat " + partner + " als Partner");
		Properties properties = new Properties();
		properties.put("mail.smtp.auth",  "true");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.host", "smtp.web.de");
		properties.put("mail.smtp.port", "587");
		String myAccount = "kristin0996@web.de"; 
		String myPassword = "**********";
		String empfaengerMail = "mail@andreas-winter.eu";
		
		Session session = Session.getInstance(properties, new Authenticator() {
		    @Override
		    protected PasswordAuthentication getPasswordAuthentication() {
		        return new PasswordAuthentication(myAccount, myPassword);
		    }
		});
		
		Message message = new MimeMessage(session);
		try {
			message.setFrom(new InternetAddress("weihnachtsmann@co.kg"));
			message.setRecipients(
			  Message.RecipientType.TO, InternetAddress.parse(empfaengerMail));
			message.setSubject("Auslosung wichteln");

			String msg = empfaenger + " hat " + partner + " als Partner/in";

			MimeBodyPart mimeBodyPart = new MimeBodyPart();
			mimeBodyPart.setContent(msg, "text/html; charset=utf-8");

			Multipart multipart = new MimeMultipart();
			multipart.addBodyPart(mimeBodyPart);

			message.setContent(multipart);

			Transport.send(message);
		} catch (Exception e) {
			System.out.println(e);
		}	
	}
	

}
