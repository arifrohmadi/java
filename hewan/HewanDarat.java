/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hewan;

/**
  program mengenai instansiasi hewandarat
  @author nurdi
 */



public class HewanDarat { 
    public static void main(String[] args) {
    
    String suaraHewan=""; 
    
    //namakelas namaobjek = new namakelas();
    Kucing anggora = new Kucing();
    suaraHewan = anggora.mengeong();
    
    // untuk memanggil methods namaobjek.methods
    anggora.mengeong();
    System.out.print("Kucing Anggora \n"+suaraHewan);
    System.out.println("\nsifat kucing:"+anggora.warna);
    
    // \n berfungsi sebagai enter
    
    Ayam bangkok = new Ayam();
    suaraHewan = bangkok.berkokok();
    System.out.println("Suara Ayam "+suaraHewan);
    
    Kambing etawa = new Kambing();
    suaraHewan = etawa.mengembek();
    System.out.println("Suara Kambing "+suaraHewan);
   
    }
}

class Kucing{
String warna="merah";
String sifat="pemalu";

//methods
//modifier variabel perilaku(){}
public String mengeong(){
   String miuw = new String("meeooong");
   return miuw;
}
}

class Kambing{
public String mengembek(){
String suara = new String("Zmbeeek");
return suara;
}
}

class Ayam{
public String berkokok(){
String suara = new String("kukuruyuk");
return suara;
}
}