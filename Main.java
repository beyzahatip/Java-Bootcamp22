public class Main {


    public static void main(String[] args) {


        //Hello World
        System.out.println("Merhaba Java");

        //Variables
        int ogrenciSayisi = 12;
        String mesaj = "Öğrenci sayısı : ";
        System.out.println(mesaj+ogrenciSayisi);

        //DataTypes
        double sayi = 12.5;
        int sayi2 = 5;
        boolean dogruMu = false ;

        //If statements
        int sayi3 = 19;
                if(sayi3<20){
                    System.out.println("Sayı 20 den küçüktür.");
                }
                else if(sayi3>20){
                    System.out.println("Saı 20 den büyüktür");
                }
                else{
                    System.out.println("sayı 20 ye eşittir");
                }

        //Arrays
        String [] ogrenciler = new String[3];
                ogrenciler[0] = "Cagatay";
                ogrenciler[1] = "Ahmet";
                ogrenciler[2] = "Mehmet";



    }

}
