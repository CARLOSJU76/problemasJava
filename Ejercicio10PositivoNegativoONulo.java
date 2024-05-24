/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio10positivonegativoonulo;
import java.util.Scanner;

/**
 *
 * @author Carlos Garcia
 */
public class Ejercicio10PositivoNegativoONulo {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Escribe un numero: ");
        int numero= leer.nextInt();
        
        if(numero==0){
            System.out.println("El numero es nulo. ");
        }else if(numero>0){
            System.out.println("El numero es positivo. ");
        }else{
            System.out.println("El numero es negativo. ");
        }
    }
}
