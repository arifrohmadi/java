package dasar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author AMAZING
 */
import java.lang.Math;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class KelasMatematika {
 public static void main (String args[]){
     DecimalFormat df = new DecimalFormat("0.000");
     
     double angka = Double.parseDouble(JOptionPane.showInputDialog("Masukkan Angka : "));
     double a1 = Math.abs(angka);
     double a2 = Math.pow(angka, 2);
     double a3 = Math.sqrt(angka);
     double a4 = Math.round(angka); //pembulatan biasa
     double a5 = Math.floor(angka); //pembulatan kebawah
     double a6 = Math.ceil(angka); //pembulatan kebawah
     double a7 = Math.sin(angka); //mencari nilai sinus
     JOptionPane.showMessageDialog(null, 
             "\n nilai absolut : "+a1+
             "\n nilai kuadrat : "+df.format(a2)+
             "\n nilai akar : "+df.format(a3)+
             "\n pembulatan biasa : "+a4+
             "\n pembulatan kebawah : "+a5+
             "\n pembulatan keatas : "+a6+
             "\n pembulatan 2 angka di belakang koma : "+df.format(angka));
 }
}
