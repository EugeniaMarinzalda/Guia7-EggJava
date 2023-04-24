/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7.ejer2;

/**
 *Declarar una clase llamada Circunferencia que tenga como atributo
privado el radio de tipo real. A continuación, se deben crear los
siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda
en el atributo del objeto.
d) Método area(): para calcular el área de la circunferencia (Area=〖
π*radio〗^2).
e) Método perimetro(): para calcular el perímetro
(Perimetro=2*π*radio).
 * @author EUGE
 */
public class Guia7Ejer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circunferencia A = new Circunferencia (5.21); // ingreso el valor por parametro
        A.crearCircunferencia();  // es un metodo void
        A.area();
        double area = A.area();
        System.out.println(area);
        A.perimetro();
        
    }
    
}
