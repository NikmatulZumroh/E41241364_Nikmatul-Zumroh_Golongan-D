/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prosedurkerja2;
import java.util.Scanner;
/**
 *
 * @author Nikmatul Zumroh
 */
public class switchcase {
    public static void main(String[] args) {
        //Membuat variabel scanner
        String lampu;
        Scanner scan = new Scanner (System.in);
        //Mengambil input
        System.out.print("Inputkan warna : ");
        lampu = scan.nextLine();
        switch(lampu){
            case("merah"):
                System.out.print("Lampu merah, berhenti!");
                break;
            case("kunig"):
                System.out.print("Lampu kuning, harap berhati - hati!");
                break;
            case("hijau"):
                System.out.print("Lampu hijau, silahkan jalan!");
                break;
            default:
                System.out.print("Warna lampu salah!");
        }
    }
}
