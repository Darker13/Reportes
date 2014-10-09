/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Correo;

import java.util.Date;
import java.util.Properties;
import javax.mail.MailSessionDefinition;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
/**
 *
 * @author Erika
 */
public class Mail {
     private final Properties propiedades= new Properties();
 private final String pass="1020786287";
 private Session sesion;
 private final String user="emiranda78@misena.edu.co";
 
 private void init(){
     propiedades.put("mail.smtp.host", "smtp.gmail.com");//smtp:::: dicese; S:SIMPLE M: MAIL T:TRANSPORT P:: PROTOCOL 
                                                         //lugar hacia donde me voy a conectar: ejm servidor.
     propiedades.put("mail.smtp.starttls.enable", "true"); //donde se crea la seguridad de la session, es obligatorio ya que no deja relizar nada sin ello.
     propiedades.put("mail.smtp.port", 587);//puerto: que es el 587, los puertos dependen de la aplicacion que se este utilizando
     propiedades.put("mail.smtp.mail.sender", "emiranda78@misena.edu.co");// sender: persona que envia el correo, el remitente; 
     propiedades.put("mail.smtp.user", user); // el usuario con el que autentica la creacion del correo ;  
     propiedades.put("mail.smtp.auth", "true"); // auth: habilitar o no la autentificacion del  correo
     
     sesion= Session.getDefaultInstance(propiedades);// inicializa el objeto de sesion con las propiedades que se van a utilizar.
 }
 
  public String enviarCorreo(String msj, String asunto, String destinatario, String destinatario2, String destinatarioT){// metodo que se reaiza para obtener el resultado del envio del correo
     init(); // el metodo que inicializa todos los propiedades.
     String salida;// 
     try {
         MimeMessage mensaje=new MimeMessage(sesion);// mimemansaje es quien recibe el objeto de session para que se pueda enviar todo.
         mensaje.setFrom(new InternetAddress((String)propiedades.get("mail.smtp.mail.sender")));// setfrom: -> asigna el remitente del archivo propiedades :: en este caso el correo "emiranda78..."
         mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(destinatario2));// addrecipient:añadireceptor;  receptor para TO; dirrecion de internet; que viene siendo el destinatario dos
         mensaje.addRecipient(Message.RecipientType.CC, new InternetAddress(destinatario)); // cc: con copia, quiere decir que sera un correo que se enviara con copia.
         mensaje.addRecipient(Message.RecipientType.CC, new InternetAddress (destinatarioT));// copia para el tecnico de la modificacion que se realize.
         mensaje.setSubject(asunto,"UTF-8"); //asigan el asunto; utf-8 reconoce mayusculas y minusculas.
         MimeBodyPart cuerpoMensaje= new MimeBodyPart();// cuerpo del correo, mensaje
         cuerpoMensaje.setText(msj, "UTF-8", "html"); // texto html; tiene formatos, colores 
         Multipart multi= new MimeMultipart();//tipi de mensaje que tiene multiples partes, ejem: cabeza, cuerpo de mensaje
         multi.addBodyPart(cuerpoMensaje);// anade en cuerpo del mensaje
         mensaje.setContent(multi);// coloque el contenido
         Transport transporte= sesion.getTransport("smtp");// es le medio que va a llevar el mesaje
         transporte.connect(user,pass);// conectamos el usuario con el pass
         transporte.sendMessage(mensaje, mensaje.getAllRecipients());// sendmessage: enviar el mesaje, y del get obtenga todos los receptores
         transporte.close();// se cierra el transporte para que envie el correo
         salida="Mensaje enviado correctamente";// resultado del envio
     } catch (MessagingException e) {
         salida= e.getMessage();
     }
     return salida;
 }

    
}
