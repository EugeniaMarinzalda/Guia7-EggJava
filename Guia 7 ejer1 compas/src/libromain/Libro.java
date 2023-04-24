/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libromain;

import java.util.Scanner;

/**
 *. Crear un
método para cargar un libro pidiendo los datos al usuario y luego
informar mediante otro método el número de ISBN, el título, el autor del
libro y el número de páginas.
 * @author EUGE
 */
public class Libro {
    //Defino los atributos
    public String ISBN;
    public String titulo;
    public String autor;
    public int numPagina;

    public Libro() {    //molde vacio
    }

    public Libro(String ISBN, String titulo, String autor, int numPagina) {   //moldeo con atributos
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPagina = numPagina;
    }
    
    public void cambiarAtributo() {
        titulo = "Aladin"; 
        System.out.println(titulo);
    }
    
    public void LlenarLibro() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");  // delimita una nueva linea / salto de linea 
        System.out.println("Ingrese el ISBN");
        ISBN = leer.next();
        System.out.println("Ingrese el titulo");
        titulo = leer.next();
        System.out.println("Ingrese el autor");
        autor = leer.next();
        System.out.println("Ingrese la cantidad de paginas");
        numPagina = leer.nextInt();
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", numPagina=" + numPagina + '}';
    }
    
    
}
