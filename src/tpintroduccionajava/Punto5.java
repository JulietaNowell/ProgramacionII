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
public class Punto5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero1, numero2, suma, resta, multiplicacion, division;
        
        System.out.print("Ingrese un numero entero ");
        numero1 = input.nextInt();
        System.out.print("Ingrese otro numero entero ");
        numero2 = input.nextInt();
        
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multiplicacion = numero1 * numero2;
        division = numero1 / numero2;
                
        
        System.out.println("El resultado de la suma entre " +numero1+ " y " +numero2+ " es " +suma);
        System.out.println("El resultado de la resta entre " +numero1+ " y " +numero2+ " es " +resta);
        System.out.println("El resultado de la multiplicacion entre " +numero1+ " y " +numero2+ " es " +multiplicacion);
        System.out.println("El resultado de la division entre " +numero1+ " y " +numero2+ " es " +division);
    }
    
}
