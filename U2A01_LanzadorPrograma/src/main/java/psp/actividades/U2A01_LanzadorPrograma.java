/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package psp.actividades;

import java.io.IOException;

/**
 *
 * @author Salva
 */
public class U2A01_LanzadorPrograma {

    public static void main(String[] args) throws IOException, InterruptedException {
        
        //Definimos el comando a ejecutar
        String command = "notepad.exe";
        //Se lo pasamos como parametro al objeto Processbuilder
        ProcessBuilder pb = new ProcessBuilder(command);
        
        //Creamos un puntero del proceso y lo lanzamos
        Process p = pb.start();
        
        //Dejamos el Padre en espera de lo que pase con el proceso
        p.waitFor();
        
        
        
        //Por comodidad guardamos el valor de la salida del proceso en una variable para consultar mas adelante
        int tipoSalida = p.exitValue();
        
        
        //lanzamos los mensajes segun el tipo de salida
        if(tipoSalida == 0)
        {
            System.out.println("La aplicación se ha cerrado con éxito. " + tipoSalida);
        }
        else
        {
            System.out.println("La aplicación ha finalizado con código: " + tipoSalida);
        }
        
    }
}
