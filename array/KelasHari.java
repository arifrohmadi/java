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
public class KelasHari {

    public static void main(String args[]) {
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};

        //System.out.println(hari.length);
        for (int i = 0; i < hari.length; i++) {
            System.out.println(hari[i] + "");
        }
        System.out.println("\n"); //enter

        int[] angka = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i] + " ");
        }
        System.out.println("\n"); //enter

        //perulangan dibalik
        for (int i=6; i>=0; i--){
            System.out.print(angka[i] + " ");
        }
        
        System.out.println("\n"); //enter
        double[] angka2 = {7, 6, 5, 4, 3, 2, 1};
        for (int i = 0; i < angka2.length; i++) {
            System.out.print(angka2[i] + " ");
        }

    }
}