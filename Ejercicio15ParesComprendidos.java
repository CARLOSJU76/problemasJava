/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio15parescomprendidos;
import java.util.Scanner;

/**
 *
 * @author Carlos Garcia
 */
public class Ejercicio15ParesComprendidos {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Digita el primer numero entero: ");
        int num1= leer.nextInt();
        
        System.out.println("Digita el segundo numero entero:");
        int num2= leer.nextInt();
        
        System.out.println("Los numeros pares comprendidos entre " +num1 + " y "+ num2+" son: ");
        
        int aux;
        if(num1>num2){
            aux= num2;
            num2=num1;
            num1=aux;
        }
        for(int i= num1+1; i<num2;i++){
            if(i%2==0){
                if(i==num2-1 || i==num2-2){
                    System.out.print("y "+ i +".");
                }else{
                    System.out.print(i+ ",");
                }
            }
        
        }
        
        
    }
}
