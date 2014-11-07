/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author AMAZING
 */
import javax.swing.JOptionPane;

public class Fibonacci {

    public static void main(String args[]) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah barisan fibonacci yang ingin ditampilkan : "));
        int[] angka = new int[n];

        for (int i = 0; i < angka.length; i++) {
            if (i == 0) {
                angka[i] = 1;
                System.out.print(angka[i] + " ");
            } else if (i == 1) {
                angka[i] = 1;
                System.out.print(angka[i] + " ");
            } else
            {
                angka[i]=angka[i-2]+angka[i-1];
                System.out.print(angka[i] + " ");
            }
        }
    }
}
