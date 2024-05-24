/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio6paroimpar;
import java.util.Scanner;


public class Ejercicio6ParOImpar {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Escribe un numero: ");
        int numero= leer.nextInt();
        
        if(numero%2==0){
            System.out.println("El numero es Par. ");
        }else{
            System.out.println("El numero es impar");
        }
        
        
    }
}
