public class Main {

    public static void main(String[] args) {
        metodYapisi();
        String sonuc = sonucuBul();
        // String hataliSonuc = hataliSonucuBul(); //String bir metod tanımladığımızda
        // string bir değer döndürmeliyiz.
        sayiBul();
        ondalikliSayi();
        int topla = ikiSayiyiTopla(5, 6); //11
        System.out.println("Toplam : " + topla);
        toplayalim(23, 34, 3, 2, 1); //Birden fazla sayıyı diziye çeviriyor.
        System.out.println("Çoklu toplam: " +toplayalim(2, 2, 4, 5));
    }

    public static void metodYapisi() {
        System.out.println("Merhaba");
    }

    public static String sonucuBul() {
        return "Merhaba"; // String döndürdüm hata almadım.
    }

    /*
     * public static String hataliSonucuBul() {
     * return 6; //String döndürmezsem hata alırım.
     * }
     */

    public static int sayiBul() {
        return 6; // int döndürüyor.
    }

    public static Double ondalikliSayi() {
        return 3.14; // Double döndürüyor.
    }

    public static int ikiSayiyiTopla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    public static int toplayalim(int... toplama) {
        int toplam = 0;
        for (float sayilar : toplama) {
            toplam += sayilar;
        }
        return toplam;
    }




}