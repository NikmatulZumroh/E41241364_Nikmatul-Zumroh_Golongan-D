/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prosedurkerja;

/**
 *
 * @author Nikmatul Zumroh
 */
class book {
    int price;
    int pages;    


public void set (int price, int pages){
     this.price = price;
     this.pages = pages;
}

public void show(){
    System.out.println("books informations");
    System.out.println("books price : " + price);
    System.out.println("books pages : " + pages);
}
}
public class PK3 {
    public static void main(String[] args) {
        book javabook = new book();
        javabook.set(60000, 100);
        javabook.show();
    }
}
