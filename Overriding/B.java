/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Overriding;

/**
 *
 * @author Nikmatul Zumroh
 */
public class B extends A{
    public void tampilkanKelayar(){
        super.tampilkanKelayar(); // Memanggil method  milik dari superclassnya
        System.out.println("Method milik class B dipanggil");
    }
}
