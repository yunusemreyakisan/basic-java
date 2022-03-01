public class MySqlCystomerDal implements ICustomerDal, IRepository{ //interface üzerinde extends yerine implement ediyoruz. Birden fazla sınıf implement edilebilir.
    @Override
    public void Add() {
        System.out.println("MySQL eklendi.");
    }

    //IRepository sınıfından gelen method implement edildi.
    @Override
    public void Update() {
        System.out.println("Güncellendi.");
    }
}
