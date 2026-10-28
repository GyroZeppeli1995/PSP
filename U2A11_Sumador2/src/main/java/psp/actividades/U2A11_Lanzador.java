/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package psp.actividades;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Salvador Pareja Asín
 */
public class U2A11_Lanzador {
    
    public static void main(String[] args) throws IOException {
        //Creamos el comando para ejecutar la otra clase
        String comando = "java psp.actividades.U2A11_Sumador2 ";
        String argumento = "./datos/numeros.txt";
        
        File fichero = new File(argumento);
        
        
        
        //Preparamos el process builder
        String classpath = System.getProperty("java.class.path"); 
        
        //Creamos el objeto
        ProcessBuilder pb = new ProcessBuilder(comando.split("\\s"));
        
        
        //Le pasamos la ruta de clase
        pb.directory(new File(classpath));
        pb.redirectInput(fichero);
        //Redireccionamos la consola
        pb.redirectOutput(ProcessBuilder.Redirect.INHERIT);
        pb.redirectError(ProcessBuilder.Redirect.INHERIT);
        //Lo lanzamos
        pb.start();
        
    }
    
    
    
}
