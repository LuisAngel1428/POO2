/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clase4poo2;


/**
 *
 * @author Usuario
 */
public class Clase4Poo2 {

    public static void main(String[] args) {
        //Declarar una variable del tipo de la clase
        persona asesor;
        
        
        //instanciacion de la clase
        asesor = new persona();
        
        
        
        //asignacion para atributo de la clase
        asesor.nombre = "Luis Gil";
        asesor.edad = 23;
        
        System.out.println("Hola " + asesor.nombre);
        System.out.println("tiene" + asesor.edad);
        
    }
}
