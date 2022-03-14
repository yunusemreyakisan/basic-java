//Değişken isimlendirme kuralları:
//CamelCase kuralıyla isimlendirme yaparken isimlerin ilk harfi büyük olmalı. Örneğin: Integer UyeSayisi
//CamelCase, çoğunlukla sınıf isimlendirmelerinde kullanılır.

//Mixed Case : Integer uyeSayisi
//Sabit-değeri değişmeyen değişkenleri büyük harfle ve kelime aralarına alt çizgi koyarak yazınız.
//Örneğin: public static final Integer VARSYLN_CARPISMA_KATSAYISI;

//Java'da uygulamalar sınıflar halinde yazılır. Ayrıntılarını ilerleyen bölümlerde göreceksiniz.
//Bir sınıfın üyesi olacak değişken tanımlayacağınız zaman onun isminin önüne m getirebilirsiniz.
//Böylelikle kodunuzu okuyan kişi, bu değişken ismini nerede görürse görsün, sınıfın üyesi (member) olduğunu anlayacaktır.
//Örn: public class ProfileTask {
// private Integer mArkadasSayisi; }

//Bazı sınıf değişkenleri static olarak tanımlanırlar. Böyle değişkenlerin adının önüne s ön eki getirebilirsiniz.
//Bu da onun diğer değişkenlerden ayrılmasını kolaylaştırılacaktır.
//Örneğin: public class ProfileTask {
//    private Integer mArkadasSayisi;
//    private static Integer sEtkinIslemSayisi; }




public class TemelKonular {
    public static void main(String[] args) {
        greetings(); // Hello Java
        // degiskenler(); // degiskenler
        // ifelse(); // ifelse
        // switchyapisi(); // switchcase
        // fordongusu(); // for dongusu
        // whileyapisi(); // while dongusu
        // doWhileYapisi(); // do while dongusu
        // diziler(); // diziler
        // stringler(); // stringler
        // miniProjeler(); // mini projeler

    }

    // Selamlama
    public static void greetings() {
        System.out.println("Hello Java"); // print to screen
    }

    // degiskenler
    public static void degiskenler() {
        // variables (case sensitive)
        int tamSayi = 25; // Integer
        String message = "Java 101"; // String
        double ondalikliSayi = 25.5;
        char karakter = 'B'; // Char (Tek tırnak ile kullanılır.)
        boolean dogruMu = false; // Boolean (True-False)

        System.out.println("Tam sayımız : " + tamSayi); // print to screen
        System.out.println(message);
        System.out.println(ondalikliSayi);
        System.out.println(karakter);
        System.out.println(dogruMu);
    }

    // if-else
    public static void ifelse() {
        // if-else
        int tamSayi = 21;
        if (tamSayi < 20) {
            System.out.println("Tam sayı 20 sayısından küçüktür.");
        } else if (tamSayi == 20) {
            System.out.println("Tam sayı 20 sayısına eşittir.");
        } else {
            System.out.println("Tam sayı 20 sayısından büyüktür.");
        }
    }

    // switch case
    public static void switchyapisi() {
        String puan = "A";
        switch (puan) {
            case "F":
                System.out.println("Dersten kaldınız!");
                break;
            case "D":
                System.out.println("Dersi tekrar ediniz.");
                break;
            case "A":
                System.out.println("Tebrikler, dersi geçtiniz.");
                break;
        }
    }

    // for döngüsü
    public static void fordongusu() {
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }
    }

    // while döngüsü
    public static void whileyapisi() {
        int i = 5;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
    }

    // do while döngüsü
    public static void doWhileYapisi() {
        int j = 1;
        do {
            System.out.println("Emre");
            j++;
        } while (j < 10);
    }

    // Diziler
    public static void diziler() {
        String[] ogrenciler = new String[3];
        ogrenciler[0] = "Yunus Emre";
        ogrenciler[1] = "Yağız Erhan";
        ogrenciler[2] = "Efe";

        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }
        // veya
        for (String ogrenci : ogrenciler) { // clean code
            System.out.println(ogrenci);
        }

        // Diziler Örnek-1
        double[] myList = { 1.2, 3.4, 4.5, 5.6 };
        double total = 0;
        double enBuyukSayi = myList[0];
        for (double numbers : myList) {
            if (enBuyukSayi < numbers) { // listeyi dolaşır.
                enBuyukSayi = numbers; // listedeki en büyük sayıyı değişkene atar.
            }
            total = total + numbers;
            System.out.println(numbers);
        }
        System.out.println("Sayıların toplamı: " + total);
        System.out.println("Listenin en büyüğü: " + enBuyukSayi);

        // Çok boyutlu diziler Örnek-1
        String[][] futbolTakimlari = new String[2][3]; // Bölge - Takım

        futbolTakimlari[0][0] = "Galatasaray";
        futbolTakimlari[0][1] = "Trabzonspor";
        futbolTakimlari[0][2] = "Beşiktaş";
        futbolTakimlari[1][0] = "Barcelona";
        futbolTakimlari[1][1] = "Real Madrid";
        futbolTakimlari[1][2] = "Atletico Madrid";

        for (int i = 0; i <= 1; i++) {
            System.out.println("---------------------");
            for (int j = 0; j <= 2; j++) {
                System.out.println(futbolTakimlari[i][j]); //
            }

        }
    }

    // Strings
    public static void stringler() {
        String message = "Tek tabanca yaşamak güzel!";
        System.out.println(message);

        System.out.println(message.length()); // Mesajın karakter uzunluğunu verir.
        System.out.println("5. elemanı : " + message.charAt(4)); // 5.elemanı verir.
        System.out.println(message.concat(" TEK TABANCA")); // Birleştirme
        System.out.println(message.startsWith("B")); // Boolean, B ile başlıyor mu? false
        System.out.println(message.endsWith("!")); // Boolean, ! ile bitiyor mu? true (ilk mesaja bakar. SATIR 106)
        System.out.println(message.indexOf("a")); // a harfinin kaçıncı indeksde olduğunu söyler.
        System.out.println(message.lastIndexOf("e")); // aramaya sağdan başlar ve index verir.

        char[] karakterler = new char[6];
        message.getChars(0, 6, karakterler, 0);
        System.out.println(karakterler);

        System.out.println(message.replace("T", "S")); // Yer degistirir.
        System.out.println(message.substring(2)); // 2.indexten sonrasını yazdırır. (2.index dahil.)
        System.out.println(message.substring(2, 4)); // 2.indeksten başla, 4.indekse kadar parçala (4.index dahil
                                                     // degil!)

        for (String kelime : message.split(" ")) { // Split belirttiğimiz yerden kelimeleri ayırıp bir diziye çevirir.
            System.out.println(kelime);
        }

        System.out.println(message.toLowerCase()); // Kelimeleri küçük harf yapar.
        System.out.println(message.toUpperCase()); // Kelimeleri büyük harf yapar.
        System.out.println(message.trim()); // Başta ve sondaki boşlukları siler.
    }

    // --------Temel Konular Bitiş----------//
}
