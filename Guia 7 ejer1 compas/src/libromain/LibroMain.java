/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */ 
package libromain;

/**
 *Crear una clase llamada Libro que contenga los siguientes atributos:
ISBN, Título, Autor, Número de páginas, y un constructor con todos los
atributos pasados por parámetro y un constructor vacío. Crear un
método para cargar un libro pidiendo los datos al usuario y luego
informar mediante otro método el número de ISBN, el título, el autor del
libro y el número de páginas.
 * @author EUGE
 */
public class LibroMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro Libro1 = new Libro(); //invocar el constructor vacio  
        Libro Libro2 = new Libro ("12365654","100 años de soledad","Gabriel Garcia Marquez",623);   //(String ISBN, String titulo, String autor, int numPagina)
        Libro1.LlenarLibro();
        Libro Libro3 = new Libro();
        //Libro3.LlenarLibro();
        System.out.println(Libro1.toString());  
        System.out.println(Libro2.toString());  
        System.out.println(Libro3.toString());  
        
    }
    
}
