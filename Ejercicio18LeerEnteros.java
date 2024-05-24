
package com.mycompany.ejercicio18leerenteros;
import java.util.Scanner;

public class Ejercicio18LeerEnteros {

    public static void main(String[] args) {
     /*Leer dos numeros enteros y mostrar los numeros comprendidos
        entre el menor y el mayor.
        */
     Scanner leer= new Scanner(System.in);
        System.out.println("Escribe el primer numero: ");
        int numero1= leer.nextInt();
        System.out.println("Escribe el segundo numero: ");
        int numero2= leer.nextInt();
        int aux;
        
        if(numero1 > numero2){
           aux=numero2;
           numero2=numero1;
           numero1=aux;           
        }
        
        System.out.println("Los numeros comprendidos entre los dados son: ");
        for(int i=numero1+1; i<numero2; i++){
            if(i==numero2-1){
                System.out.print(i+".");
            }else{
                System.out.print(i+ ", ");
            }
        }
     
    }
}
