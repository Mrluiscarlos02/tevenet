package fecha;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *Document   : index
 *Created on : 24/07/2018, 04:54:49 PM
 *@author ingluiscarlos02@gmail.com
 */
@Named(value = "mesActual")
@RequestScoped
public class MesActual {

    
    public MesActual() {
    Date fecha=new Date();
    SimpleDateFormat formatofecha=new SimpleDateFormat("MMMM 'de' yyyy" /*, new Locale("es_ES")*/);   
    mes= formatofecha.format(fecha);
    }
    
    

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }
    
    
    private String mes;
}
