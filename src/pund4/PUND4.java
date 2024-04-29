/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pund4;

/**
 * Clase principal PUND4
 * @author Jorge Peñalver Quirós
 * @since 29-04-2024
 * @version 1.0 
 */
public class PUND4 {

    /**
     * Main de PUND4
     * @param args 
     */
    public static void main(String[] args) {
        Apuesta miApuesta;
        int mi_dinero;

        miApuesta = new Apuesta(1000, 4, 2);
        try {
            System.out.println("Apostando...");
            miApuesta.apostar(25);
        } catch (Exception e) {
            System.out.println("Fallo al realizar la Apuesta");
        }

        try {
            System.out.println("Intento cobrar apuesta segun el resultado del partido");
            miApuesta.cobrar_apuesta(2, 3);
        } catch (Exception e) {
            System.out.println("Fallo al cobrar la apuesta");
        }
        mi_dinero = miApuesta.getDinero_disp();
        System.out.println("El dinero que tengo tras las apuestas es " + mi_dinero);
    }
    
}