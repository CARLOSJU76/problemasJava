/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio9apruebaono;
import java.util.Scanner;

/**
 *
 * @author Carlos Garcia
 */
public class Ejercicio9ApruebaONo {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Escribe la nota de tu actividad: ");
        double nota= leer.nextDouble();
        
        if(nota<0 || nota>100){
            System.out.println("La nota no se encuentra en los rangos establecidos. ");            
        }else if(nota>=75){     
            System.out.println("¡¡Felicitaciones!! Has aprobado tu actividad. ");
        }else{
            System.out.println("Lo siento, has reprobado tu actividad. ");
        }
    }
}
