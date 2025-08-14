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
public class Punto4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nombre;
        int edad;
        
        System.out.print("Ingrese su nombre ");
        nombre = input.nextLine();
        System.out.print("Ingrese su edad ");
        edad = input.nextInt();
        
        System.out.println("Su nombre es " +nombre+ " y su edad es " +edad);
    }
    
}
