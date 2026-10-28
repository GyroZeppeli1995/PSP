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
public class U2A10_Lanzador {
    
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //Creamos el comando para ejecutar la otra clase
        String comando = "java psp.actividades.U2A10_Sumador ";
        
        
        System.out.println("Introduce el primer numero :");
        String argumento1 = input.nextLine();
        System.out.println("Introduce el segundo numero :");
        String argumento2 = input.nextLine();
        
        //Fusionamos como argumentos los numeros
        comando += argumento1 + " " + argumento2;
        
        //Preparamos el process builder
        String classpath = System.getProperty("java.class.path"); 
        
        //Creamos el objeto
        ProcessBuilder pb = new ProcessBuilder(comando.split("\\s"));
        
        //Le pasamos la ruta de clase
        pb.directory(new File(classpath));
        //Redireccionamos la consola
        pb.redirectInput(ProcessBuilder.Redirect.INHERIT);
        pb.redirectError(ProcessBuilder.Redirect.INHERIT);
        //Lo lanzamos
        pb.start();
        
    }
    
    
    
}
