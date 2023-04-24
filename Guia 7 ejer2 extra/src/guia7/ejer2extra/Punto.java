/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7.ejer2extra;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author EUGE
 */
public class Punto {
    /*Definir una clase llamada Puntos que contendrá las coordenadas de dos
puntos, sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto.*/
    public int x1, x2, y1, y2;
    // constructor vacio
     public Punto() {
    }
    /*Generar un objeto puntos usando un método crearPuntos() que le pide al
usuario los dos números y los ingresa en los atributos del objeto.*/

   public void crearPuntos() {
       Scanner leer = new Scanner(System.in);
       System.out.println("Datos del punto 1:");
       System.out.println("Ingrese la coordenada del eje x");
       x1 = leer.nextInt();
       System.out.println("Ingrese la coordenada del eje y");
       y1 = leer.nextInt();
       System.out.println("Datos del punto 2:");
       System.out.println("Ingrese la coordenada del eje x");
       x2 = leer.nextInt();
       System.out.println("Ingrese la coordenada del eje y");
       y2 = leer.nextInt();
       
       
       
       
   }
   /*Después, a través de otro método calcular y devolver la distancia que
existe entre los dos puntos que existen en la clase Puntos.  Para conocer
como calcular la distancia entre dos puntos consulte el siguiente link:
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html*/
    public void calcularDistancia(){
        double distancia = Math.sqrt(pow((x2-x1),2)+pow((y2-y1),2));
        System.out.println(distancia);
    }
    
    
}
