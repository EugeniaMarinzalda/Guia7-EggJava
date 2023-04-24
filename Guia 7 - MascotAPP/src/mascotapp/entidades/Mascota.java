/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp.entidades;

/**
 *
 * @author EUGE
 */

//PRIVADO
    
public class Mascota {
    private String nombre;
    private String apodo;
    private String tipo;
    private String color;
    private int edad;
    private boolean cola;
    private String raza;
    private int energia; // agrego atributo energia
  
    public Mascota(String nombre, String apodo, String tipo, String color, int edad, boolean cola, String raza) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.color = color;
        this.edad = edad;
        this.cola = cola;
        this.raza = raza;
        this.energia = 1000;
    }
// realizo constructor con energia iniciada con 1000
    public Mascota(int energia) {
        this.energia = 1000;
    }

   

//crear un set para cambiar los valores que son privados - es public porque sino no podria acceder de nuevo
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
// termina de completar todos los set con alt+ insert + setter
    
    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    //genera el get para poder usar el valor en mail
    public String getNombre () {
        return nombre; // va nombre porque redundancia
    }
    
    public String getApodo() {
        return apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getColor() {
        return color;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isCola() {
        return cola;
    }

    public String getRaza() {
        return raza;
    }
    //genero metodo pasear
    public int pasear (int energiaRestar) {
        energia-=energiaRestar;
        return energia;
    }
    /**
     * funcion destinada a restar energia de acuerdo a la cantidad de vueltas
     * @param energiaRestar
     * @param vueltas
     * @return 
     */
    
    public int pasear (int energiaRestar, int vueltas) {
        for (int i = 0; i < vueltas ; i++) {
            energia-=energiaRestar;
        }
        return energia;
    }
    
    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", color=" + color + ", edad=" + edad + ", cola=" + cola + ", raza=" + raza + ", energia=" + energia + '}';
    }
    
/*    
//genera una funcion para que escriba todo (sin energia
@Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", color=" + color + ", edad=" + edad + ", cola=" + cola + ", raza=" + raza + '}';
    }
*/
    
    /* PUBLICO
public class Mascota {
// moderados + tipo + variable - para generar los atributos
    public String nombre;
    public String apodo;
    public String tipo;
    public String color;
    public int edad;
    public boolean cola;
    public String raza;
    
    //Generar constructores vacio
    public Mascota () {
        
    }

    public Mascota(String nombre, String apodo, String tipo, String color, int edad, boolean cola, String raza) {
        this.nombre = nombre;  //difeerncia el objeto con this.nombre de la variable
        this.apodo = apodo;
        this.tipo = tipo;
        this.color = color;
        this.edad = edad;
        this.cola = cola;
        this.raza = raza;
    }
*/    

    

    

 

   
    
    
}
