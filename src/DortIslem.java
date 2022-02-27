public class DortIslem {
    public int Topla(int sayi1, int sayi2) { //iki sayı parametreli
        return sayi1 + sayi2;
    }

    public int Topla(int sayi1, int sayi2, int sayi3) { //method overloading - iki metod ismi de aynıydı fakat parametre farkından dolayı hata vermedi.
        return sayi1 + sayi2 + sayi3;
    }

    public int Cikar(int sayi1, int sayi2) {
        return sayi1 - sayi2;
    }

    public int Carp(int sayi1, int sayi2) {
        return sayi1 * sayi2;
    }

    public int Bol(int sayi1, int sayi2) {
        return sayi1 / sayi2;
    }
}
