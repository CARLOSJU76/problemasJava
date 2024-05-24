/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5imc;
import java.util.Scanner;

public class Ejercicio5Imc {

    public static void main(String[] args) {
        double imc;
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Escribe tu peso en Kilogramos: ");
        double peso= leer.nextDouble();
        
        System.out.println("Escribe tu estatura en metros: ");
        double estatura= leer. nextDouble();
        
        imc= peso/(Math.pow(estatura,2));
        
        System.out.println("Tu IMC es: " + imc);
        
    }
}
