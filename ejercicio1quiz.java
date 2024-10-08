/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject4;

/**
 *
 * @author 1058548369
 */

import java.util.Scanner;

public class ejercicio1quiz {
    public static void main(String[] args) {

         //Paso 1 tenemos que realizar el metodo escaner importandolo desde la librereria de java

        Scanner sc = new Scanner(System.in);
          //paso 2 Es necesario la creacion de un vector que permita guardar 20 datos 
        int[] num = new int[20];
          //paso 3 se crean unos contadores los cuales acumulen los datos ingresados por el usuario para realizar el proceso con los 20 numeros
        int sumaPar = 0;
        int sumaImpar = 0;
        int posImpar = 0;
        int posPar = 0;
        int contImpar = 0;
        int contPar = 0;
           // paso 4 Llamamos el metodo for para crear un ciclo que permita llegar a los 20 datos de nuestro vector

        for (int i = 0; i < 20; i++) {
            //paso 5 Generamos un mensaje para que el usuario pueda ingresar los valores que desee
            System.out.print("Ingresa el número " + (i + 1) + ": ");
            num[i] = sc.nextInt();
           // paso 6 Llamamos un condicional en el cual mencionamos la formula a tener en cuenta para que solo llame a los
           //valores que son pares colocando (numeros[i] % 2 == 0) 
            if (num[i] % 2 == 0) {
                //paso 7 realizamos la suma mediante la siguiente formula
                sumaPar += num[i];
                contPar++;
            } else {
                // De igual manera lo realizamos con los numeros que son impares
                sumaImpar += num[i];
                contImpar++;
            }
            //paso 8 en este caso realizamos otro condicional if verdadero y falso para ver las posiciones en la cual estan ubicados los pares
            // y los impares para luego sumandolos guardandolos 
            if (i % 2 == 0) {
                posPar += num[i];
            } else {
                posImpar += num[i];
            }
        }

//paso 9  Lo que se busca ahora es imprimir todos los resultados que buscaba el usuario//
        double promedioPares = (double) sumaPar / contPar ;
        double promedioImpares = (double) sumaImpar / contImpar;
        System.out.println("el promedio de los numeros pares es: " + promedioPares);
        System.out.println("el promedio de los numeros impares es: " + promedioImpares);
        System.out.println("la suma de los numeros impares es: " + sumaPar);
        System.out.println("la suma de los numeros impares es: " + sumaImpar);
    }
}
    

