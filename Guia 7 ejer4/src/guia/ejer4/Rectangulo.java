/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.ejer4;

import java.util.Scanner;

/**
 * 
 * @author EUGE
 */
public class Rectangulo {
    private int base, altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
     
    public void cargarDatos () {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la base");
        base = leer.nextInt();
        System.out.println("Ingrese la altura");
        altura = leer.nextInt();
    }
    /*También incluirá un método para calcular la superficie del
rectángulo*/
    public int superficie () {
        return base*altura;
    }
    /*método para calcular el perímetro del rectángulo.*/
    public int perimetro () {
        return (base*altura)*2;
    }
     /*tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. */
    public void dibujar () {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == altura-1 || j == 0 || j == base-1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }   
    }
    
}
