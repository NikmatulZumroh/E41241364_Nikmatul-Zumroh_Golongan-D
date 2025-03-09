/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Konstruktor;

/**
 *
 * @author Nikmatul Zumroh
 */
public class A { 
    A(){} // Konstruktor default, diperlukan hanya agar program dapat 
          // Dikompilasi
    A(String param1){
        System.out.println("Konstruktor class A dengan Parameter "+param1 + "dieksekusi ...");
    }
}
