/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7.ejer3extra;

/**
 *Crea una clase "Juego" que tenga un método "iniciar_juego" que permita
a dos jugadores jugar un juego de adivinanza de números. El primer
jugador elige un número y el segundo jugador intenta adivinarlo. El
segundo jugador tiene un número limitado de intentos y recibe una pista
de "más alto" o "más bajo" después de cada intento. El juego termina
cuando el segundo jugador adivina el número o se queda sin intentos.
Registra el número de intentos necesarios para adivinar el número y el
número de veces que cada jugador ha ganado.
 * @author EUGE
 */
public class Guia7Ejer3extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Adivina adivinador");
        Juego adi1 = new Juego();
        System.out.println("Jugador 1");
        adi1.cargarNum();
        System.out.print("\033[H\033[2J");   // para linux no funciono
        System.out.flush();  // para windows no funciono
        for (int i = 0; i < 50; i++) {   //para limpiar la consola
            System.out.println();
        }

        System.out.println("Jugador 2");
        adi1.adivine();
        
    }
    
}
