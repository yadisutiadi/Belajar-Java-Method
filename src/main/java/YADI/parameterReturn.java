package YADI;

public class parameterReturn {

    //contoh parameter
   // static void greeting(String nama, Integer umur){
     //   System.out.println("HASIL PARAMETER :" + nama + umur + "tahun");
    //}

    //contoh parameter menggunakan return
    //contoh 1 dari method 1
    static String greeting(String nama, Integer umur){
        System.out.println("HASIL PARAMETER :" + nama + umur + "tahun");
        return nama + umur;
    }
    //contoh 2 dari method 2
    static int penjumlahan ( int a, int b){
        return a + b ;
    }

    public static void main(String[] args) {
       String data = greeting("yadi", 25);
        System.out.println(data);
       String date = greeting("iday", 27);
        System.out.println(date);
        int hasil = penjumlahan(4,6);
        System.out.println(hasil);
    }
}
