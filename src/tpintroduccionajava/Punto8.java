/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tpintroduccionajava;

import java.util.Scanner;

/**
 *
 * @author jnowell
 */
public class Punto8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero1, numero2,division;
        
        System.out.print("Ingrese un numero entero ");
        numero1 = input.nextInt();
        System.out.print("Ingrese otro numero entero ");
        numero2 = input.nextInt();
        
        division = numero1 / numero2;
                
        System.out.println("El resultado de la division entre " +numero1+ " y " +numero2+ " es " +division);
        
        System.out.println("El resultado de la division entre " +numero1+ " y " +numero2+ " en decimales es " + (double) +division);
    }
    
}
