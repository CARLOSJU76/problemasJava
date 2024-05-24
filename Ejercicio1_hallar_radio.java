/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1_hallar_radio;
import java.util.Scanner;

/**
 *
 * @author Carlos Garcia
 */
public class Ejercicio1_hallar_radio {

    public static void main(String[] args) {
        double area, radio;
        
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Escribe el area del circulo: ");
        area= leer.nextDouble();
        
        radio= Math.sqrt(area/Math.PI);
        
        System.out.println("El radio del circulo es: "+ radio);
    }
}
