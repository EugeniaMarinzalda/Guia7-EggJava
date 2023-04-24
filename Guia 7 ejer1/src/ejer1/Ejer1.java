/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer1;

import ejer1.entidades.Libro;
import java.util.Scanner;

/**
 *Crear una clase llamada Libro que contenga los siguientes atributos:
ISBN, Título, Autor, Número de páginas,
* y un constructor con todos los
atributos pasados por parámetro y
* un constructor vacío. 
* Crear un
método para cargar un libro pidiendo los datos al usuario y luego
informar mediante otro método el número de ISBN, el título, el autor del
libro y el número de páginas.
 * @author EUGE
 */
public class Ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       Libro libro1 = new Libro(); // utilizo el constructor vacio
       libro1.cargaLibro(); //CARGA LOS DATOS DESDE LA CONSOLA
       //libro1.mostrarLibro(); MUESTRA LA INFORMACION DEL LIBRO
        System.out.println(libro1.toString()); 
    }

    
    
}
