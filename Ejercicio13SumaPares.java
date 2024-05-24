/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio13sumapares;
import java.util.Scanner;

/**
 *
 * @author Carlos Garcia
 */
public class Ejercicio13SumaPares {

    public static void main(String[] args) {
        int suma=0;
        
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Escribe un numero: ");
        int numero= leer.nextInt();
        
        for(int i=1; i<=numero; i++){
            if(i%2==0){
                suma+=i;
            }
        
        }
        System.out.println("La suma de los numeros pares hasta "+ numero + " es: "+ suma);
        
        
    }
}
