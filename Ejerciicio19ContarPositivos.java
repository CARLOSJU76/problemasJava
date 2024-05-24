

package com.mycompany.ejerciicio19contarpositivos;
import java.util.Scanner;

public class Ejerciicio19ContarPositivos {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Cuantos numeros quieres introducir: ");
            int cant= leer.nextInt();
            int numero, contador=0;
            
            for(int i=0; i<= cant; i++){
                System.out.println("Digita un numero:");
                numero= leer.nextInt();
                
                if(numero>0){
                    contador++;
                }
            }
            System.out.println("El numero de enteros positivos digitados fué: "+ contador);
        
        
    }
}