/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio16factorial;
import java.util.Scanner;

/**
 *
 * @author Carlos Garcia
 */
public class Ejercicio16Factorial {

    public static void main(String[] args) {
       //Leer un numero entero y calcular su factorial:
       Scanner leer = new Scanner(System.in);
       
        System.out.println("Digita un numero entero: ");
        int numero= leer.nextInt();
        int factorial=1;
        
        for(int i=1; i<=numero; i++){
            factorial*=i;              
        }  
        System.out.println("El factorial de: "+numero+" es "+factorial );
    }
}
