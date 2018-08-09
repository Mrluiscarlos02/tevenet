/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mail;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author ingluiscarlos02@gmail.com
 */
@ManagedBean(name = "MailBean")
@SessionScoped
public class MailBean implements Serializable {
    
    
    
    private String nombre;
    private String email;
    private String telefono;
    private String destinatario;
    private String asunto;
    private String mensaje;
    private String msjcorreo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMsjcorreo() {
        return msjcorreo;
    }

    public void setMsjcorreo(String msjcorreo) {
        this.msjcorreo = msjcorreo;
    }

   

    
    public void send() {
        try {
            MailSender mailSender=new MailSender();
            this.msjcorreo="Email: "+email+"<br>"+"Nombre: "+nombre+"<br>"+"Teléfono: "+telefono+"<br>"+"Mensaje: "+mensaje;
            mailSender.sendMail(destinatario, asunto, msjcorreo);
        } catch (Exception e) {
        }
       this.nombre="";
       this.email="";
       this.telefono="";
       this.destinatario="";
       this.asunto="";
       this.mensaje="";
       this.msjcorreo="";
    }
}
