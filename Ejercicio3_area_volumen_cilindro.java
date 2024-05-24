/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3_area_volumen_cilindro;
import java.util.Scanner;
/**
 *
 * @author Carlos Garcia
 */
public class Ejercicio3_area_volumen_cilindro {

    public static void main(String[] args) {
        double radio, altura, volumen, area;
        
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Escribe el radio del Cilindro: ");
        radio= leer.nextDouble();
        
        System.out.println("Escribe la altura del Cilindro: ");
        altura= leer.nextDouble();
        
        volumen= Math.PI * (Math.pow(radio,2))*altura;
        
        area= 2*Math.PI * radio *(radio+altura);
        
        System.out.println("El volumen del Cilindro es: "+ volumen + " y su area es: "+ area);
                
        
    }
}
