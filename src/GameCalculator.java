public abstract class GameCalculator {
    public abstract void puanHesapla(); //herkes kendi hesapla() fonk. yazmak zorunda oluyor. (abstract yazarsak)

    public final void gameOver(){ //değişmez
        System.out.println("Oyun bitti.");
    }
}
//abstract sınıflar asla newlenemez. new yapısı ile kullanılamaz.!!!!
