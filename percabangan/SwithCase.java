package percabangan;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author AMAZING
 */
import javax.swing.JOptionPane;

public class SwithCase {
    public static void main (String args[]){
      int pil = Integer.parseInt(JOptionPane.showInputDialog("Masukkan hari dalam angka :)"));
      
      switch (pil){
          case 1:
          System.out.println("Minggu");
          break;
          case 2:
          System.out.println("Senin");
          break;
          case 3:
          System.out.println("Selasa");
          break;
          case 4:
          System.out.println("Rabu");
          break; 
          case 5:
          System.out.println("Kamis");
          break;
          case 6:
          System.out.println("Jumat");
          break;
          case 7:
          System.out.println("Sabtu");
          break;    
          default:
          System.out.println("Hari tidak diketahui");
      }
      
    }
}
