/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7.ejer2;

import java.util.Scanner;

/**
 * @author EUGE
 */
public class Circunferencia {
    //creo el atributo privado
    private double radio;   //como real

    //a) Método constructor que inicialice el radio pasado como parámetro.
    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public Circunferencia() {
    }
    //b) Métodos get y set para el atributo radio de la clase Circunferencia
    public double getRadio() {   //para utilizar datos privados
        return radio;
    }

    public void setRadio(double radio) {    // para modificar datos privados
        this.radio = radio;
    }
    /*c) Método para crearCircunferencia(): que le pide el radio y lo guarda
en el atributo del objeto.
    */
    public void crearCircunferencia() {
        Scanner leer = new Scanner(System.in);
        radio = leer.nextDouble();   // entero , decimales
    }
    /*d) Método area(): para calcular el área de la circunferencia (Area=〖
π*radio〗^2).
    */
    public double area() {
       //System.out.println(Math.PI*(Math.pow(radio,2))); 
       return Math.PI*(Math.pow(radio,2));
       
    }
    /*e) Método perimetro(): para calcular el perímetro
(Perimetro=2*π*radio).
    */
    public void perimetro() {
       //System.out.println(2*Math.PI*radio); 
       double perimetro = 2*Math.PI*radio;
        System.out.println(perimetro);
    }
}
