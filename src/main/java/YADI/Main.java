package YADI;

public class Main {
    //contoh penggunaan static yang langsung bisa di dipanggil tanpa inisialisasi
   // static void greeting (){
     //   System.out.println("HASIL TANPA INISIALISASI");
    //}

    //contoh penggunaan NON static yang HARUS DI Inisialisasi
   // void greeting(){
     //   System.out.println("HASIL HARUS DI INISIALISASI");
    //}


    //contoh penggunaan static dengan parameter
        static void greeting(String nama){
            System.out.println("HASIL STATIC DENGAN PARAMETER " + nama );
    }

    public static void main(String[] args) {
        // greeting(); // memanggil greeting tanpa inisialsasi atau penggunaan static
        //   Main main = new Main();   // memanggil greeting DENGAN inisialsasi atau penggunaan NON static
        // main.greeting();
        //main.greeting();
    }

}

