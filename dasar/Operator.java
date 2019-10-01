package dasar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Indonesia Sedang AMAZING
 */
public class Operator {
    public static void main (String args[]){
       int a=5;
       int b=6;
       int c=10;
       double hasil;
       double hasil2;
       hasil = a+b;
       hasil +=1; //merupakan versi singkat dari
       //System.out.println(hasil);
       
       hasil = 7;
       hasil -=1; //hasil=hasil-1   
       //System.out.println(hasil);
       
       hasil /=4;
       //System.out.println(hasil);
       
       hasil = a;
       System.out.println(hasil);
       hasil = a++; //nilai a masih 5
       //setelah dipanggil nilai a menjadi a+1 =6
       System.out.println("hasil = "+hasil+ " nilai a="+a); 
       
       hasil = ++a; //diawal nilai a sudah ditambah 1 = 6+1 =7
       System.out.println("hasil = "+hasil+ " nilai a="+a);
       
       //membuat operasi perkalian dan pengurangan dengan variabel hasil2
       hasil2=b*c;
       System.out.println(hasil2);
       
       hasil2 = 5%2;
       System.out.println(hasil2);
    }
}
