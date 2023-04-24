/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer1.entidades;

import java.util.Scanner;

/**
 *Crear una clase llamada Libro que contenga los siguientes atributos:
ISBN, Título, Autor, Número de páginas, y un constructor con todos los
atributos pasados por parámetro y un constructor vacío. Crear un
método para cargar un libro pidiendo los datos al usuario y luego
informar mediante otro método el número de ISBN, el título, el autor del
libro y el número de páginas.
 * @author EUGE
 */
public class Libro {
    
    public String ISBN;
    public String Titulo;
    public String Autor;
    public int NumPaginas;
    
    
    public Libro(String ISBN, String Titulo, String Autor, int NumPaginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumPaginas = NumPaginas;
    }

    public Libro() {
    }
    
    public void cargaLibro () { 
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el ISBN");
        ISBN = leer.nextLine();
        System.out.println("Ingrese el Titulo");
        Titulo = leer.nextLine();
        System.out.println("Ingrese el Autor");
        Autor = leer.nextLine();
        System.out.println("Ingrese la cantidad de paginas");
        NumPaginas = leer.nextInt();
    }

 public void mostrarLibro () {
        
        System.out.println(ISBN + "-" + Titulo + "-" + Autor  + "-" + NumPaginas  );
    }   
    
    
    
    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", Titulo=" + Titulo + ", Autor=" + Autor + ", NumPaginas=" + NumPaginas + '}';
    }

    

    
   
}
