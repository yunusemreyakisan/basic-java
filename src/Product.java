//attribute
public class Product {
    public Product() { //Bu parametresiz constructor. Parametreli olursa new Product() içerisine de parametre yazmak zorundayım.
        System.out.println("Yapıcı blok çalıştı.");
    }

    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private int _id;
    private String kod;

    //geri dönüşlü metod ve sadece okur. GETTER
    public int getId() {
        return _id;
    }

    //kurma anlamına gelir. YAZAR. SETTER
    public int setId(int id) {
        _id = id;
        return id;
    }

    //Getter
    public String getName() {
        return this.name;
    }

    //Setter
    public void setName(String name) {
        this.name = name;
    }

    //Getter
    public String getDescription() {
        return description;
    }

    //Setter
    public void setDescription(String description) {
        this.description = description;
    }

    //Getter
    public double getPrice() {
        return price;
    }

    //Setter
    public void setPrice(double price) {
        this.price = price;
    }

    //Getter
    public int getStockAmount() {
        return stockAmount;
    }

    //Setter
    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getKod() {
        return this.name.substring(0, 1) + getId();
    }


}
