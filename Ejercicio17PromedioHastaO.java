/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio17promediohastao;
import java.util.Scanner;

public class Ejercicio17PromedioHastaO {

    public static void main(String[] args) {
        /*Leer numeros enteros hasta que se digite 0 y determinar 
        a cuánto es igual el promedio de los números enteros que hayan 
        diso positivos */
        Scanner leer= new Scanner(System.in);
        int i=1, suma=0, numero;
        double promedio = 0;
        
        do{
            System.out.println("Digita un numero: ");
            numero= leer.nextInt();
            
            if(numero>0){
                suma+=numero;
                promedio= suma/i;
                i++;
            }else{
                i++;
            }
        
        }while(numero!=0);
        System.out.println("El promedio de los numeros es: "+ promedio);
        
    }
}
