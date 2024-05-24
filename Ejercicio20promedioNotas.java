

package com.mycompany.ejercicio20promedionotas;
import java.util.Scanner;

public class Ejercicio20promedioNotas {

    public static void main(String[] args) {
   /* Calcular la media de un conjuno de notas de n alumnos.*/
   Scanner leer = new Scanner(System.in);
   
        System.out.println("De cuantos alumnos quieres el promedio? ");
        int n= leer.nextInt();
        double nota, promedio=0, suma=0;
        
        for(int i= 1; i<=n; i++){
            System.out.println("Digite la nota del alumno: "+i +": ");
            nota= leer.nextDouble();
            
            suma+=nota;
            promedio= suma/i;
        }
        System.out.println("El promedio de las notas de los alumnos es de: "+ promedio);
        
        
   
    }
}
