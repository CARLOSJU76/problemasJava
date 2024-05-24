/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio14enterosentreunocien;
import java.util.Scanner;

/**
 *
 * @author Carlos Garcia
 */
public class Ejercicio14EnterosEntreUnoCien {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Digita un numero mayor de 1: ");
        int numero= leer.nextInt();
        
        System.out.println("Los numeros entre 1 y "+ numero + " son: ");
        for(int i=2; i<numero; i++){
            if(i==numero-1){
                System.out.print("y "+i+".");            
            }else{
                System.out.print(i+",");
            }
        }
    }
}
