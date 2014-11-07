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
public class Kelas2Dimensi {
    public static void main (String args[]){
    int angka[][] = new int [5][4];
    
    for (int i=0; i<angka.length; i++){
        angka[i][0]=i+1;
        for (int j=0; j< angka[i].length;j++){
        angka[0][j]=j+1;
            System.out.println(angka[i][0]+" x "+angka[0][j]);
        }
    }
    }
}
