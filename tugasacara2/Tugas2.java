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
public class Tugas2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("---------------------------");
        System.out.println("        CAFE CERIA     ");
        System.out.println("       ANEKA MINUMAN      ");
        System.out.println("---------------------------");
        System.out.println("       SPESIAL MENU       ");
        System.out.println(" 1. Soft drink ");
        System.out.println(" 2. Mix juice");
        System.out.println(" 3. Nescafe");
        System.out.println(" 4. Soda milk");
        System.out.println(" 5. Tea");
        
        String namaPembeli;
        System.out.print("Masukkan nama pembeli : ");
        namaPembeli = scan.nextLine();
        int namaMenu;
        System.out.print("Silahkan masukkan pilihan anda : ");
        namaMenu = scan.nextInt();
        switch(namaMenu){
            case 1 :
                System.out.println("Minuman yang anda pesan adalah Soft drink");
            break;
            
            case 2:
                System.out.println("Minuman yang anda pesan adalah Mix juice");
            break;
            
            case 3:
                System.out.println("Minuman yang anda pesan adalah Nescafe");
            break;
            
            case 4:
                System.out.println("Minuman yang anda pesan adalah Soda Milk");
            break;
            
            case 5:
                System.out.println("Minuman yang anda pesan adalah Tea");
            break;
        }
        System.out.println("Pesanan anda akan kami antar ");
        System.out.println("Terima kasih "+ namaPembeli + " telah berkunjung di Cafe Ceria");
    }
    
}
