/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package psp.actividades;

import java.util.Scanner;
import psp.actividades.Utilidades.Utilidad;

/**
 *
 * @author Salvador Pareja Asín
 */
public class U2A10_Sumador {

    public static void main(String[] args) {
        
        //Input
        Integer numero1 = Utilidad.TryParseInt(args[0]);
        Integer numero2 = Utilidad.TryParseInt(args[1]);
        
        System.out.println("Sumas ejecutandose...");
        if(numero1 == null || numero2 == null)
        {
            System.out.println("No se pueden sumar");
        }
        else
        {
            System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + (numero1+numero2));
        }
        
        
        
        
        
        
    }
}
