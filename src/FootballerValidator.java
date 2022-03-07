public class FootballerValidator {
//Bir methodu static yaptığımızda onu class ismiyle çağırabiliyoruz.
    //Fakat static method tüm kullanıcılara aynı şeyi göstermek vermek amaçlı kullanılmalıdır.
    //Uygulama sıfırlanmadan bellekten atılmaz.
    public static void futbolcuMu(){
       if(!Footballer.name.isEmpty() && Footballer.number ==7){
           System.out.println(Footballer.name + " nun forma numarası 7'dir.");
       }else{
           System.out.println("Futbolcu adı boş veya numarası 7'ye eşit değil. Kontrol ediniz.");
       }
    }
}
