public class Main {

    public static void main(String[] args) {
        greetings(); // Hello Java
        degiskenler(); // degiskenler
    }

    // Değişkenler
    public static void greetings() {
        System.out.println("Hello Java"); // print to screen
    }

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
    }

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

}

/*
 * 
 */

// switch case
/*
 * String puan = "A";
 * switch (puan){
 * case "F" : System.out.println("Dersten kaldınız!");
 * break;
 * case "D" : System.out.println("Dersi tekrar ediniz.");
 * break;
 * case "A" : System.out.println("Tebrikler, dersi geçtiniz.");
 * break;
 * }
 */

// for döngüsü
/*
 * int tamSayi = 20;
 * for(int i = 1; i<10; i++){
 * System.out.println(i);
 * }
 */

// while döngüsü
/*
 * int i = 5;
 * while(i<10){
 * System.out.println(i);
 * i++;
 * }
 */

// do-while döngüsü
/*
 * int j = 1;
 * do{
 * System.out.println("Emre");
 * j++;
 * } while(j<10);
 */

// Diziler (Array)
/*
 * String[] ogrenciler = new String[3];
 * ogrenciler[0] = "Yunus Emre";
 * ogrenciler[1] = "Yağız Erhan";
 * ogrenciler[2] = "Efe";
 * 
 * for(int i=0; i<ogrenciler.length; i++){
 * System.out.println(ogrenciler[i]);
 * }
 * //veya
 * for(String ogrenci:ogrenciler){ //clean code
 * System.out.println(ogrenci);
 * }
 */

// Diziler Örnek-1
/*
 * double[] myList = {1.2, 3.4, 4.5,5.6};
 * double total = 0;
 * double enBuyukSayi = myList[0];
 * for(double numbers:myList){
 * if(enBuyukSayi<numbers){ //listeyi dolaşır.
 * enBuyukSayi = numbers; //listedeki en büyük sayıyı değişkene atar.
 * }
 * total = total + numbers;
 * System.out.println(numbers);
 * }
 * System.out.println("Sayıların toplamı: " + total);
 * System.out.println("Listenin en büyüğü: " + enBuyukSayi);
 */

// Çok boyutlu dizi Örnek
/*
 * String[][] futbolTakimlari = new String[2][3]; //Bölge - Takım
 * 
 * futbolTakimlari[0][0] = "Galatasaray";
 * futbolTakimlari[0][1] = "Trabzonspor";
 * futbolTakimlari[0][2] = "Beşiktaş";
 * futbolTakimlari[1][0] = "Barcelona";
 * futbolTakimlari[1][1] = "Real Madrid";
 * futbolTakimlari[1][2] = "Atletico Madrid";
 * 
 * for(int i = 0; i<=1; i++){
 * System.out.println("---------------------");
 * for(int j=0; j<=2; j++){
 * System.out.println(futbolTakimlari[i][j]); //
 * }
 * 
 * }
 */

// Strings
/*
 * String message = "Tek tabanca yaşamak güzel!";
 * System.out.println(message);
 * 
 * System.out.println(message.length()); //Mesajın karakter uzunluğunu verir.
 * System.out.println("5. elemanı : " + message.charAt(4)); //5.elemanı verir.
 * System.out.println(message.concat(" TEK TABANCA")); //Birleştirme
 * System.out.println(message.startsWith("B")); //Boolean, B ile başlıyor mu?
 * false
 * System.out.println(message.endsWith("!")); //Boolean, ! ile bitiyor mu? true
 * (ilk mesaja bakar. SATIR 106)
 * System.out.println(message.indexOf("a")); //a harfinin kaçıncı indeksde
 * olduğunu söyler.
 * System.out.println(message.lastIndexOf("e")); //aramaya sağdan başlar ve
 * index verir.
 * 
 * char[] karakterler = new char[6];
 * message.getChars(0, 6,karakterler, 0);
 * System.out.println(karakterler);
 * 
 * System.out.println(message.replace("T", "S")); //YER DEĞİŞTİRİR.
 * System.out.println(message.substring(2)); //2.indexten sonrasını yazdırır.
 * (2.index dahil.)
 * System.out.println(message.substring(2,4)); //2.indeksten başla, 4.indekse
 * kadar parçala (4.index dahil DEĞİL!)
 * 
 * for(String kelime:message.split(" ")){ //Split belirttiğimiz yerden
 * kelimeleri ayırıp bir diziye çevirir.
 * System.out.println(kelime);
 * }
 * 
 * System.out.println(message.toLowerCase()); //Kelimeleri küçük harf yapar.
 * System.out.println(message.toUpperCase()); //Kelimeleri büyük harf yapar.
 * System.out.println(message.trim()); //Başta ve sondaki boşlukları siler.
 */

// --------Temel Konular Bitiş----------//

// Mini Projeler
/*
 * //Asal Sayı Bulma
 * int number = 23;
 * boolean asalMı = true;
 * 
 * for(int i =2; i<number; i++){
 * if(number % 2 == 0){
 * asalMı = false;
 * }
 * }
 * if(asalMı){
 * System.out.println("Bu sayı asaldır.");
 * }else {
 * System.out.println("Bu sayı asal değildir!");
 * }
 * 
 * //Kalın sesli veya ince sesli harf bulma
 * char harf = 'A';
 * switch (harf) {
 * case 'A':
 * case 'I':
 * case 'O':
 * case 'U':
 * System.out.println("Kalın sesli harftir.");
 * break;
 * default:
 * System.out.println("İnce sesli harftir.");
 * }
 * 
 * //Mükemmel Sayılar 6,28
 * int sayi = 6;
 * int toplam = 0;
 * 
 * for(int i = 1; i<sayi; i++){
 * if(sayi % i == 0){
 * toplam = toplam + i;
 * }
 * }
 * if(toplam == sayi){
 * System.out.println("Mükemmel sayıdır.");
 * }else {
 * System.out.println("Mükemmel sayı değildir.");
 * }
 */

// Metodlar
