/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package psp.actividades.Utilidades;

/**
 *
 * @author Salvador Pareja Asín
 */
public class Utilidad {
    
    public static Integer TryParseInt(String someText) {
        try {
           return Integer.parseInt(someText);
        } catch (NumberFormatException ex) {
           return null;
        }
    }
    
}
