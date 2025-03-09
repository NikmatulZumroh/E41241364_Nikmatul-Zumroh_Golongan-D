/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pewarisan;

/**
 *
 * @author Nikmatul Zumroh
 */
public class B extends A{ // Mendeklarasikan class B yang diturunkan 
    int z;                // dari Class A
    
    void TampilanJumlah(){
        //Subclass dapat mengakses member dari superclass
        System.out.println("Jumlah : " + (x+y+z));
    }
}
