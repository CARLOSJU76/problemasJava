/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio4cuadradodeunnumero;
import java.util.Scanner;


public class Ejercicio4CuadradoDeUnNumero {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
       
        System.out.println("Escribe un numero: ");
        int numero= leer.nextInt();
        
        numero*=numero;
        
        System.out.println("El cuadrado del numero es: "+ numero);
        
       
    }
}
