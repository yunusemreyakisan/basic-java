public class OgrenciKrediManager extends BaseKrediManager{
    //overriding
    public double hesapla(double tutar){
        return tutar * 1.10;
    }
}
//BaseKrediManager üzerindeki hesapla() methodunu burada ezdik ve öğrenci için farklı bir kredi fazi değeri belirledik.
//Farklı bir sınıf miras aldığı sınıfı ezebilir. Overridable
//Buradaki asıl trick oluşturduğumuz sınıfın methodun olduğu sınıftan miras almasıdır.
