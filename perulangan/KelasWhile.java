/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perulangan;

/**
 * Menampilkan Bilangan Cacah
 * @author AMAZING
 */
public class KelasWhile {
    public static void main (String args[]){
    int bilCacah=0; //kondisi awal
    
    while (bilCacah <=10){ //kondisi akhir
        System.out.print(bilCacah+" ");
        bilCacah++; //increment (+1)
    }
    System.out.println("\n");
    
    //buat yang decrement (looping menurun)
    bilCacah=10;
    while (bilCacah >=0){ //kondisi akhir
        System.out.print(bilCacah+" ");
        bilCacah--; //decrement (-1)
    }
    }
}
