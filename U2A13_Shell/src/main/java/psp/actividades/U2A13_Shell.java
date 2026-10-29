/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package psp.actividades;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Salvador Pareja Asín
 */
public class U2A13_Shell {
    

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner input = new Scanner(System.in);
        
        String comandoUsuario = "";
        
        
        while (!comandoUsuario.equalsIgnoreCase("exit")) {
            String comando = "java psp.actividades.U2A13_Interprete ";
            System.out.println("Introduzca el comando del shell: ");
            
            
            comandoUsuario = input.nextLine();
            comando += comandoUsuario;
             //Preparamos el process builder
            String classpath = System.getProperty("java.class.path");
            if(!comandoUsuario.equalsIgnoreCase("exit"))
            {
                ProcessBuilder pb = new ProcessBuilder(comando.split("\\s"));
                pb.directory(new File(classpath));
            
                pb.redirectOutput(ProcessBuilder.Redirect.INHERIT);
                pb.redirectError(ProcessBuilder.Redirect.INHERIT);
                Process p = pb.start();
                p.waitFor();
                
                
            }
            
            
            
        }
        
        
        
    }
}
