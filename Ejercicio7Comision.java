/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio7comision;
import java.util.Scanner;

public class Ejercicio7Comision {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        
        double comision, ventas;
        
        System.out.println("Escribe el monto de ventas del vendedor: ");
        ventas= leer.nextDouble();
        
        if(ventas>=540000){
            comision= 15*ventas/100;
        }else{
            comision= 8*ventas/100;
        }
        System.out.println("La comision del empleado es de "+ comision + " pesos.");
        
  
    }
}
