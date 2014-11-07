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

public class StatusMahasiswa {
    public static void main (String args[]){
    double nilai=Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan Nilai :"));
    
    if (nilai > 80){
        JOptionPane.showMessageDialog(null, "Anda lulus dengan Memuaskan (A)");
      } 
    else if (nilai >70){
        JOptionPane.showMessageDialog(null, "Anda lulus dengan standar (B)");
    }
    else if (nilai >60){
        JOptionPane.showMessageDialog(null, "Anda lulus biasa (C)");
    } else if ((nilai >=50) && (nilai <=60)) {
        JOptionPane.showMessageDialog(null, "Anda lulus cukup (D)");
    }
    else {
        JOptionPane.showMessageDialog(null, "Anda tidak lulus (E)");
    }
    }
}

