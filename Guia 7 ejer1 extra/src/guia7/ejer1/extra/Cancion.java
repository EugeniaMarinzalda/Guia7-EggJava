/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7.ejer1.extra;

import java.util.Scanner;

/**
 *
 * @author EUGE
 */
public class Cancion {
   //atributos: título y autor.
    private String Titulo, autor;
   /*Se deberá definir además dos constructores: uno vacío que inicializa el
título y el autor a cadenas vacías  */

    public Cancion() {
    }
    //y otro que reciba como parámetros el título y el autor de la canción.

    public Cancion(String Titulo, String autor) {
        this.Titulo = Titulo;
        this.autor = autor;
    }
//Se deberán además definir los métodos getters y setters correspondientes.
    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
//extra
    
    public void completarCancion(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el titulo");
        Titulo = leer.next();
        System.out.println("Ingrese el autor");
        autor = leer.next();
    }
    @Override
    public String toString() {
        return "Cancion{" + "Titulo=" + Titulo + ", autor=" + autor + '}';
    }
    
    
}
