/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7.ejer3;

import java.util.Scanner;

/**
  * @author EUGE
 */
public class Operacion {
    private int num1, num2;
//a) Método constructor con todos los atributos pasados por parámetro.
    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    //b) Método constructor sin los atributos pasados por parámetro.
    public Operacion() {  
    }
    //c) Métodos get y set.
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    /*d) Método para crearOperacion(): que le pide al usuario los dos
números y los guarda en los atributos del objeto.*/
    public void crearOperacion () {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero 1");
        num1=leer.nextInt();
        System.out.println("Ingrese el numero 2");
        num2=leer.nextInt();
    }
   /*e) Método sumar(): calcular la suma de los números y devolver el
resultado al main.*/
    public int sumar () {
        return num1+num2;
    }
  /* f) Método restar(): calcular la resta de los números y devolver el
resultado al main */
   public int restar () {
        return num1-num2;
    } 
   /*g) Método multiplicar(): primero valida que no se haga una
multiplicación por cero, si fuera a multiplicar por cero, el método
devuelve 0 y se le informa al usuario el error. Si no, se hace la
multiplicación y se devuelve el resultado al main*/
    public int multiplicar() {
        if (num1 == 0 || num2 == 0) {
            System.out.println("Error, esta multiplicando por cero");
            return 0;
        } else {
            return num1 * num2;
        }
    }
  /*h) Método dividir(): primero valida que no se haga una división por cero,
si fuera a pasar una división por cero, el método devuelve 0 y se le
informa al usuario el error se le informa al usuario. Si no, se hace la
división y se devuelve el resultado al main.*/
    public double dividir() {
        if (num1 == 0 || num2 == 0) {
            System.out.println("Error, esta dividiendo por cero");
            return 0;
        } else {
            return (double) (num1/num2);
        }
    }
   
}
