/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7.ejer3extra;

import java.util.Scanner;

/**
 *
 * un método "iniciar_juego" que permita
a dos jugadores jugar un juego de adivinanza de números. El primer
jugador elige un número y el segundo jugador intenta adivinarlo. El
segundo jugador tiene un número limitado de intentos y recibe una pista
de "más alto" o "más bajo" después de cada intento. El juego termina
cuando el segundo jugador adivina el número o se queda sin intentos.
Registra el número de intentos necesarios para adivinar el número y el
número de veces que cada jugador ha ganado.
 * @author EUGE
 */
public class Juego {
    //privado para que otro usuario no lo sepa
    private int num1, num2, intentos;
    // genero un constructor vacio
    public Juego() {
    }
    //get y set
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
    // metodo para solicitar el numero1
    public void cargarNum() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        num1 = leer.nextInt();
        System.out.println("En cuantos intentos se debera adivinar?");
        intentos = leer.nextInt();
    }
    
    public void adivine() {
        Scanner leer = new Scanner(System.in);
        boolean hacer= true;
        System.out.println("Tienes " + intentos + " intento/s");
        do {
            System.out.println("¿Que numero ingreso el jugador 1?" );
            num2 = leer.nextInt();
            if (num1==num2) {
                System.out.println("Felicitaciones! Adivinaste el numero");
                hacer = false;
                break;
            } else {
                intentos -= 1;
                if (intentos == 0) {
                   hacer = false;
                   System.out.println("Numero equivocado. Agotaste los intentos");
                   break;
                }
                if (num1>num2) {
                    System.out.println("Elije un numero mas alto");
                } else {
                    System.out.println("Elije un numero mas bajo");
                }
                System.out.println("Te quedan " + intentos + " intento/s");
               
            }
        } while(hacer = true);
    }
}
