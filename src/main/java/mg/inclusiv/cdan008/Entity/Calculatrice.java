/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mg.inclusiv.cdan008.Entity;

/**
 *
 * @author Inclusiv Academy 009
 */
public class Calculatrice {
    
    //fonction addition
    public static double Addition (double a, double b){
        return a + b ;
    }
    
    //fonction soustraction
    public static double Soustraction (double a, double b){
        return  a - b ;
    }
    
    //fonction miltiplication
    public static double Multiplication (double a, double b){
        return a * b ;
    }
    
    //fonction division
    public static float Division (float a, float b){
         if (b == 0) {
                throw new IllegalArgumentException("Le diviseur ne peut être zéro");

        } else {
            return a / b;
        }
    }
}
