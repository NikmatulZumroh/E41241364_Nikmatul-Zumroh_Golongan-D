/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nomor1Acarra17_18;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Nikmatul Zumroh
 */
public class DrawShapes extends JPanel{
    Font font;
    Color redColor;
    Color blueColor;
    Color backgroundColor;
    
    
     public DrawShapes() {
         // The Font is Arial size, 18 and is italicized
        font = new Font("Arial", Font.ITALIC, 18);
        
        // Some color are predefined in the  Color class
        redColor = Color.red;
        backgroundColor = Color.orange;
        
        //Color can be  created using Red, Greeen, Blue values
        blueColor = new Color(0,0,122);
        
        //Set the background Color of the applet
        setBackground(backgroundColor);
    }
     public void stop(){         
     }
     public void paint(Graphics graph){
         super.paintComponent(graph); // Memanggil metode dari JPanel untuk menggambar background
         //Set font 
        graph.setFont(font);        
        //Create a little
        graph.drawString("Draw Shapes",90,20);
        
        // Set the color for the first shape
        graph.setColor(blueColor);
        
        // Draw a rectangle using drawRect (int x, int y, int width, int height)
        graph.drawRect(120,120,120,120);
        
        //This will fill a rectangle
        graph.fillRect(115,115,90,90);
        
        //Set the color for the next shape
        graph.setColor(redColor);
        
        //Draw a circle using drawAtc(int x,int width,int height,int startAngle,int arcAngle)
        graph.fillArc(110,110,50,50,0,360);
        
        // set color for next shape
        graph.setColor(Color.CYAN);
        
        // Draw another rectangle
        graph.drawRect(50, 50, 50, 50);
        
        // This will fill a rectangle
        graph.fillRect(50, 50, 60, 60);
     }
     // Method main untuk menampilkan JFrame
    public static void main(String[] args) {
        // Membuat JFrame untuk menampilkan panel
        JFrame frame = new JFrame("Draw Shapes");

        // Menambahkan panel yang sudah didefinisikan
        frame.add(new DrawShapes());

        // Mengatur ukuran JFrame
        frame.setSize(400, 400);

        // Menutup aplikasi ketika jendela ditutup
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Menampilkan JFrame
        frame.setVisible(true);
    }
}
