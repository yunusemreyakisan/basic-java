public class Main {
    // Mini Projeler
    public static void miniProjeler() {
        // Asal Sayı Bulma
        int number = 23;
        boolean asalMi = true;

        for (int i = 2; i < number; i++) {
            if (number % 2 == 0) {
                asalMi = false;
            }
        }
        if (asalMi) {
            System.out.println("Bu sayı asaldır.");
        } else {
            System.out.println("Bu sayı asal değildir!");
        }

        // Kalın sesli veya ince sesli harf bulma
        char harf = 'A';
        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın sesli harftir.");
                break;
            default:
                System.out.println("İnce sesli harftir.");
        }

        // Mükemmel Sayılar 6,28
        int sayi = 6;
        int toplam = 0;

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam = toplam + i;
            }
        }
        if (toplam == sayi) {
            System.out.println("Mükemmel sayıdır.");
        } else {
            System.out.println("Mükemmel sayı değildir.");
        }
    }

    // Metodlar
    public static void metodlar() {
        

    }
}