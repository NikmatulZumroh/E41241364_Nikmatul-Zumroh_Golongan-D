/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Acara9dan10;
import java.util.Scanner;

public class segitigaTerbalik {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan tinggi segitiga: ");
        int tinggi = scan.nextInt();

        for (int i = tinggi; i >= 1; i--) {
            // Cetak spasi
            for (int j = 1; j <= tinggi - i; j++) {
                System.out.print(" "); // Menggunakan print bukan println
            }

            // Cetak bintang
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scan.close();
    }
}