/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7.ejer3;

/**
 *Crear una clase llamada Operacion que tenga como atributos privados
numero1 y numero2. A continuación, se deben crear los siguientes
métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Método constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos
números y los guarda en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el
resultado al main.
f) Método restar(): calcular la resta de los números y devolver el
resultado al main
g) Método multiplicar(): primero valida que no se haga una
multiplicación por cero, si fuera a multiplicar por cero, el método
devuelve 0 y se le informa al usuario el error. Si no, se hace la
multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero,
si fuera a pasar una división por cero, el método devuelve 0 y se le
informa al usuario el error se le informa al usuario. Si no, se hace la
división y se devuelve el resultado al main.
 * @author EUGE
 */
public class Guia7Ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operacion A = new Operacion (10,30);   //POR PARAMETRO
        Operacion B = new Operacion ();     //POR METODO
        B.crearOperacion();
        System.out.println("La suma de los valores por parametros OBJETO A " + A.getNum1()+" + "+ A.getNum2()+ " es : "+ A.sumar());
        System.out.println("OBJETO B SUMA " + B.sumar());
        System.out.println("La resta de los valores por parametros OBJETO A " + A.getNum1()+" - "+ A.getNum2()+ " es : "+ A.restar());
        System.out.println("OBJETO B RESTA " + B.restar());
        System.out.println("La multiplicacion de los valores por parametros OBJETO A " + A.getNum1()+" * "+ A.getNum2()+ " es : "+ A.multiplicar());
        System.out.println("OBJETO B multiplicacion " + B.multiplicar());
        System.out.println("La division de los valores por parametros OBJETO A " + A.getNum1()+" / "+ A.getNum2()+ " es : "+ A.dividir()); // ver diferencia de decimales
        System.out.println("OBJETO B division " + B.dividir());  // ver diferencia de decimales
    }
    
}
