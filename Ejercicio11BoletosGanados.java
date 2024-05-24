/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio11boletosganados;
import java.util.Scanner;

/**
 *
 * @author Carlos Garcia
 */
public class Ejercicio11BoletosGanados {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Introduce el monto de tu compra: ");
        
        int compra= leer.nextInt();
        
        int boletos_ganados= compra/189000;
        
        System.out.println("Has ganado "+ boletos_ganados+ " boletos. ");
    }
}
