/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

/**
 *
 * @author 1058548369
 */
import java.util.Scanner;


 public class Ejercicio2quiz {
    public static void main(String[] args) {
    // Paso 1 se debe importar el metodo escaner en la libreria de java//
        Scanner sc = new Scanner(System.in);
    // Paso 2 Debemos crear un vector para facilitar la realizacion del ejercicio//
        float[] alturas ;
        alturas = new float [5];
      for (int i = 0; i<5; i++) {
    // Paso 3 se permite la participacion del usuario para asi poder imprimir sus valores//
      System.out.print("Ingresar la altura de la persona ");
            alturas[i] = sc.nextFloat();
      }
        float sum=0, prom=0;
    // Paso 4 agregamos el metodo for para crear un ciclo que llegue hasta la 5 estatura ingresada por el usuario//
        for (int j=0;j<5;j++){
    // Paso 5 agregamos el proceso encargado de realizar las sumas de las estaturas//
        sum=sum+alturas[j];
        }
    // Paso 6 Añadimos el proceso encargado de encontrar el promedio de las estaturas mediante la suma y la division de los mismos//
        prom=sum/5;
         System.out.println("promedio de alturas:"+prom);
         int mayor,menor;
         mayor=0;
         menor=0;

         for(int j=0;j<5;j++){
    // Paso 7 se crea una condicion encargada de determinar cuales son las personas mas altas y mas bajas que el promedio 
         if(alturas[j]> prom){
             mayor++;
         } 
         else if (alturas[j] < prom) {
          
         menor++;
         }

    }
    // Paso 9 Finalmente se imprime la cantidad mayor y menor al promedio//
    System.out.println("la cantidad mayor del promedio es:"+mayor);
    System.out.println("la cantidad mayor del promedio es:"+menor);
    }  
}