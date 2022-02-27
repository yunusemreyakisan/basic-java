public class Main {

    public static void main(String[] args) {
        //reference type
        CustomerManager customerManager = new CustomerManager();
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        //Dört İşlem Sınıfı
        DortIslem dortIslem = new DortIslem();
        System.out.println("İki sayının çarpımı: " + dortIslem.Carp(2, 4)); //8
        System.out.println("İki sayının farkı: " + dortIslem.Cikar(4, 2)); //2
        System.out.println("İki sayının birbirine bölümü: " + dortIslem.Bol(6, 3)); //2
        System.out.println("İki sayının toplamı: " + dortIslem.Topla(5, 5)); //10

        //Değer ataması
        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1; //sayi1 sayi2 yerine atandı. sayi2 sayi1 ile aynı yeri tutuyor.
        sayi1 = 30; //sayi1 e verilen bu değer geçersizdir.
        System.out.println("Değer ataması: " + sayi2); //10 yazdırır.

        //Referans ataması (diziler)
        int[] sayilar1 = new int[]{1, 2, 3};
        int[] sayilar2 = new int[]{4, 5, 6};
        sayilar2 = sayilar1; //sayilar2 dizisinin numarası sayilar1 dizisine atandı. İkisi de şu anda aynı yeri tutuyor.
        sayilar1[0] = 10; //sayilar1 dizisinin 0.elemanına 10 atandı ve yukarıya yazıldı. Artık sayilar1 dizisi {10,2,3} oldu.
        System.out.println("Dizi referans ataması: " + sayilar2[0]);
       //Ürün oluşturma
        Product product = new Product();
        product.setDescription("Soğuk içiniz.");//Getter-Setter, Encapsulation
        product.setId(234); //Getter-Setter, Encapsulation
        product.setName("Süt"); //Getter-Setter, Encapsulation
        product.setPrice(25.99); //Getter-Setter, Encapsulation
        product.setStockAmount(100); //Getter-Setter, Encapsulation

        System.out.println("Ürün kodu: " + product.getKod()); //S234

        //Ürün ekleme
        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        String sonuc = sonucuBul();
        // String hataliSonuc = hataliSonucuBul(); //String bir metod tanımladığımızda
        // string bir değer döndürmeliyiz.
        System.out.println("Sayı bul : " + sayiBul());
        System.out.println("Ondalikli sayi : " + ondalikliSayi());
        int topla = ikiSayiyiTopla(5, 6); //11
        System.out.println("Toplam : " + topla);
        toplayalim(23, 34, 3, 2, 1); //Birden fazla sayıyı diziye çeviriyor.
        System.out.println("Çoklu toplam: " + toplayalim(2, 2, 4, 5));
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