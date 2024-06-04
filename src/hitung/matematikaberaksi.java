package hitung;

public class matematikaberaksi {
    public  static void main(String[] args) {
        // membuat objek
        matematika edo = new matematika(1,5);
        
        System.out.println("hasil penjumlahan: "+edo.setpenjumlahan());
        System.out.println("hasil pengurangan: "+edo.setpengurangan());
        System.out.println("hasil perkalian: "+edo.setperkalian());
        System.out.println("hasil pembagian: "+edo.setpembagian());
    }
}
