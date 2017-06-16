/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal8;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Owner
 */
public class Mensaje implements Serializable{
    private Contacto emisor;
    private Contacto receptor;
    private Date fecha;
    private String Contenido;

    public Mensaje(Contacto emisor, Contacto receptor, Date fecha, String Contenido) {
        this.emisor = emisor;
        this.receptor = receptor;
        this.fecha = fecha;
        this.Contenido = Contenido;
    }

    public Contacto getEmisor() {
        return emisor;
    }

    public void setEmisor(Contacto emisor) {
        this.emisor = emisor;
    }

    public Contacto getReceptor() {
        return receptor;
    }

    public void setReceptor(Contacto receptor) {
        this.receptor = receptor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getContenido() {
        return Contenido;
    }

    public void setContenido(String Contenido) {
        this.Contenido = Contenido;
    }

    @Override
    public String toString() {
        return receptor.getNombre();
    }
    
    
    
}
