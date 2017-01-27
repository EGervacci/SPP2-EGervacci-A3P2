/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.egervaccir.a3p2;
import java.util.Scanner; 
/**
 *
 * @author alumno
 */
public class SPP2EGervacciRA3P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Análisis de calificaciones");
        // A partir de los datos ingresados encontrar la calificación más alta, la más baja y el promedio.
        
        //Variables
        Scanner teclado = new Scanner (System.in);
        double cal1,cal2, min,max,avg;
        
        //Ejecución
        System.out.println("Ingrese las calificaciones");
        System.out.println("Calificación 1");
        cal1 = teclado.nextDouble();
        System.out.println("Calificación 2");
        cal2 = teclado.nextDouble();
        
        max = Math.max(cal1, cal2);
        min = Math.max(cal1, cal2);
        avg = (cal1+cal2)/2;
        
        //Resultados
        System.out.println("La calificación más alta es:" + max);
        System.out.println("La calificación más baja es:" + min);
        System.out.println("El promedio es:" + avg);
        
    }
    
}
