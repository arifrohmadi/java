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

public class GanjilGenap {
    public static void main (String args[]){
        double input = Double.parseDouble(JOptionPane.showInputDialog("Masukkan angka (1-100 :)"));
        
        if (input % 2 != 0){
            JOptionPane.showMessageDialog(null, input + " adalah bilangan ganjil");
        }
        else {
            JOptionPane.showMessageDialog(null, input + " adalah bilangan genap");
        } 
    }
}
