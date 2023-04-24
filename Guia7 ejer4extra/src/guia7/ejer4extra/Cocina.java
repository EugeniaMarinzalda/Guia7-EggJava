/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7.ejer4extra;

import java.util.ArrayList;

/**
  * @author EUGE
 */
/*
public class Cocina {
    //Crea una clase "Cocina" que tenga una lista de objetos "Receta".
    private ArrayList<Receta> recetas;
/*
    public Cocina() {
        recetas = new ArrayList<>();
    }

    //contructor lleno
    public Cocina(ArrayList<Receta> recetas) {
        this.recetas = recetas;
    }
    // constructor vacio

    public Cocina() {
    }

    public ArrayList<Receta> getRecetas() {
        return recetas;
    }

    public void setRecetas(ArrayList<Receta> recetas) {
        this.recetas = recetas;
    }
    
//crea métodos para agregar nuevas recetas a la lista,
    public void agregarReceta(Receta receta) {
        recetas.add(receta);
    }
//para buscar una receta por nombre
    public Receta buscarReceta(String nombreReceta) {
        for (Receta receta : recetas) {
            if (receta.getNombre().equals(nombreReceta)) {
                return receta;
            }
        }
        return null;
    }
//obtener la lista de recetas que se pueden preparar con los ingredientes disponibles en la cocina.
    public ArrayList<Receta> recetasDisponibles(ArrayList<Ingrediente> ingredientesDisponibles) {
        ArrayList<Receta> recetasDisponibles = new ArrayList<>();
        for (Receta receta : recetas) {
            if (receta.sePuedePrepararCon(ingredientesDisponibles)) {
                recetasDisponibles.add(receta);
            }
        }
        return recetasDisponibles;
    }
}

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Luis
 */
/*
public class Ingrediente {
 private List<String> ingrediente = new ArrayList<String>(); 

    public Ingrediente() {
    }

    public Ingrediente(List<String> ingrediente) {
        this.ingrediente = ingrediente;
    }

    public List<String> getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(List<String> ingrediente) {
        this.ingrediente = ingrediente;
    }
 
 public void cargarIngredientes(Scanner leer){
      
     System.out.println("Ingrese la receta");
     ingrediente.add(leer.next());
     System.out.println("Cauntos ingredientes tiene");
     int num = leer.nextInt();
     for (int i = 0; i < num; i++) {
         System.out.print((i+1)+ " - Ingrediente: ");
        ingrediente.add(leer.next());
     }
//        String resp = "S";
//        System.out.println("Ingrese los ingredientes que dispone");
//        ingrediente.add(leer.next());
//        do {
//            System.out.println("Desea agregar otro S o N");
//            resp=leer.next();
//            if (resp.toUpperCase().equals("S")) {
//                System.out.println("Ingrese el ingrediente");
//                ingrediente.add(leer.next());
//            }
//
//        } while (resp.toUpperCase().equalsIgnoreCase("S"));
       
  }
 public void buscarIngrediente(String ingre){
//     System.out.println("Ingrese el ingrediente a buscar");
//     String ingre=leer.next();
     for (String ingredient : ingrediente) {
         if(ingre.equals(ingredient)){
             System.out.println("El ingrediente esta en "+ ingrediente.get(0));
         }
         
     }
 }
*/