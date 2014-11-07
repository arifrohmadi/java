/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perulangan;

/**
 *
 * @author AMAZING
 */
import javax.swing.JOptionPane;


public class Faktorial {
    public static void main (String args[]){
        
        int bil;
        int hasil=1;String k;
        
        
        do {
        bil=Integer.parseInt(JOptionPane.showInputDialog(null,"Masukkan Angka ","Program Faktorial",1));
        hasil=1;
        for (int i=bil; i>1;i--){
            hasil=hasil*i;
            System.out.print(i+"*");
          }
        System.out.print("1 ="+hasil+"\n");
        k=JOptionPane.showInputDialog(null, "Ulangi lagi ? (y/n): ","Program Faktorial",1); 
        } while (k.equals("y"));
     
    }
}