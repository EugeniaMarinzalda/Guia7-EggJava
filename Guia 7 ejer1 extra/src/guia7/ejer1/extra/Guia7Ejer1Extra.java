/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7.ejer1.extra;

/**
 *
 * @author EUGE
 */
public class Guia7Ejer1Extra {

    /**Desarrollar una clase Cancion con los siguientes atributos: título y autor.
Se deberá definir además dos constructores: uno vacío que inicializa el
título y el autor a cadenas vacías y otro que reciba como parámetros el
título y el autor de la canción. Se deberán además definir los métodos
getters y setters correspondientes.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cancion c1 = new Cancion("Bachata","Turizo");  //constructor lleno
        Cancion c2 = new Cancion ();    // constructor vacio
       //extra
        c2.completarCancion();
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
    
}
