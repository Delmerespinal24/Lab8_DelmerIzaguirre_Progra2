/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal8;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Owner
 */
public class Contacto implements Serializable{
    private String nombre;
    private int Edad;
    private Long numero;
    private String correo;
    private String Direccion;
    private String Genero = "Masculino";
    ArrayList<Mensaje> mensajes = new ArrayList();

    public Contacto() {
    }

    public Contacto(String nombre, int Edad, Long numero, String correo, String Direccion) {
        this.nombre = nombre;
        this.Edad = Edad;
        this.numero = numero;
        this.correo = correo;
        this.Direccion = Direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public ArrayList<Mensaje> getMensajes() {
        return mensajes;
    }

    public void setMensajes(ArrayList<Mensaje> mensajes) {
        this.mensajes = mensajes;
    }
    
    public void addMensaje(Mensaje msn){
        this.mensajes.add(msn);
        
    }
    
    

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
