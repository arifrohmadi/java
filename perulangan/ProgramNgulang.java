package perulangan;

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

public class ProgramNgulang {

    public static void main(String args[]) {
        String ulang = "";
        do {
            String input = JOptionPane.showInputDialog("Masukkan Kalimat : ");
            System.out.println("Kalimat yang Anda inputkan : " + input);
            ulang = JOptionPane.showInputDialog("Apakah ingin mengulangi ? (y/n) ");
            if (ulang.equalsIgnoreCase("n")){
                System.exit(0);
            } else if (!ulang.equalsIgnoreCase("y")){
                JOptionPane.showMessageDialog(null, "inputan salah");
                ulang=JOptionPane.showInputDialog("Apakah ingin mengulangi ? (y/n) ");
            }
        } while (ulang.equalsIgnoreCase("y"));
    }
}
