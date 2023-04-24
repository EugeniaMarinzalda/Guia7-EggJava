/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp.entidades;

import java.util.Date;

/**
 *
 * @author EUGE
 */
public class Usuario {
    public String nombre;
    public String apellido;
    public int DNI;
    public Date nacimiento;
    public String pais;

    //alt + insert -> constructor
    public Usuario() {
        //genera un constructor vacio
    }

    public Usuario(String nombre, String apellido, int DNI, Date nacimiento, String pais) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.nacimiento = nacimiento;
        this.pais = pais;
    }
    
    
    
}
