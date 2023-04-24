/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp;

import java.util.Scanner;
import mascotapp.entidades.Mascota;

/**
 *
 * @author EUGE
 */
public class Guia7MascotAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        
        Mascota m1 = new Mascota ("Fernando", "chiqui", "Perro", "tricolor", 2, true, "Beagle");
        m1.setNombre("Pepe");
        System.out.println(m1);
        System.out.println(m1.getNombre());
        m1.pasear(100);
        System.out.println(m1); //con la funcion to String me trae todos los atributos de la funcion
        /*2
        //para reasignar un valor cuando el constructor es publico
        m1.apodo= "Pepe";
        */
        
        /* 1        
        Mascota m1= new Mascota ();
        //tipo de clase + variable + asignacion + creacion + constructor 
       
        
        //valor a los atributos
        m1.nombre = "Chiquito";
        m1.apodo = leer.nextLine();
        m1.tipo = "Perro";
        m1.edad = 14;
        m1.raza = "Beagle";
        m1.cola = true;
        m1.color = "Tricolor";
       
        
        // nombrar los atributos del objeto en publico
        System.out.println(m1.apodo + " " + m1.edad + " " + m1.tipo);
         */
    }
    
}
