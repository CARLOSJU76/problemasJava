/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio8aptoparaescoger;
import java.util.Scanner;

/**
 *
 * @author Carlos Garcia
 */
public class Ejercicio8AptoParaEscoger {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Escribe tu nombre: ");
        String nombre= leer.nextLine();
        
        System.out.println("Escribe tu apellido: ");
        String apellido= leer.nextLine();
        
        System.out.println("Digita tu edad: ");
        int edad= leer.nextInt();
        
        if(edad<18){
            System.out.println(nombre+" "+apellido+", no eres apto para elegir representantes en Colombia. ");
        }else{
            System.out.println(nombre+" "+apellido+", eres apto para elegir representantes en Colombia. ");
        }
    }
}
