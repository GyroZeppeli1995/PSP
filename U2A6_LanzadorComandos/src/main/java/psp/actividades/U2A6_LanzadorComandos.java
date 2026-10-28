/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package psp.actividades;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Salvador Pareja Asín
 */
public class U2A6_LanzadorComandos {

    public static void main(String[] args) {
        //Definimos el comando a ejecutar
        String[] command = args;
        
        //Creamos el process builder con nuestros comandos
        ProcessBuilder pb = new ProcessBuilder(command);
        
        
        try {
            
            //Lo encapsulamos en un process
            Process p = pb.start();
            //Enganchamos la salida de la consola
            BufferedReader processOutput = new BufferedReader(new InputStreamReader(p.getInputStream()));
            
            //Creamos un buffer 
            String lineaString;
            
            //creamos un bucle que leera lo que tire la salida del proceso hasta que se quede seco
            while ((lineaString = processOutput.readLine()) != null) {
                //Mostramos lo que salga del proceso
                System.out.println(lineaString);
                
                
            }
            //Cerramos el enganche del proceso
            processOutput.close();
            
            
        } catch (Exception e) {
            //Tiramos cualquier error por consola
            System.out.println("ERROR: " + e.getMessage());
            //Rastreamos su origen
            e.printStackTrace();
        }
        
        
        
    }
}
