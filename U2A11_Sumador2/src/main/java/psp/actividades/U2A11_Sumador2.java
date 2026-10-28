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
public class U2A11_Sumador2 {
    
    public static boolean compruebaNumeros(Integer[] numeros)
    {
        boolean todoCorrecto = true;
        
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] == null)
            {
                todoCorrecto = false;
            }
            
        }
        
        return  todoCorrecto;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer[] numero = new Integer[2];
        
        
        while (input.hasNext()) {
            
            numero[0] = input.nextInt();
            numero[1] = input.hasNextInt() ? input.nextInt() : 0;
            
            if(numero[0] == null || numero[1] == null)
            {
                System.err.println("ERROR> No se pueden sumar");
            }
            else
            {
                System.out.println("> La suma de: " + numero[0] + " y " + numero[1] + " es " + (numero[0]+numero[1]) );
            }
            
        }
        
        
        
        
        
        
    }
}
