/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package psp.actividades;

import java.io.IOException;

/**
 *
 * @author Salvador Pareja Asín
 */
public class U2A13_Interprete {
    
    public static void main(String[] args) throws IOException {
        try {
            ProcessBuilder pb = new ProcessBuilder(args);
            pb.redirectError(ProcessBuilder.Redirect.INHERIT);
            pb.redirectOutput(ProcessBuilder.Redirect.INHERIT);
        
            Process p = pb.start();
            p.waitFor();
            
        } catch (Exception e) {
            System.err.println("> ERROR: " + e.getMessage());
        }
        
        
    }
    
}
