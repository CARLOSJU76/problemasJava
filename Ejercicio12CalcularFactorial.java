/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio12calcularfactorial;
import java.util.Scanner;

/**
 *
 * @author Carlos Garcia
 */
public class Ejercicio12CalcularFactorial {

    public static void main(String[] args) {
        double salario;
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Introduzca las horas diurnas del trabajador: ");
        int diurnas= leer.nextInt();
        
        System.out.println("Introduzca las horas nocturnas del trabajador: ");
        int nocturnas= leer.nextInt();
        
        System.out.println("Introduzca las horas dominicales del trabajador: ");
        int dominicales= leer.nextInt();
        
        System.out.println("Introduzca las horas dominicales nocturnas del trabajador: ");
        int dominoctu= leer.nextInt();
        
        salario= (diurnas*6500) +(nocturnas*7500)+(dominicales*8500)+(dominoctu*9500);
        
        System.out.println("El jornal del trabajador es de: "+ salario+ " pesos");
        
        
    }
}
