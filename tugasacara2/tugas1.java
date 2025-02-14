/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasacara2;
import java.util.Scanner;
/**
 *
 * @author Nikmatul Zumroh
 */
public class tugas1 {
    public static void main(String[] args) {
        System.out.println("   ==============================     ");
        System.out.println("     Kharisma Agung Plaza (KAP)       ");
        System.out.println("  Khusus Pembelian 5 Barang Pertama   ");
        System.out.println("  Dengan harga minimum Rp 100000,00   ");
        System.out.println("  =================================   ");
        
        String namaPembeli;
        int hargaBarang = 0;
        int totalHarga = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan nama pembeli : ");
        namaPembeli = scan.nextLine();
        for(int i = 1; i<=5; i++){
           
        System.out.print("Masukkan harga barang ke  "+ i+" :");
        hargaBarang = scan.nextInt();
        totalHarga += hargaBarang;
        }
        System.out.println("Total harga pembelian atas nama "+ namaPembeli +" adalah Rp "+totalHarga);
        
        if (hargaBarang >= 100000) {
            System.out.println("Selamat......");
            System.out.println(" Anda mendapatkan hadiah 1 buah mug cantik ");
        }
        System.out.println("     Terima Kasih    ");
        System.out.println(" Anda sudah berbelanja di Kharisma Agung Plaza ");
    }
    
}