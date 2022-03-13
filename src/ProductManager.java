public class ProductManager {
    public void Add(Product product) {
        System.out.println("Ürün eklendi : " + product.getName());
        System.out.println("Ürün açıklaması : " + product.getDescription());
        System.out.println("Ürün fiyatı : " + product.getPrice());
        System.out.println("Ürün stok adeti : " + product.getStockAmount());
    }
}
