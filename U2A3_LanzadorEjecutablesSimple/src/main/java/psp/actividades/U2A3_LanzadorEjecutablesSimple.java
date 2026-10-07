/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package psp.actividades;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Salva
 */
public class U2A3_LanzadorEjecutablesSimple {

    public static void main(String[] args) throws InterruptedException, IOException {
        //Definimos el comando a ejecutar
        String[] command = args;
        //Creo una lista para manejar los procesos luego de manera individual
        ArrayList<Process> procesos = new ArrayList<>();
        
        //Comprobamos si ha recibido varios argumentos
        //como nota personal yo simplemente meteria en un try catch la creacion del proceso y comprobaria si salio nulo
        //o con parametros
        if(command.length != 0)
        {
            //Creamos un bucle para crear los procesos y añadirlos
            //Personalmente no haria un arraylist, usaria un hasmap de procesos
            //donde almacenaria como clave su PID y como valor el objeto process
            //para luego acceder a ellos
            for (int i = 0; i < command.length; i++) {
                ProcessBuilder pb = new ProcessBuilder(command[i]);
                Process p = pb.start();
                procesos.add(p);
                p.waitFor();
            }
            
            //Simplemente recorro la lista de procesos y pregunto a cada uno como acabo su ejecucion
            for (int i = 0; i < procesos.size(); i++) {
                if(procesos.get(i).exitValue() == 0)
                {
                    System.out.println("El proceso: " + i + " ha salido correctamente con: " + procesos.get(i).exitValue() );
                }
                else
                {
                    System.out.println("El proceso: " + i + " ha salido con error: " + procesos.get(i).exitValue() );
                }
                
            }
            
            
        }
        else
        {
            System.out.println("No se han recibido argumentos");
        }
        
        
        
    }
        
}
